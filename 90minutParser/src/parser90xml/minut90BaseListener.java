// Generated from minut90.g4 by ANTLR 4.5
package parser90xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link minut90Listener}, which
 * can be extended to create a listener which only needs to handle a subset of
 * the available methods.
 */
public class minut90BaseListener implements minut90Listener {

	private PrintWriter pw;
	private StringBuilder sb;
	private String leagueName;

	public minut90BaseListener() {
		try {
			pw = new PrintWriter(new File("ligaXML"));
			sb = new StringBuilder();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void enterR(minut90Parser.RContext ctx) {

	}

	@Override
	public void exitR(minut90Parser.RContext ctx) {
		pw.write(sb.toString());
		pw.close();

	}

	public String getLeagueName(minut90Parser.LigaContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterLiga(minut90Parser.LigaContext ctx) {
		sb.append("<liga name=##>");
	}

	@Override
	public void exitLiga(minut90Parser.LigaContext ctx) {
		leagueName = getLeagueName(ctx) + ">";
		sb.append("\n");
		sb.append("</liga>");
		int index = sb.indexOf("##");
		sb.replace(index, index + 2, getLeagueName(ctx));
	}

	@Override
	public void enterDruzyny(minut90Parser.DruzynyContext ctx) {
	}

	@Override
	public void exitDruzyny(minut90Parser.DruzynyContext ctx) {

	}

	public String getTeamName(minut90Parser.DruzynaContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterDruzyna(minut90Parser.DruzynaContext ctx) {
		sb.append("\n");
		sb.append("\t");
		sb.append("<druzyna name=###>");
	}

	@Override
	public void exitDruzyna(minut90Parser.DruzynaContext ctx) {
		sb.append("\n");
		sb.append("\t");
		sb.append("</druzyna>");
		int index = sb.indexOf("###");
		sb.replace(index, index + 3, getTeamName(ctx));
	}

	public String getMatches(minut90Parser.MeczeContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterMecze(minut90Parser.MeczeContext ctx) {
		sb.append("\n");
		sb.append("\t\t");
		sb.append("<mecz>");
	}

	@Override
	public void exitMecze(minut90Parser.MeczeContext ctx) {
		sb.append(getMatches(ctx) + "</mecze>");

	}

	public String getPoints(minut90Parser.PunktyContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterPunkty(minut90Parser.PunktyContext ctx) {
		sb.append("\n");
		sb.append("\t\t");
		sb.append("<punkty>");
	}

	@Override
	public void exitPunkty(minut90Parser.PunktyContext ctx) {
		sb.append(getPoints(ctx) + "</punkty>");
	}

	public String getWins(minut90Parser.ZwyciestwaContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterZwyciestwa(minut90Parser.ZwyciestwaContext ctx) {
		sb.append("\n");
		sb.append("\t\t");
		sb.append("<zwyciestwa>");
	}

	@Override
	public void exitZwyciestwa(minut90Parser.ZwyciestwaContext ctx) {
		sb.append(getWins(ctx) + "</zwyciestwa>");
	}

	public String getDraws(minut90Parser.RemisyContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterRemisy(minut90Parser.RemisyContext ctx) {
		sb.append("\n");
		sb.append("\t\t");
		sb.append("<remisy>");
	}

	@Override
	public void exitRemisy(minut90Parser.RemisyContext ctx) {
		sb.append(getDraws(ctx) + "</remisy>");
	}

	public String getLoses(minut90Parser.PorazkiContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterPorazki(minut90Parser.PorazkiContext ctx) {
		sb.append("\n");
		sb.append("\t\t");
		sb.append("<porazki>");
	}

	@Override
	public void exitPorazki(minut90Parser.PorazkiContext ctx) {
		sb.append(getLoses(ctx) + "</porazki>");
	}

	@Override
	public void enterBramki(minut90Parser.BramkiContext ctx) {
		sb.append("\n");
		sb.append("\t\t");
		sb.append("<bramki>");
	}

	@Override
	public void exitBramki(minut90Parser.BramkiContext ctx) {
		sb.append("\n");
		sb.append("\t\t");
		sb.append("</bramki>");

	}

	public String getScored(minut90Parser.StrzeloneContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterStrzelone(minut90Parser.StrzeloneContext ctx) {
		sb.append("\n");
		sb.append("\t\t\t");
		sb.append("<strzelone>");
	}

	public void exitStrzelone(minut90Parser.StrzeloneContext ctx) {
		sb.append(getScored(ctx) + "</strzelone>");
	}

	public String getLost(minut90Parser.StraconeContext ctx) {
		return ctx.getChild(2).toString();
	}

	@Override
	public void enterStracone(minut90Parser.StraconeContext ctx) {
		sb.append("\n");
		sb.append("\t\t\t");
		sb.append("<stracone>");
	}

	@Override
	public void exitStracone(minut90Parser.StraconeContext ctx) {
		sb.append(getLost(ctx) + "</stracone>");
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void visitTerminal(TerminalNode node) {
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
	}
}