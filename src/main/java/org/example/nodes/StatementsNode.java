package org.example.nodes;

import java.util.ArrayList;

public class StatementsNode extends ASTNode {
    public ArrayList<ASTNode> statements;
    public StatementsNode(ArrayList<ASTNode> statements, int line) {
        super("statements");
        this.statements = statements;
        this.line = line;
    }
}
