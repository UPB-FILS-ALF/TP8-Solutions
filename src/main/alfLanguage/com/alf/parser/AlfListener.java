// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlfParser}.
 */
public interface AlfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void enterMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multilineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void exitMultilineProg(AlfParser.MultilineProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlelineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void enterSinglelineProg(AlfParser.SinglelineProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singlelineProg}
	 * labeled alternative in {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void exitSinglelineProg(AlfParser.SinglelineProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationRule(AlfParser.DeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRule(AlfParser.ExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListRule(AlfParser.ListRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListRule(AlfParser.ListRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRule(AlfParser.FunctionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRule(AlfParser.FunctionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAttributionRule(AlfParser.AttributionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributionRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAttributionRule(AlfParser.AttributionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallRule(AlfParser.FunctionCallRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallRule}
	 * labeled alternative in {@link AlfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallRule(AlfParser.FunctionCallRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AlfParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFunctionCall}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableFunctionCall(AlfParser.VariableFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFunctionCall}
	 * labeled alternative in {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableFunctionCall(AlfParser.VariableFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(AlfParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeFloat(AlfParser.TypeFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeString(AlfParser.TypeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueInt(AlfParser.ValueIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueFloat(AlfParser.ValueFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueString(AlfParser.ValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueVariable(AlfParser.ValueVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueVariable}
	 * labeled alternative in {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueVariable(AlfParser.ValueVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(AlfParser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(AlfParser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMultiply}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultiply(AlfParser.ExpressionMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDivision}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDivision(AlfParser.ExpressionDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionSubtraction}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSubtraction(AlfParser.ExpressionSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionRem}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRem(AlfParser.ExpressionRemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionParanthesis}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParanthesis(AlfParser.ExpressionParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAddition}
	 * labeled alternative in {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAddition(AlfParser.ExpressionAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAttribution}
	 * labeled alternative in {@link AlfParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterVariableAttribution(AlfParser.VariableAttributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAttribution}
	 * labeled alternative in {@link AlfParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitVariableAttribution(AlfParser.VariableAttributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listDeclaration}
	 * labeled alternative in {@link AlfParser#list_declaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(AlfParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listDeclaration}
	 * labeled alternative in {@link AlfParser#list_declaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(AlfParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listValues}
	 * labeled alternative in {@link AlfParser#values}.
	 * @param ctx the parse tree
	 */
	void enterListValues(AlfParser.ListValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listValues}
	 * labeled alternative in {@link AlfParser#values}.
	 * @param ctx the parse tree
	 */
	void exitListValues(AlfParser.ListValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionContent}
	 * labeled alternative in {@link AlfParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionContent(AlfParser.FunctionContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionContent}
	 * labeled alternative in {@link AlfParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionContent(AlfParser.FunctionContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link AlfParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(AlfParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionParameter}
	 * labeled alternative in {@link AlfParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(AlfParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link AlfParser#return_function}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AlfParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link AlfParser#return_function}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AlfParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyReturn}
	 * labeled alternative in {@link AlfParser#return_function}.
	 * @param ctx the parse tree
	 */
	void enterEmptyReturn(AlfParser.EmptyReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyReturn}
	 * labeled alternative in {@link AlfParser#return_function}.
	 * @param ctx the parse tree
	 */
	void exitEmptyReturn(AlfParser.EmptyReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AlfParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AlfParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AlfParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AlfParser.FunctionCallContext ctx);
}