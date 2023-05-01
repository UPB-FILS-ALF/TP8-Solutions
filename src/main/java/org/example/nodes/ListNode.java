package org.example.nodes;

public class ListNode extends ASTNode{
    public String name;
    public ListValuesNode values;
    public ListNode(String type, String name, ListValuesNode values, int line) {
        super("list");
        this.values = values;
        this.name = name;
        this.type = type;
        this.line = line;
    }

}

