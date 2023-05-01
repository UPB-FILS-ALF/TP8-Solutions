package org.example.nodes;

public class TypeNode extends ASTNode {
    public String typeName;
    public TypeNode(String typeName, int line) {
        super("type");
        this.typeName = typeName;
        this.line = line;
    }
}
