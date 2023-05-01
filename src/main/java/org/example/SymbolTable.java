package org.example;

import org.example.nodes.ASTNode;
import org.example.nodes.ParameterNode;

import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTable {
    HashMap<String, VariableSymbolTable> symbolTable = new HashMap<>();
    public static SymbolTable stInstance = null;

    SymbolTable(){}

    public static synchronized SymbolTable getInstance() {
        if(stInstance == null) {
            stInstance = new SymbolTable();
        }
        return stInstance;
    }

    public void addVariableToSymbolTable(String variable, String type) {
        symbolTable.put(
                variable,
                new VariableSymbolTable(type, null)
        );
    }

    public boolean isVariableDefined(String variable) {
        return symbolTable.containsKey(variable);
    }

    public boolean checkTypes(ASTNode left, ASTNode right, String op) {
        if(left.type.equals("String") || right.type.equals("String")){
            if(op.equals("+")) return true;
        }
        else if((left.type.equals("float") && right.type.equals("int"))) {
            return true;
        }
        else if (left.type.equals("int") && right.type.equals("float")){
            return true;
        }
        else if(left.type.equals(right.type)) {
            return true;
        }
        return false;
    }

    public String getType(ASTNode left, ASTNode right, String op) {
        if(left.type.equals("String") || right.type.equals("String")){
            if(op.equals("+")) return "String";
        }
        else if((left.type.equals("float") && right.type.equals("int"))) {
            return "float";
        }
        else if (left.type.equals("int") && right.type.equals("float")){
            return "float";
        }
        else if(left.type.equals(right.type)) {
            return left.type;
        }
        return null;
    }

    public void addFunctionToSymbolTable(String functionName, ArrayList<ParameterNode> parameters){
        symbolTable.put(
               functionName,
               new VariableSymbolTable("functionParameters", parameters )
        );
//        for(int i = 0; i < parameters.size(); i++) {
//            symbolTable.put(
//                    parameters.get(i).name,
//                    new VariableSymbolTable("parameter", parameters.get(i).value)
//            );
//        }
    }
}

