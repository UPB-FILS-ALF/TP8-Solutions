package org.example.nodes;

public class ValueNode extends ASTNode {
    public Object value;
    public ValueNode(Object value, String type, int line) {
        super("value");
        this.value = value;
        this.type = type;
        this.line = line;
    }

}

