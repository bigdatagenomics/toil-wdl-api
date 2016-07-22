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
	 * Enter a parse tree produced by {@link WDLParser#task_section}.
	 * @param ctx the parse tree
	 */
	void enterTask_section(WDLParser.Task_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#task_section}.
	 * @param ctx the parse tree
	 */
	void exitTask_section(WDLParser.Task_sectionContext ctx);
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
	 * Enter a parse tree produced by {@link WDLParser#runtime_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRuntime_assignment(WDLParser.Runtime_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#runtime_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRuntime_assignment(WDLParser.Runtime_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#runtime_key}.
	 * @param ctx the parse tree
	 */
	void enterRuntime_key(WDLParser.Runtime_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#runtime_key}.
	 * @param ctx the parse tree
	 */
	void exitRuntime_key(WDLParser.Runtime_keyContext ctx);
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
	 * Enter a parse tree produced by {@link WDLParser#workflow_element}.
	 * @param ctx the parse tree
	 */
	void enterWorkflow_element(WDLParser.Workflow_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#workflow_element}.
	 * @param ctx the parse tree
	 */
	void exitWorkflow_element(WDLParser.Workflow_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(WDLParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(WDLParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#call_inputs}.
	 * @param ctx the parse tree
	 */
	void enterCall_inputs(WDLParser.Call_inputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#call_inputs}.
	 * @param ctx the parse tree
	 */
	void exitCall_inputs(WDLParser.Call_inputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#variable_mappings}.
	 * @param ctx the parse tree
	 */
	void enterVariable_mappings(WDLParser.Variable_mappingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#variable_mappings}.
	 * @param ctx the parse tree
	 */
	void exitVariable_mappings(WDLParser.Variable_mappingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#variable_mapping_kv}.
	 * @param ctx the parse tree
	 */
	void enterVariable_mapping_kv(WDLParser.Variable_mapping_kvContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#variable_mapping_kv}.
	 * @param ctx the parse tree
	 */
	void exitVariable_mapping_kv(WDLParser.Variable_mapping_kvContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#variable_mapping_key}.
	 * @param ctx the parse tree
	 */
	void enterVariable_mapping_key(WDLParser.Variable_mapping_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#variable_mapping_key}.
	 * @param ctx the parse tree
	 */
	void exitVariable_mapping_key(WDLParser.Variable_mapping_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(WDLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(WDLParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(WDLParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(WDLParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#scatter}.
	 * @param ctx the parse tree
	 */
	void enterScatter(WDLParser.ScatterContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#scatter}.
	 * @param ctx the parse tree
	 */
	void exitScatter(WDLParser.ScatterContext ctx);
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
	 * Enter a parse tree produced by {@link WDLParser#array_component_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_component_type(WDLParser.Array_component_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#array_component_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_component_type(WDLParser.Array_component_typeContext ctx);
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
	 * Enter a parse tree produced by {@link WDLParser#map_key_type}.
	 * @param ctx the parse tree
	 */
	void enterMap_key_type(WDLParser.Map_key_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#map_key_type}.
	 * @param ctx the parse tree
	 */
	void exitMap_key_type(WDLParser.Map_key_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDLParser#map_value_type}.
	 * @param ctx the parse tree
	 */
	void enterMap_value_type(WDLParser.Map_value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDLParser#map_value_type}.
	 * @param ctx the parse tree
	 */
	void exitMap_value_type(WDLParser.Map_value_typeContext ctx);
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
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(WDLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(WDLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(WDLParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(WDLParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionApplication}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApplication(WDLParser.FunctionApplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionApplication}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApplication(WDLParser.FunctionApplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(WDLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(WDLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivide(WDLParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivide(WDLParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(WDLParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(WDLParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(WDLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(WDLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative(WDLParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative(WDLParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(WDLParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(WDLParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(WDLParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(WDLParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code List}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterList(WDLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code List}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitList(WDLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEquals}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEquals(WDLParser.GreaterThanOrEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEquals}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEquals(WDLParser.GreaterThanOrEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality(WDLParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality(WDLParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(WDLParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(WDLParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayReference}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayReference(WDLParser.ArrayReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayReference}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayReference(WDLParser.ArrayReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulo(WDLParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulo(WDLParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEquals}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEquals(WDLParser.LessThanOrEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEquals}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEquals(WDLParser.LessThanOrEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Grouping}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(WDLParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Grouping}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(WDLParser.GroupingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(WDLParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(WDLParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFloat(WDLParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFloat(WDLParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(WDLParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(WDLParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Positive}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPositive(WDLParser.PositiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Positive}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPositive(WDLParser.PositiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(WDLParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(WDLParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(WDLParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(WDLParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Map}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMap(WDLParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Map}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMap(WDLParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inequality}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInequality(WDLParser.InequalityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inequality}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInequality(WDLParser.InequalityContext ctx);
}