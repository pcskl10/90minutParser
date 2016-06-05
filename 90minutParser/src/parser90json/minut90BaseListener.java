package parser90json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser90json.minut90Parser.MeczeContext;
import parser90json.minut90Parser.PorazkiContext;
import parser90json.minut90Parser.PunktyContext;
import parser90json.minut90Parser.RemisyContext;
import parser90json.minut90Parser.StraconeContext;
import parser90json.minut90Parser.StrzeloneContext;
import parser90json.minut90Parser.ZwyciestwaContext;
import parser90json.minut90Parser.DruzynyContext;;

public class minut90BaseListener implements minut90Listener {
	private StringBuilder sb;
	private String filename;
	private boolean druzyny;

	public minut90BaseListener(String filename) {
		numberOfTabs = 0;
		sb = new StringBuilder();
		this.filename = new String(filename);
		druzyny = false;
	}

	private int numberOfTabs;

	private String tabs() {
		StringBuilder lsb = new StringBuilder(numberOfTabs);
		for (int i = 0; i < numberOfTabs; ++i) {
			lsb.append('\t');
		}
		return lsb.toString();
	}

	private void writeSimpleStat(ParseTree pt) {
		sb.append("\"" + pt.getChild(0) + "\": " + pt.getChild(2) + "\n");
	}

	private String getSimpleName(ParseTree pt) {
		return "\"nazwa\": " + pt.getChild(2);
	}

	private boolean isSimpleStat(ParseTree pt) {
		if (pt instanceof MeczeContext)
			return true;
		if (pt instanceof PunktyContext)
			return true;
		if (pt instanceof ZwyciestwaContext)
			return true;
		if (pt instanceof RemisyContext)
			return true;
		if (pt instanceof PorazkiContext)
			return true;
		if (pt instanceof StrzeloneContext)
			return true;
		if (pt instanceof StraconeContext)
			return true;
		return false;
	}

	@Override
	public void enterR(minut90Parser.RContext ctx) {
		sb.append("{\n");
	}

	@Override
	public void exitR(minut90Parser.RContext ctx) {
		sb.append("}\n");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(filename));
			pw.write(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.close();
			}
		}
	}

	private String ligaString = "###_1_###";

	@Override
	public void enterLiga(minut90Parser.LigaContext ctx) {
		sb.append("\"liga\": {\n");
		sb.append(tabs() + ligaString + "\n");
	}

	@Override
	public void exitLiga(minut90Parser.LigaContext ctx) {
		int indexOf = sb.indexOf(ligaString);
		sb.replace(indexOf, indexOf + ligaString.length(), getSimpleName(ctx));
	}

	@Override
	public void enterDruzyny(minut90Parser.DruzynyContext ctx) {
		if (!druzyny) {
			druzyny = true;
			sb.append("\"druzyny\": [\n");
			++numberOfTabs;
		}
	}

	@Override
	public void exitDruzyny(minut90Parser.DruzynyContext ctx) {
		if (0 == numberOfTeams && druzyny) {
			--numberOfTabs;
			sb.append(tabs());
			sb.append("]\n");
			druzyny = false;
		}
	}

	private String druzynaString = "###_2_###";
	private int numberOfTeams = 0;

	@Override
	public void enterDruzyna(minut90Parser.DruzynaContext ctx) {
		++numberOfTeams;
		sb.append("\"druzyna\": {\n");
		sb.append(tabs() + druzynaString + "\n");
	}

	@Override
	public void exitDruzyna(minut90Parser.DruzynaContext ctx) {
		--numberOfTeams;
		int indexOf = sb.indexOf(druzynaString);
		sb.replace(indexOf, indexOf + druzynaString.length(), getSimpleName(ctx));
	}

	@Override
	public void enterMecze(minut90Parser.MeczeContext ctx) {
	}

	@Override
	public void exitMecze(minut90Parser.MeczeContext ctx) {
		writeSimpleStat(ctx);
	}

	@Override
	public void enterPunkty(minut90Parser.PunktyContext ctx) {
	}

	@Override
	public void exitPunkty(minut90Parser.PunktyContext ctx) {
		writeSimpleStat(ctx);
	}

	@Override
	public void enterZwyciestwa(minut90Parser.ZwyciestwaContext ctx) {
	}

	@Override
	public void exitZwyciestwa(minut90Parser.ZwyciestwaContext ctx) {
		writeSimpleStat(ctx);
	}

	@Override
	public void enterRemisy(minut90Parser.RemisyContext ctx) {
	}

	@Override
	public void exitRemisy(minut90Parser.RemisyContext ctx) {
		writeSimpleStat(ctx);
	}

	@Override
	public void enterPorazki(minut90Parser.PorazkiContext ctx) {
	}

	@Override
	public void exitPorazki(minut90Parser.PorazkiContext ctx) {
		writeSimpleStat(ctx);
	}

	@Override
	public void enterBramki(minut90Parser.BramkiContext ctx) {
		sb.append("\"bramki\": {\n");
	}

	@Override
	public void exitBramki(minut90Parser.BramkiContext ctx) {
	}

	@Override
	public void enterStrzelone(minut90Parser.StrzeloneContext ctx) {
	}

	@Override
	public void exitStrzelone(minut90Parser.StrzeloneContext ctx) {
		writeSimpleStat(ctx);
	}

	@Override
	public void enterStracone(minut90Parser.StraconeContext ctx) {
	}

	@Override
	public void exitStracone(minut90Parser.StraconeContext ctx) {
		writeSimpleStat(ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if(ctx instanceof DruzynyContext){
			if(!druzyny){
				sb.append(tabs());
			}
			return;
		}
		sb.append(tabs());
		if(!isSimpleStat(ctx)) {
			++numberOfTabs;
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		if (ctx instanceof DruzynyContext) {
			if(druzyny && 0 == numberOfTeams){
				--numberOfTabs;
			}
		} else if (!isSimpleStat(ctx)) {
			--numberOfTabs;
			sb.append(tabs() + "}\n");
		}
	}

	@Override
	public void visitTerminal(TerminalNode node) {
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		sb.append(tabs() + "[ERROR]\n");
	}
}