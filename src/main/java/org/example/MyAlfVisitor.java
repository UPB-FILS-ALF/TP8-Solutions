package org.example;

import com.alf.parser.AlfParser;
import com.alf.parser.AlfVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.example.nodes.*;

import java.util.ArrayList;

public class MyAlfVisitor extends AbstractParseTreeVisitor<ASTNode> implements AlfVisitor<ASTNode> {

    @Override
    public ASTNode visitMultilineProg(AlfParser.MultilineProgContext ctx) {
        ArrayList<ASTNode> statements = new ArrayList<>();
        for(AlfParser.StatementContext statement : ctx.statement()){
            statements.add(this.visit(statement));
        }
        if(statements.size() != 0){
            return new StatementsNode(statements, 1);
        }
        else {
            throw new Error();
        }
    }

    @Override
    public ASTNode visitSinglelineProg(AlfParser.SinglelineProgContext ctx) {
        ArrayList<ASTNode> sn = new ArrayList<ASTNode>();
        sn.add(this.visit(ctx.statement()));
        return new StatementsNode(sn, 1);
    }

    @Override
    public ASTNode visitDeclarationRule(AlfParser.DeclarationRuleContext ctx) {
        return this.visit(ctx.declaration());
    }

    @Override
    public ASTNode visitExpressionRule(AlfParser.ExpressionRuleContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public ASTNode visitListRule(AlfParser.ListRuleContext ctx) {
        return this.visit(ctx.list_declaration());
    }

    @Override
    public ASTNode visitFunctionRule(AlfParser.FunctionRuleContext ctx) {
        return this.visit(ctx.function_declaration());
    }

    @Override
    public ASTNode visitAttributionRule(AlfParser.AttributionRuleContext ctx) {
        return this.visit(ctx.attribution());
    }

    @Override
    public ASTNode visitFunctionCallRule(AlfParser.FunctionCallRuleContext ctx) {
        return this.visit(ctx.function_call());
    }

    @Override
    public ASTNode visitVariableDeclaration(AlfParser.VariableDeclarationContext ctx) {
        if(SymbolTable.getInstance().isVariableDefined(ctx.VARIABLE().getText())){
            throw new Error("Error(VariableDeclaration) : Variable already defined");
        }else{
            SymbolTable.getInstance().addVariableToSymbolTable(ctx.VARIABLE().getText(),((TypeNode)this.visit(ctx.type())).typeName );
        }
        return new DeclarationNode(
                ((TypeNode) this.visit(ctx.type())).typeName,
                ctx.VARIABLE().getText(),
                this.visit(ctx.expression()),
                ctx.VARIABLE().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitVariableFunctionCall(AlfParser.VariableFunctionCallContext ctx) {
        if(SymbolTable.getInstance().isVariableDefined(ctx.VARIABLE().getText())){
            throw new Error("Error(VariableFunctionCall) : Variable already defined");
        }else{
            SymbolTable.getInstance().addVariableToSymbolTable(ctx.VARIABLE().getText(),((TypeNode)this.visit(ctx.type())).typeName );
        }
        return new DeclarationNode(
                ((TypeNode) this.visit(ctx.type())).typeName,
                ctx.VARIABLE().getText(),
                this.visit(ctx.function_call()),
                ctx.VARIABLE().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitTypeInt(AlfParser.TypeIntContext ctx) {
        return new TypeNode(
                ctx.INT().getText(),
                ctx.INT().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitTypeFloat(AlfParser.TypeFloatContext ctx) {
        return new TypeNode(
                ctx.FLOAT().getText(),
                ctx.FLOAT().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitTypeString(AlfParser.TypeStringContext ctx) {
        return new TypeNode(
                ctx.STRING().getText(),
                ctx.STRING().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitValueInt(AlfParser.ValueIntContext ctx) {
        return new ValueNode(
                Integer.parseInt(ctx.INT_NUMBER().getText()),
                "int",
                ctx.INT_NUMBER().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitValueFloat(AlfParser.ValueFloatContext ctx) {
        return new ValueNode(
                Float.parseFloat(ctx.FLOAT_NUMBER().getText()),
                "float",
                ctx.FLOAT_NUMBER().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitValueString(AlfParser.ValueStringContext ctx) {
        return new ValueNode(
                ctx.STRING_TEXT().getText(),
                "String",
                ctx.STRING_TEXT().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitValueVariable(AlfParser.ValueVariableContext ctx) {
//        System.out.println(ctx.VARIABLE().getText());
//        System.out.println( SymbolTable.getInstance().symbolTable);
        String type = "";
        if(SymbolTable.getInstance().isVariableDefined(ctx.VARIABLE().getText())){
            type = SymbolTable.getInstance().symbolTable.get(ctx.VARIABLE().getText()).type;
        }
        else {
            type = "variable";
        }
        return new ValueNode(
                ctx.VARIABLE().getText(),
                type,
                ctx.VARIABLE().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitExpressionValue(AlfParser.ExpressionValueContext ctx) {
        ASTNode value = this.visit(ctx.value());
        if (value != null) {
            return new ValueNode(((ValueNode) this.visit(ctx.value())).value, ((ValueNode) this.visit(ctx.value())).type, ctx.value().start.getLine());
        }
        else throw new Error();
    }

    @Override
    public ASTNode visitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        String type = "";
        if(SymbolTable.getInstance().checkTypes(left, right, op) == true) {
            type = SymbolTable.getInstance().getType(left, right, op);
        }
        else {
            throw new Error("Error(ExpressionMultiply) : Expression members types do not match");
        }

        return new ExpressionNode(
                left,
                right,
                op,
                type,
                ctx.op.getLine()
        );
    }

    @Override
    public ASTNode visitExpressionDivision(AlfParser.ExpressionDivisionContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        String type = "";
        if(SymbolTable.getInstance().checkTypes(left, right, op) == true) {
            type = SymbolTable.getInstance().getType(left, right, op);
        }
        else {
            throw new Error("Error(ExpressionDivision) : Expression members types do not match");
        }
        return new ExpressionNode(
                left,
                right,
                op,
                type,
                ctx.op.getLine()
        );
    }

    @Override
    public ASTNode visitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        String type = "";
        if(SymbolTable.getInstance().checkTypes(left, right, op) == true) {
            type = SymbolTable.getInstance().getType(left, right, op);
        }
        else {
            throw new Error("Error(ExpressionSubstraction) : Expression members types do not match");
        }
        return new ExpressionNode(
                left,
                right,
                op,
                type,
                ctx.op.getLine()
        );
    }

    @Override
    public ASTNode visitExpressionRem(AlfParser.ExpressionRemContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        String type = "";
        if(SymbolTable.getInstance().checkTypes(left, right, op) == true) {
            type = SymbolTable.getInstance().getType(left, right, op);
        }
        else {
            throw new Error("Error(ExpressionRem) : Expression members types do not match");
        }
        return new ExpressionNode(
                left,
                right,
                op,
                type,
                ctx.op.getLine()
        );
    }

    @Override
    public ASTNode visitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public ASTNode visitExpressionAddition(AlfParser.ExpressionAdditionContext ctx) {
        ASTNode left = this.visit(ctx.expression(0));
        ASTNode right = this.visit(ctx.expression(1));
        String op = ctx.op.getText();
        String type = "";
        if(SymbolTable.getInstance().checkTypes(left, right, op) == true) {
            type = SymbolTable.getInstance().getType(left, right, op);
        }
        else {
            throw new Error("Error(ExpressionAddition) "+left.type +", "+ right.type +": Expression members types do not match");
        }
        return new ExpressionNode(
                left,
                right,
                op,
                type,
                ctx.op.getLine()
        );
    }

    @Override
    public ASTNode visitVariableAttribution(AlfParser.VariableAttributionContext ctx) {
        if(SymbolTable.getInstance().isVariableDefined(ctx.VARIABLE().getText())){
            throw new Error("Error(VariableAttribution) : Variable already defined");
        }else{
            SymbolTable.getInstance().addVariableToSymbolTable(ctx.VARIABLE().getText(),(this.visit(ctx.expression())).type);
        }
        ASTNode en = this.visit(ctx.expression());
        if(SymbolTable.getInstance().isVariableDefined(ctx.VARIABLE().getText())){
            en.type = SymbolTable.getInstance().symbolTable.get(ctx.VARIABLE().getText()).type;
        }
        else {
            throw new Error("Error(VariableAttribution) : Variable not defined");
        }
        return new AttributionNode(
                ctx.VARIABLE().getText(),
                this.visit(ctx.expression()),
                ctx.VARIABLE().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitListDeclaration(AlfParser.ListDeclarationContext ctx) {
        return new ListNode(
                "list",
                ctx.VARIABLE().getText(),
                (ListValuesNode) this.visit(ctx.values()),
                ctx.VARIABLE().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitListValues(AlfParser.ListValuesContext ctx) {
        ArrayList<ValueNode> values = new ArrayList<>();
        for(int i = 0; i < ctx.value().size(); i++) {
            ValueNode vn = (ValueNode) this.visit(ctx.value(i));
            values.add(i, new ValueNode(vn.value, vn.type, vn.line));
        }
        if(values != null) {
            return new ListValuesNode(
                    values,
                    values.get(0).line
            );
        }
        else throw new Error();
    }

    @Override
    public ASTNode visitFunctionContent(AlfParser.FunctionContentContext ctx) {
        ArrayList<ParameterNode> parameters = new ArrayList<>();
        for(int i = 0; i < ctx.parameter().size(); i++){
            ParameterNode pn = (ParameterNode) this.visit(ctx.parameter(i));
            parameters.add(i, new ParameterNode(pn.name, pn.type, pn.value, pn.line));
        }
        ArrayList<ASTNode> instructions = new ArrayList<>();
        for(int i = 0; i < ctx.statement().size(); i++){
            instructions.add(i, this.visit(ctx.statement(i)));
        }
        if(!SymbolTable.getInstance().isVariableDefined(ctx.VARIABLE().getText())){
            SymbolTable.getInstance().addFunctionToSymbolTable(ctx.VARIABLE().getText(), parameters);
        }
        return new FunctionNode(
                ctx.VARIABLE().getText(),
                parameters,
                new StatementsNode(instructions, ctx.FUNCTION().getSymbol().getLine()),
                new ReturnNode(this.visit(ctx.return_function()), ctx.return_function().start.getLine()),
                ctx.FUNCTION().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitFunctionParameter(AlfParser.FunctionParameterContext ctx) {
        DeclarationNode dn = (DeclarationNode) this.visit(ctx.declaration());
        return new ParameterNode(
                dn.variable,
                dn.variableType,
                dn.value,
                ctx.declaration().start.getLine()
        );
    }

    @Override
    public ASTNode visitReturnStatement(AlfParser.ReturnStatementContext ctx) {
        return new ReturnNode(
                this.visit(ctx.statement()),
                ctx.statement().start.getLine()
        );
    }

    @Override
    public ASTNode visitEmptyReturn(AlfParser.EmptyReturnContext ctx) {
        return new ReturnNode(
                new EmptyNode(),
                ctx.RETURN().getSymbol().getLine()
        );
    }

    @Override
    public ASTNode visitFunctionCall(AlfParser.FunctionCallContext ctx) {
        ArrayList<ValueNode> values = new ArrayList<>();
        for(int i = 0; i < ctx.value().size(); i++){
            ValueNode vn = (ValueNode) this.visit(ctx.value(i));
            values.add(i, new ValueNode(vn.value, vn.type, vn.line));
        }
        return new FunctionCallNode(
                ctx.VARIABLE().getText(),
                values,
                ctx.VARIABLE().getSymbol().getLine()
        );
    }
}
