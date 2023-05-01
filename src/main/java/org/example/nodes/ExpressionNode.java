package org.example.nodes;

public class ExpressionNode extends ASTNode{
    public ASTNode left;
    public ASTNode right;
    public String op;

    public ExpressionNode(ASTNode left, ASTNode right, String op, String type, int line) {
        super("expression");
        this.left = left;
        this.right = right;
        this.op = op;
        this.line = line;
        this.type = type;
    }
    public ExpressionNode(ASTNode right, String op, int line) {
        super("expression");
        this.right = right;
        this.op = op;
        this.line = line;
    }
}
