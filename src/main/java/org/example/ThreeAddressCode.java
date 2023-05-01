package org.example;

import org.example.nodes.*;

import java.util.ArrayList;

public class ThreeAddressCode {
    static int variable_id = 0;
    ArrayList<String> results = new ArrayList<>();
    public String nextVarName(){
        return "var" + variable_id++;
    }
    public ArrayList<String> writeThreeAddressCode(ASTNode node){
        if(node.id.equals("statements")) {
            for(ASTNode statement : ((StatementsNode) node).statements){
                writeThreeAddressCode(statement);
            }
        } else if (node instanceof ValueNode) {
            node.result = ((ValueNode) node).value.toString();
        } else if(node instanceof ExpressionNode) {
            if(((ExpressionNode) node).left != null && ((ExpressionNode) node).right != null ) {
                writeThreeAddressCode(((ExpressionNode) node).left);
                writeThreeAddressCode(((ExpressionNode) node).right);

                /** TODO 4:
                 *  Compute the result to be the next variable
                 *  Log the result in T.A.C format
                 */
                node.result = nextVarName();
                results.add(node.result + " = " + ((ExpressionNode) node).left.result + " " + ((ExpressionNode) node).op + " " + ((ExpressionNode) node).right.result + "\n");

            }
        } else if(node instanceof AttributionNode) {
            /** TODO 5:
             *  Write T.A.C recursively for the right side of the node (value)
             *  Log the result in T.A.C format
             */
            writeThreeAddressCode(((AttributionNode) node).value);
            results.add(nextVarName() + " = " + ((AttributionNode) node).value.result + "\n");
        } else if(node instanceof FunctionCallNode) {
            /** TODO 6:
             *  Write T.A.C recursively for each parameter of the function
             *  Log the result in T.A.C format for function calls
             */
            for(int i = 0; i < ((FunctionCallNode) node).parameters.size(); i++) {
                writeThreeAddressCode(((FunctionCallNode) node).parameters.get(i));
            }
            String line = ((FunctionCallNode) node).functionName + "(";
            for(int i = 0; i < ((FunctionCallNode) node).parameters.size() - 1; i++) {
                line += ((FunctionCallNode) node).parameters.get(i).result + ", ";
            }
            line += ((FunctionCallNode) node).parameters.get(((FunctionCallNode) node).parameters.size()-1).result + ")\n";
            results.add(line);
        }
        return results;
    }
}
