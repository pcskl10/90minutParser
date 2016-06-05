package parser90json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Generated from minut90.g4 by ANTLR 4.5

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link minut90Listener}, which
 * can be extended to create a listener which only needs to handle a subset of
 * the available methods.
 */
public class minut90BaseListener implements minut90Listener {
	private PrintWriter pw;
	private minut90Parser parser;
	private Vocabulary vocabulary;

	public minut90BaseListener(minut90Parser parser) {
		try {
			pw = new PrintWriter(new File("liga.90minut"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		numberOfTabs = 0;
		this.parser = parser;
		this.vocabulary = parser.getVocabulary();
	}

	private int numberOfTabs;

	private String tabs() {
		StringBuilder sb = new StringBuilder(numberOfTabs);
		for (int i = 0; i < numberOfTabs; ++i) {
			sb.append('\t');
		}
		return sb.toString();
	}

	private void writeSimpleStat(ParseTree pt) {
		pw.write("\"" + pt.getChild(0) + "\": " + pt.getChild(2) + "\n");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterR(minut90Parser.RContext ctx) {
		pw.write("{\n");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitR(minut90Parser.RContext ctx) {
		pw.write("}\n");
		pw.close();
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterLiga(minut90Parser.LigaContext ctx) {
		pw.write("\"liga\": {\n");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitLiga(minut90Parser.LigaContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDruzyny(minut90Parser.DruzynyContext ctx) {
		pw.write("\"druzyny\": {\n");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDruzyny(minut90Parser.DruzynyContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDruzyna(minut90Parser.DruzynaContext ctx) {
		pw.write("\"druzyna\": {\n");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDruzyna(minut90Parser.DruzynaContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMecze(minut90Parser.MeczeContext ctx) {
//		pw.write(tabs());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMecze(minut90Parser.MeczeContext ctx) {
		writeSimpleStat(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPunkty(minut90Parser.PunktyContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPunkty(minut90Parser.PunktyContext ctx) {
		writeSimpleStat(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterZwyciestwa(minut90Parser.ZwyciestwaContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitZwyciestwa(minut90Parser.ZwyciestwaContext ctx) {
		writeSimpleStat(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterRemisy(minut90Parser.RemisyContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitRemisy(minut90Parser.RemisyContext ctx) {
		writeSimpleStat(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPorazki(minut90Parser.PorazkiContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPorazki(minut90Parser.PorazkiContext ctx) {
		writeSimpleStat(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterBramki(minut90Parser.BramkiContext ctx) {
		pw.write("\"bramki\": {\n");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitBramki(minut90Parser.BramkiContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterStrzelone(minut90Parser.StrzeloneContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitStrzelone(minut90Parser.StrzeloneContext ctx) {
		writeSimpleStat(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterStracone(minut90Parser.StraconeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitStracone(minut90Parser.StraconeContext ctx) {
		writeSimpleStat(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		pw.write(tabs());
		++numberOfTabs;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		--numberOfTabs;
//		if(ctx.)
		pw.write(tabs() + "}\n");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitTerminal(TerminalNode node) {
		// pw.write(tabs());
		// // pw.write(node.getText());
		//
		// Token t = node.getSymbol();
		// switch (t.getType()) {
		// case minut90Parser.MECZE:
		// case minut90Parser.ZWYCIESTWA:
		// case minut90Parser.PORAZKI:
		// case minut90Parser.REMISY:
		// case minut90Parser.PUNKTY:
		// pw.write("\"" + vocabulary.getSymbolicName(t.getType()).toLowerCase()
		// + "\": " + t.getText());
		// break;
		// default:
		// pw.write("[DD]");
		// break;
		// }
		//
		// pw.write("\n");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitErrorNode(ErrorNode node) {
		pw.write(tabs() + "[ERROR]\n");
	}
}