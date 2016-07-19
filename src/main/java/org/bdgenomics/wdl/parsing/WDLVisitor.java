// Generated from WDL.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WDLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(WDLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#wdlimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWdlimport(WDLParser.WdlimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#import_location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_location(WDLParser.Import_locationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(WDLParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(WDLParser.TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#task_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_name(WDLParser.Task_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(WDLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#task_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_section(WDLParser.Task_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(WDLParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#command_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_part(WDLParser.Command_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#command_part_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_part_string(WDLParser.Command_part_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#command_part_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_part_var(WDLParser.Command_part_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#var_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_option(WDLParser.Var_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#var_option_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_option_key(WDLParser.Var_option_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#var_option_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_option_value(WDLParser.Var_option_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#task_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_output(WDLParser.Task_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#output_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_assignment(WDLParser.Output_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#output_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_name(WDLParser.Output_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#output_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_value(WDLParser.Output_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#runtime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntime(WDLParser.RuntimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#parameter_meta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_meta(WDLParser.Parameter_metaContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#meta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeta(WDLParser.MetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#workflow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkflow(WDLParser.WorkflowContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WDLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(WDLParser.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(WDLParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type(WDLParser.Object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#map_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_type(WDLParser.Map_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#type_postfix_quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_postfix_quantifier(WDLParser.Type_postfix_quantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(WDLParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(WDLParser.ExpressionContext ctx);
}