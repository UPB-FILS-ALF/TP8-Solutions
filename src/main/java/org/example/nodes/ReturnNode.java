package org.example.nodes;

public class ReturnNode extends ASTNode {
    public ASTNode statement;
    public ReturnNode(ASTNode statement, int line) {
        super("return");
        this.statement = statement;
        this.line = line;
    }

}

