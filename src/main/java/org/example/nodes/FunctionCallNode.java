package org.example.nodes;

import java.util.ArrayList;

public class FunctionCallNode extends ASTNode {
    public String functionName;
    public ArrayList<ValueNode> parameters;

    public FunctionCallNode(String functionName, ArrayList<ValueNode> parameters, int line) {
        super("functionCall");
        this.functionName = functionName;
        this.parameters = parameters;
        this.line = line;
    }
}
