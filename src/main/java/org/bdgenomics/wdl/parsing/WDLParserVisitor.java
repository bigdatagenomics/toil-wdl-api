// Generated from WDLParser.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WDLParserVisitor<T> extends ParseTreeVisitor<T> {
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
	 * Visit a parse tree produced by {@link WDLParser#command_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_body(WDLParser.Command_bodyContext ctx);
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
	 * Visit a parse tree produced by {@link WDLParser#runtime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntime(WDLParser.RuntimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#runtime_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntime_assignment(WDLParser.Runtime_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#runtime_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntime_key(WDLParser.Runtime_keyContext ctx);
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
	 * Visit a parse tree produced by {@link WDLParser#workflow_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkflow_name(WDLParser.Workflow_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#workflow_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkflow_element(WDLParser.Workflow_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(WDLParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#call_inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_inputs(WDLParser.Call_inputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#variable_mappings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_mappings(WDLParser.Variable_mappingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#variable_mapping_kv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_mapping_kv(WDLParser.Variable_mapping_kvContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#variable_mapping_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_mapping_key(WDLParser.Variable_mapping_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(WDLParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(WDLParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#scatter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScatter(WDLParser.ScatterContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WDLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#type_postfix_quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_postfix_quantifier(WDLParser.Type_postfix_quantifierContext ctx);
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
	 * Visit a parse tree produced by {@link WDLParser#array_component_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_component_type(WDLParser.Array_component_typeContext ctx);
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
	 * Visit a parse tree produced by {@link WDLParser#map_key_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_key_type(WDLParser.Map_key_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#map_value_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_value_type(WDLParser.Map_value_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDLParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(WDLParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(WDLParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(WDLParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionApplication}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionApplication(WDLParser.FunctionApplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(WDLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(WDLParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(WDLParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(WDLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(WDLParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(WDLParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(WDLParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code List}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(WDLParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOrEquals}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEquals(WDLParser.GreaterThanOrEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(WDLParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(WDLParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayReference}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayReference(WDLParser.ArrayReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(WDLParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEquals}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEquals(WDLParser.LessThanOrEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Grouping}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(WDLParser.GroupingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(WDLParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(WDLParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(WDLParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Positive}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive(WDLParser.PositiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(WDLParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(WDLParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Map}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(WDLParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Inequality}
	 * labeled alternative in {@link WDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequality(WDLParser.InequalityContext ctx);
}