// Generated from WDL.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl.parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WDLParser}.
 */
public interface WDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WDLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(WDLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(WDLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#wdlimport}.
	 * @param ctx the parse tree
	 */
	void enterWdlimport(WDLParser.WdlimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#wdlimport}.
	 * @param ctx the parse tree
	 */
	void exitWdlimport(WDLParser.WdlimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#import_location}.
	 * @param ctx the parse tree
	 */
	void enterImport_location(WDLParser.Import_locationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#import_location}.
	 * @param ctx the parse tree
	 */
	void exitImport_location(WDLParser.Import_locationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(WDLParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(WDLParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(WDLParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(WDLParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#task_name}.
	 * @param ctx the parse tree
	 */
	void enterTask_name(WDLParser.Task_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#task_name}.
	 * @param ctx the parse tree
	 */
	void exitTask_name(WDLParser.Task_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(WDLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(WDLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#task_sections}.
	 * @param ctx the parse tree
	 */
	void enterTask_sections(WDLParser.Task_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#task_sections}.
	 * @param ctx the parse tree
	 */
	void exitTask_sections(WDLParser.Task_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(WDLParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(WDLParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#command_part}.
	 * @param ctx the parse tree
	 */
	void enterCommand_part(WDLParser.Command_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#command_part}.
	 * @param ctx the parse tree
	 */
	void exitCommand_part(WDLParser.Command_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#command_part_string}.
	 * @param ctx the parse tree
	 */
	void enterCommand_part_string(WDLParser.Command_part_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#command_part_string}.
	 * @param ctx the parse tree
	 */
	void exitCommand_part_string(WDLParser.Command_part_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#command_part_var}.
	 * @param ctx the parse tree
	 */
	void enterCommand_part_var(WDLParser.Command_part_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#command_part_var}.
	 * @param ctx the parse tree
	 */
	void exitCommand_part_var(WDLParser.Command_part_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#var_option}.
	 * @param ctx the parse tree
	 */
	void enterVar_option(WDLParser.Var_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#var_option}.
	 * @param ctx the parse tree
	 */
	void exitVar_option(WDLParser.Var_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#var_option_key}.
	 * @param ctx the parse tree
	 */
	void enterVar_option_key(WDLParser.Var_option_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#var_option_key}.
	 * @param ctx the parse tree
	 */
	void exitVar_option_key(WDLParser.Var_option_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#var_option_value}.
	 * @param ctx the parse tree
	 */
	void enterVar_option_value(WDLParser.Var_option_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#var_option_value}.
	 * @param ctx the parse tree
	 */
	void exitVar_option_value(WDLParser.Var_option_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#task_output}.
	 * @param ctx the parse tree
	 */
	void enterTask_output(WDLParser.Task_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#task_output}.
	 * @param ctx the parse tree
	 */
	void exitTask_output(WDLParser.Task_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#output_assignment}.
	 * @param ctx the parse tree
	 */
	void enterOutput_assignment(WDLParser.Output_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#output_assignment}.
	 * @param ctx the parse tree
	 */
	void exitOutput_assignment(WDLParser.Output_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#output_name}.
	 * @param ctx the parse tree
	 */
	void enterOutput_name(WDLParser.Output_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#output_name}.
	 * @param ctx the parse tree
	 */
	void exitOutput_name(WDLParser.Output_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#output_value}.
	 * @param ctx the parse tree
	 */
	void enterOutput_value(WDLParser.Output_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#output_value}.
	 * @param ctx the parse tree
	 */
	void exitOutput_value(WDLParser.Output_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#runtime}.
	 * @param ctx the parse tree
	 */
	void enterRuntime(WDLParser.RuntimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#runtime}.
	 * @param ctx the parse tree
	 */
	void exitRuntime(WDLParser.RuntimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#parameter_meta}.
	 * @param ctx the parse tree
	 */
	void enterParameter_meta(WDLParser.Parameter_metaContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#parameter_meta}.
	 * @param ctx the parse tree
	 */
	void exitParameter_meta(WDLParser.Parameter_metaContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#meta}.
	 * @param ctx the parse tree
	 */
	void enterMeta(WDLParser.MetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#meta}.
	 * @param ctx the parse tree
	 */
	void exitMeta(WDLParser.MetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#workflow}.
	 * @param ctx the parse tree
	 */
	void enterWorkflow(WDLParser.WorkflowContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#workflow}.
	 * @param ctx the parse tree
	 */
	void exitWorkflow(WDLParser.WorkflowContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WDLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WDLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(WDLParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(WDLParser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(WDLParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(WDLParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_type(WDLParser.Object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_type(WDLParser.Object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#map_type}.
	 * @param ctx the parse tree
	 */
	void enterMap_type(WDLParser.Map_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#map_type}.
	 * @param ctx the parse tree
	 */
	void exitMap_type(WDLParser.Map_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#type_postfix_quantifier}.
	 * @param ctx the parse tree
	 */
	void enterType_postfix_quantifier(WDLParser.Type_postfix_quantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#type_postfix_quantifier}.
	 * @param ctx the parse tree
	 */
	void exitType_postfix_quantifier(WDLParser.Type_postfix_quantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(WDLParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(WDLParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WDLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WDLParser.ExpressionContext ctx);
}