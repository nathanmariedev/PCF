// Generated from /Users/nathan/Documents/IMT/1A/NOYE/PCF/src/parser/PCF.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PCFParser}.
 */
public interface PCFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PCFParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PCFParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCFParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PCFParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOp2}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBinOp2(PCFParser.BinOp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp2}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBinOp2(PCFParser.BinOp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code App}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterApp(PCFParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code App}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitApp(PCFParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCond(PCFParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCond(PCFParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOp1}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBinOp1(PCFParser.BinOp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp1}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBinOp1(PCFParser.BinOp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Fix}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFix(PCFParser.FixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fix}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFix(PCFParser.FixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLit(PCFParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLit(PCFParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterParens(PCFParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitParens(PCFParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVar(PCFParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVar(PCFParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Let}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLet(PCFParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLet(PCFParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fun}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFun(PCFParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fun}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFun(PCFParser.FunContext ctx);
}