// Generated from WDL.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl;
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
	 * Visit a parse tree produced by {@link WDL#wdl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWdl(WDL.WdlContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#workflow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkflow(WDL.WorkflowContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(WDL.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#assignment_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_block(WDL.Assignment_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(WDL.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(WDL.TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(WDL.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link WDL#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(WDL.OutputContext ctx);
}