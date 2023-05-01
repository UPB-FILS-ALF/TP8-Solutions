package org.example.nodes;

import java.util.ArrayList;

public class ListValuesNode extends ASTNode {
    public ArrayList<ValueNode> values;
    public ListValuesNode(ArrayList<ValueNode> values, int line) {
        super("listValues");
        this.values = values;
        this.line = line;
    }
}
