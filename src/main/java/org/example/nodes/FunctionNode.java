package org.example.nodes;

import java.util.ArrayList;

public class FunctionNode extends ASTNode{
    public String functionName;
    public ArrayList<ParameterNode> parameters;
    public StatementsNode instructions;
    public ReturnNode returnNode;

    public FunctionNode(String functionName, ArrayList<ParameterNode> parameters, StatementsNode instructions, ReturnNode returnNode, int line) {
        super("function");
        this.line = line;
        this.functionName = functionName;
        this.parameters = parameters;
        this.instructions = instructions;
        this.returnNode = returnNode;
    }
}
