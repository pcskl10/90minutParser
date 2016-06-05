package parser90;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link minut90Parser}.
 */
public interface minut90Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link minut90Parser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(minut90Parser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link minut90Parser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(minut90Parser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link minut90Parser#liga}.
	 * @param ctx the parse tree
	 */
	void enterLiga(minut90Parser.LigaContext ctx);
	/**
	 * Exit a parse tree produced by {@link minut90Parser#liga}.
	 * @param ctx the parse tree
	 */
	void exitLiga(minut90Parser.LigaContext ctx);
	/**
	 * Enter a parse tree produced by {@link minut90Parser#druzyny}.
	 * @param ctx the parse tree
	 */
	void enterDruzyny(minut90Parser.DruzynyContext ctx);
	/**
	 * Exit a parse tree produced by {@link minut90Parser#druzyny}.
	 * @param ctx the parse tree
	 */
	void exitDruzyny(minut90Parser.DruzynyContext ctx);
	/**
	 * Enter a parse tree produced by {@link minut90Parser#druzyna}.
	 * @param ctx the parse tree
	 */
	void enterDruzyna(minut90Parser.DruzynaContext ctx);
	/**
	 * Exit a parse tree produced by {@link minut90Parser#druzyna}.
	 * @param ctx the parse tree
	 */
	void exitDruzyna(minut90Parser.DruzynaContext ctx);
	/**
	 * Enter a parse tree produced by {@link minut90Parser#bramki}.
	 * @param ctx the parse tree
	 */
	void enterBramki(minut90Parser.BramkiContext ctx);
	/**
	 * Exit a parse tree produced by {@link minut90Parser#bramki}.
	 * @param ctx the parse tree
	 */
	void exitBramki(minut90Parser.BramkiContext ctx);
}