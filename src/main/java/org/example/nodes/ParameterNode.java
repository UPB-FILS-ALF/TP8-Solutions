package org.example.nodes;

public class ParameterNode extends ASTNode {
    public Object value;
    public String name;

    public ParameterNode(String name, String type, Object value, int line) {
        super("functionParameter");
        this.name = name;
        this.type = type;
        this.value = value;
        this.line = line;
    }
}
