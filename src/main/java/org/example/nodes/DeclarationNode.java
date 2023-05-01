package org.example.nodes;

public class DeclarationNode extends ASTNode{
    public String variableType;
    public String variable;
    public ASTNode value;
    public DeclarationNode(String variableType, String variable, ASTNode value, int line) {
        super("declaration");
        this.variableType = variableType;
        this.variable = variable;
        this.value = value;
        this.line = line;
    }
}
