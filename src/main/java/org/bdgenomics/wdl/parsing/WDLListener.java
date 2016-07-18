// Generated from WDL.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl.parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WDL}.
 */
public interface WDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WDL#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(WDL.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(WDL.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#wdlimport}.
	 * @param ctx the parse tree
	 */
	void enterWdlimport(WDL.WdlimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#wdlimport}.
	 * @param ctx the parse tree
	 */
	void exitWdlimport(WDL.WdlimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#import_location}.
	 * @param ctx the parse tree
	 */
	void enterImport_location(WDL.Import_locationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#import_location}.
	 * @param ctx the parse tree
	 */
	void exitImport_location(WDL.Import_locationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(WDL.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(WDL.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(WDL.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(WDL.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#task_name}.
	 * @param ctx the parse tree
	 */
	void enterTask_name(WDL.Task_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#task_name}.
	 * @param ctx the parse tree
	 */
	void exitTask_name(WDL.Task_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#task_sections}.
	 * @param ctx the parse tree
	 */
	void enterTask_sections(WDL.Task_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#task_sections}.
	 * @param ctx the parse tree
	 */
	void exitTask_sections(WDL.Task_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#workflow}.
	 * @param ctx the parse tree
	 */
	void enterWorkflow(WDL.WorkflowContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#workflow}.
	 * @param ctx the parse tree
	 */
	void exitWorkflow(WDL.WorkflowContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WDL.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WDL.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(WDL.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(WDL.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(WDL.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(WDL.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#object_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_type(WDL.Object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#object_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_type(WDL.Object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#map_type}.
	 * @param ctx the parse tree
	 */
	void enterMap_type(WDL.Map_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#map_type}.
	 * @param ctx the parse tree
	 */
	void exitMap_type(WDL.Map_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#type_postfix_quantifier}.
	 * @param ctx the parse tree
	 */
	void enterType_postfix_quantifier(WDL.Type_postfix_quantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#type_postfix_quantifier}.
	 * @param ctx the parse tree
	 */
	void exitType_postfix_quantifier(WDL.Type_postfix_quantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#fully_qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterFully_qualified_name(WDL.Fully_qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#fully_qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitFully_qualified_name(WDL.Fully_qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(WDL.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(WDL.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WDL.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WDL.ExpressionContext ctx);
}