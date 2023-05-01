package org.example.nodes;

public class AttributionNode extends ASTNode{

    public String variable;
    public ASTNode value;
    public AttributionNode(String variable, ASTNode value, int line) {
        super("attribution");
        this.variable = variable;
        this.value = value;
        this.line = line;
    }
}
