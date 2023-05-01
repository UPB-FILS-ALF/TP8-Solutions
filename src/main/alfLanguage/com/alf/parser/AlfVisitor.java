// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlelineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglelineProg(AlfParser.SinglelineProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRule(AlfParser.ListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionRule(AlfParser.FunctionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributionRule(AlfParser.AttributionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallRule(AlfParser.FunctionCallRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFunctionCall}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFunctionCall(AlfParser.VariableFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVariable(AlfParser.ValueVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(AlfParser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAttribution}
	 * labeled alternative in {@link AlfParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAttribution(AlfParser.VariableAttributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listDeclaration}
	 * labeled alternative in {@link AlfParser#list_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(AlfParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listValues}
	 * labeled alternative in {@link AlfParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValues(AlfParser.ListValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionContent}
	 * labeled alternative in {@link AlfParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionContent(AlfParser.FunctionContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link AlfParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(AlfParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link AlfParser#return_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AlfParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyReturn}
	 * labeled alternative in {@link AlfParser#return_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyReturn(AlfParser.EmptyReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AlfParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AlfParser.FunctionCallContext ctx);
}