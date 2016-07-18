// Generated from WDL.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WDL}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WDL#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(WDL.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#wdlimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWdlimport(WDL.WdlimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#import_location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_location(WDL.Import_locationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(WDL.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(WDL.TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#task_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_name(WDL.Task_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#task_sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_sections(WDL.Task_sectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#workflow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkflow(WDL.WorkflowContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WDL.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(WDL.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(WDL.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type(WDL.Object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#map_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_type(WDL.Map_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#type_postfix_quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_postfix_quantifier(WDL.Type_postfix_quantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#fully_qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFully_qualified_name(WDL.Fully_qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(WDL.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(WDL.ExpressionContext ctx);
}