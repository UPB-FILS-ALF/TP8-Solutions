package org.example.nodes;

public class VariableNode extends ASTNode {
    String variableName;
    VariableNode(String variableName, int line) {
        super("variable");
        this.variableName = variableName;
        this.line = line;
    }
}
