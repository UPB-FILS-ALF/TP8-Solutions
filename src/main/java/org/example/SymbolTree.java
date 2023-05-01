package org.example;

import org.example.nodes.ASTNode;

public class SymbolTree {
    ASTNode ast;
    SymbolTable symbolTable;

    public SymbolTree(ASTNode ast, SymbolTable symbolTable) {
        this.ast = ast;
        this.symbolTable = symbolTable;
    }
}
