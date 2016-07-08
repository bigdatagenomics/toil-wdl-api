// Generated from WDL.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WDL}.
 */
public interface WDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WDL#wdl}.
	 * @param ctx the parse tree
	 */
	void enterWdl(WDL.WdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#wdl}.
	 * @param ctx the parse tree
	 */
	void exitWdl(WDL.WdlContext ctx);
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
	 * Enter a parse tree produced by {@link WDL#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(WDL.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(WDL.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#assignment_block}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_block(WDL.Assignment_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#assignment_block}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_block(WDL.Assignment_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WDL.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WDL.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link WDL#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(WDL.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(WDL.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link WDL#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(WDL.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link WDL#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(WDL.OutputContext ctx);
}