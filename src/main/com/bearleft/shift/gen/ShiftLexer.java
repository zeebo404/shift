// Generated from R:/programming/shift/res\Shift.g4 by ANTLR 4.x
package com.bearleft.shift.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShiftLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, INTEGER_LITERAL=4, FLOAT_LITERAL=5, STRING_LITERAL=6, 
		WS=7, NEWLINE=8, COMMENT=9, LINE_COMMENT=10, CLASS=11, FOR=12, WHILE=13, 
		IF=14, ELSE=15, DEF=16, NEW=17, RETURN=18, STATIC=19, TRUE=20, FALSE=21, 
		NULL=22, LPAREN=23, RPAREN=24, LBRACKET=25, RBRACKET=26, SEMI=27, COMMA=28, 
		DOT=29, EQ=30, AMP=31, BAR=32, CARET=33, PERCENT=34, PLUS=35, SUB=36, 
		STAR=37, SLASH=38, BANG=39, TILDE=40, QUESTION=41, COLON=42, EQEQ=43, 
		SPACESHIP=44, AMPAMP=45, BARBAR=46, PLUSPLUS=47, SUBSUB=48, STARSTAR=49, 
		PLUSEQ=50, SUBEQ=51, STAREQ=52, SLASHEQ=53, AMPEQ=54, BAREQ=55, CARETEQ=56, 
		PERCENTEQ=57, BANGEQ=58, GT=59, LT=60, LTLT=61, GTGT=62, GTGTGT=63, LTE=64, 
		GTE=65, IDENTIFIER=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "'{'", "'}'", "INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
		"WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "'class'", "'for'", "'while'", 
		"'if'", "'else'", "'def'", "'new'", "'return'", "'static'", "'true'", 
		"'false'", "'null'", "'('", "')'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'&'", "'|'", "'^'", "'%'", "'+'", "'-'", "'*'", "'/'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<=>'", "'&&'", "'||'", "'++'", "'--'", 
		"'**'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'!='", "'>'", "'<'", "'<<'", "'>>'", "'>>>'", "'<='", "'>='", "IDENTIFIER"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "DecimalLiteral", "Exponent", "EscapeSequence", 
		"INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "WS", "NEWLINE", 
		"COMMENT", "LINE_COMMENT", "CLASS", "FOR", "WHILE", "IF", "ELSE", "DEF", 
		"NEW", "RETURN", "STATIC", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", 
		"LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "EQ", "AMP", "BAR", "CARET", 
		"PERCENT", "PLUS", "SUB", "STAR", "SLASH", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQEQ", "SPACESHIP", "AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", 
		"STARSTAR", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", 
		"CARETEQ", "PERCENTEQ", "BANGEQ", "GT", "LT", "LTLT", "GTGT", "GTGTGT", 
		"LTE", "GTE", "IDENTIFIER"
	};


	public ShiftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Shift.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u01be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\5\5\u009d\n"+
		"\5\3\6\3\6\5\6\u00a1\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ad"+
		"\n\7\3\b\3\b\3\b\7\b\u00b2\n\b\f\b\16\b\u00b5\13\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00bb\n\b\f\b\16\b\u00be\13\b\5\b\u00c0\n\b\3\t\3\t\3\t\7\t\u00c5\n\t"+
		"\f\t\16\t\u00c8\13\t\3\t\5\t\u00cb\n\t\3\t\3\t\3\t\5\t\u00d0\n\t\3\n\3"+
		"\n\3\n\7\n\u00d5\n\n\f\n\16\n\u00d8\13\n\3\n\3\n\3\n\3\n\7\n\u00de\n\n"+
		"\f\n\16\n\u00e1\13\n\3\n\5\n\u00e4\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\5\f\u00ed\n\f\3\r\3\r\3\r\3\r\7\r\u00f3\n\r\f\r\16\r\u00f6\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0101\n\16\f\16\16\16\u0104\13"+
		"\16\3\16\3\16\3\16\5\16\u0109\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\7F\u01ba"+
		"\nF\fF\16F\u01bd\13F\3\u00f4\2G\3\3\5\4\7\5\t\2\13\2\r\2\17\6\21\7\23"+
		"\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61"+
		"\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,"+
		"]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\177>\u0081?\u0083@"+
		"\u0085A\u0087B\u0089C\u008bD\3\2\17\3\2\63;\3\2\62;\4\2GGgg\4\2--//\n"+
		"\2$$))^^ddhhppttvv\3\2\629\5\2\62;C\\c|\6\2\f\f\17\17))^^\6\2\f\f\17\17"+
		"$$^^\5\2\13\13\16\16\"\"\4\2\f\f\17\17\6\2&&C\\aac|\7\2&&\62;C\\aac|\u01d2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u0090\3\2\2\2\7\u0092\3\2\2"+
		"\2\t\u009c\3\2\2\2\13\u009e\3\2\2\2\r\u00a4\3\2\2\2\17\u00bf\3\2\2\2\21"+
		"\u00cf\3\2\2\2\23\u00e3\3\2\2\2\25\u00e5\3\2\2\2\27\u00ec\3\2\2\2\31\u00ee"+
		"\3\2\2\2\33\u00fc\3\2\2\2\35\u010c\3\2\2\2\37\u0112\3\2\2\2!\u0116\3\2"+
		"\2\2#\u011c\3\2\2\2%\u011f\3\2\2\2\'\u0124\3\2\2\2)\u0128\3\2\2\2+\u012c"+
		"\3\2\2\2-\u0133\3\2\2\2/\u013a\3\2\2\2\61\u013f\3\2\2\2\63\u0145\3\2\2"+
		"\2\65\u014a\3\2\2\2\67\u014c\3\2\2\29\u014e\3\2\2\2;\u0150\3\2\2\2=\u0152"+
		"\3\2\2\2?\u0154\3\2\2\2A\u0156\3\2\2\2C\u0158\3\2\2\2E\u015a\3\2\2\2G"+
		"\u015c\3\2\2\2I\u015e\3\2\2\2K\u0160\3\2\2\2M\u0162\3\2\2\2O\u0164\3\2"+
		"\2\2Q\u0166\3\2\2\2S\u0168\3\2\2\2U\u016a\3\2\2\2W\u016c\3\2\2\2Y\u016e"+
		"\3\2\2\2[\u0170\3\2\2\2]\u0172\3\2\2\2_\u0175\3\2\2\2a\u0179\3\2\2\2c"+
		"\u017c\3\2\2\2e\u017f\3\2\2\2g\u0182\3\2\2\2i\u0185\3\2\2\2k\u0188\3\2"+
		"\2\2m\u018b\3\2\2\2o\u018e\3\2\2\2q\u0191\3\2\2\2s\u0194\3\2\2\2u\u0197"+
		"\3\2\2\2w\u019a\3\2\2\2y\u019d\3\2\2\2{\u01a0\3\2\2\2}\u01a3\3\2\2\2\177"+
		"\u01a5\3\2\2\2\u0081\u01a7\3\2\2\2\u0083\u01aa\3\2\2\2\u0085\u01ad\3\2"+
		"\2\2\u0087\u01b1\3\2\2\2\u0089\u01b4\3\2\2\2\u008b\u01b7\3\2\2\2\u008d"+
		"\u008e\7/\2\2\u008e\u008f\7@\2\2\u008f\4\3\2\2\2\u0090\u0091\7}\2\2\u0091"+
		"\6\3\2\2\2\u0092\u0093\7\177\2\2\u0093\b\3\2\2\2\u0094\u009d\7\62\2\2"+
		"\u0095\u0099\t\2\2\2\u0096\u0098\t\3\2\2\u0097\u0096\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009d\n\3\2\2\2"+
		"\u009e\u00a0\t\4\2\2\u009f\u00a1\t\5\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5\t\5\2\u00a3\f\3\2\2\2\u00a4"+
		"\u00ac\7^\2\2\u00a5\u00ad\t\6\2\2\u00a6\u00a7\4\62\65\2\u00a7\u00a8\4"+
		"\629\2\u00a8\u00ad\4\629\2\u00a9\u00aa\4\629\2\u00aa\u00ad\4\629\2\u00ab"+
		"\u00ad\4\629\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a9\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\16\3\2\2\2\u00ae\u00c0\5\t\5\2\u00af\u00b3"+
		"\7\62\2\2\u00b0\u00b2\t\7\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00c0\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\7\62\2\2\u00b7\u00b8\7z\2\2\u00b8\u00bc\3\2\2\2\u00b9"+
		"\u00bb\t\b\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00ae\3\2\2\2\u00bf\u00af\3\2\2\2\u00bf\u00b6\3\2\2\2\u00c0\20\3\2\2"+
		"\2\u00c1\u00c2\5\t\5\2\u00c2\u00c6\7\60\2\2\u00c3\u00c5\t\3\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\5\13\6\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\5\t"+
		"\5\2\u00cd\u00ce\5\13\6\2\u00ce\u00d0\3\2\2\2\u00cf\u00c1\3\2\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00d0\22\3\2\2\2\u00d1\u00d6\7)\2\2\u00d2\u00d5\5\r\7\2"+
		"\u00d3\u00d5\n\t\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00e4\7)\2\2\u00da\u00df\7$\2\2\u00db\u00de\5\r\7"+
		"\2\u00dc\u00de\n\n\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e4\7$\2\2\u00e3\u00d1\3\2\2\2\u00e3\u00da\3\2"+
		"\2\2\u00e4\24\3\2\2\2\u00e5\u00e6\t\13\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8"+
		"\b\13\2\2\u00e8\26\3\2\2\2\u00e9\u00ed\t\f\2\2\u00ea\u00eb\7\17\2\2\u00eb"+
		"\u00ed\7\f\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\30\3\2\2"+
		"\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3"+
		"\13\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8"+
		"\7,\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\r\2\2\u00fb"+
		"\32\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\7\61\2\2\u00fe\u0102\3\2"+
		"\2\2\u00ff\u0101\n\f\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0108\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\7\17\2\2\u0106\u0109\7\f\2\2\u0107\u0109\t\f\2\2\u0108"+
		"\u0105\3\2\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\b\16\2\2\u010b\34\3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e"+
		"\7n\2\2\u010e\u010f\7c\2\2\u010f\u0110\7u\2\2\u0110\u0111\7u\2\2\u0111"+
		"\36\3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115"+
		" \3\2\2\2\u0116\u0117\7y\2\2\u0117\u0118\7j\2\2\u0118\u0119\7k\2\2\u0119"+
		"\u011a\7n\2\2\u011a\u011b\7g\2\2\u011b\"\3\2\2\2\u011c\u011d\7k\2\2\u011d"+
		"\u011e\7h\2\2\u011e$\3\2\2\2\u011f\u0120\7g\2\2\u0120\u0121\7n\2\2\u0121"+
		"\u0122\7u\2\2\u0122\u0123\7g\2\2\u0123&\3\2\2\2\u0124\u0125\7f\2\2\u0125"+
		"\u0126\7g\2\2\u0126\u0127\7h\2\2\u0127(\3\2\2\2\u0128\u0129\7p\2\2\u0129"+
		"\u012a\7g\2\2\u012a\u012b\7y\2\2\u012b*\3\2\2\2\u012c\u012d\7t\2\2\u012d"+
		"\u012e\7g\2\2\u012e\u012f\7v\2\2\u012f\u0130\7w\2\2\u0130\u0131\7t\2\2"+
		"\u0131\u0132\7p\2\2\u0132,\3\2\2\2\u0133\u0134\7u\2\2\u0134\u0135\7v\2"+
		"\2\u0135\u0136\7c\2\2\u0136\u0137\7v\2\2\u0137\u0138\7k\2\2\u0138\u0139"+
		"\7e\2\2\u0139.\3\2\2\2\u013a\u013b\7v\2\2\u013b\u013c\7t\2\2\u013c\u013d"+
		"\7w\2\2\u013d\u013e\7g\2\2\u013e\60\3\2\2\2\u013f\u0140\7h\2\2\u0140\u0141"+
		"\7c\2\2\u0141\u0142\7n\2\2\u0142\u0143\7u\2\2\u0143\u0144\7g\2\2\u0144"+
		"\62\3\2\2\2\u0145\u0146\7p\2\2\u0146\u0147\7w\2\2\u0147\u0148\7n\2\2\u0148"+
		"\u0149\7n\2\2\u0149\64\3\2\2\2\u014a\u014b\7*\2\2\u014b\66\3\2\2\2\u014c"+
		"\u014d\7+\2\2\u014d8\3\2\2\2\u014e\u014f\7]\2\2\u014f:\3\2\2\2\u0150\u0151"+
		"\7_\2\2\u0151<\3\2\2\2\u0152\u0153\7=\2\2\u0153>\3\2\2\2\u0154\u0155\7"+
		".\2\2\u0155@\3\2\2\2\u0156\u0157\7\60\2\2\u0157B\3\2\2\2\u0158\u0159\7"+
		"?\2\2\u0159D\3\2\2\2\u015a\u015b\7(\2\2\u015bF\3\2\2\2\u015c\u015d\7~"+
		"\2\2\u015dH\3\2\2\2\u015e\u015f\7`\2\2\u015fJ\3\2\2\2\u0160\u0161\7\'"+
		"\2\2\u0161L\3\2\2\2\u0162\u0163\7-\2\2\u0163N\3\2\2\2\u0164\u0165\7/\2"+
		"\2\u0165P\3\2\2\2\u0166\u0167\7,\2\2\u0167R\3\2\2\2\u0168\u0169\7\61\2"+
		"\2\u0169T\3\2\2\2\u016a\u016b\7#\2\2\u016bV\3\2\2\2\u016c\u016d\7\u0080"+
		"\2\2\u016dX\3\2\2\2\u016e\u016f\7A\2\2\u016fZ\3\2\2\2\u0170\u0171\7<\2"+
		"\2\u0171\\\3\2\2\2\u0172\u0173\7?\2\2\u0173\u0174\7?\2\2\u0174^\3\2\2"+
		"\2\u0175\u0176\7>\2\2\u0176\u0177\7?\2\2\u0177\u0178\7@\2\2\u0178`\3\2"+
		"\2\2\u0179\u017a\7(\2\2\u017a\u017b\7(\2\2\u017bb\3\2\2\2\u017c\u017d"+
		"\7~\2\2\u017d\u017e\7~\2\2\u017ed\3\2\2\2\u017f\u0180\7-\2\2\u0180\u0181"+
		"\7-\2\2\u0181f\3\2\2\2\u0182\u0183\7/\2\2\u0183\u0184\7/\2\2\u0184h\3"+
		"\2\2\2\u0185\u0186\7,\2\2\u0186\u0187\7,\2\2\u0187j\3\2\2\2\u0188\u0189"+
		"\7-\2\2\u0189\u018a\7?\2\2\u018al\3\2\2\2\u018b\u018c\7/\2\2\u018c\u018d"+
		"\7?\2\2\u018dn\3\2\2\2\u018e\u018f\7,\2\2\u018f\u0190\7?\2\2\u0190p\3"+
		"\2\2\2\u0191\u0192\7\61\2\2\u0192\u0193\7?\2\2\u0193r\3\2\2\2\u0194\u0195"+
		"\7(\2\2\u0195\u0196\7?\2\2\u0196t\3\2\2\2\u0197\u0198\7~\2\2\u0198\u0199"+
		"\7?\2\2\u0199v\3\2\2\2\u019a\u019b\7`\2\2\u019b\u019c\7?\2\2\u019cx\3"+
		"\2\2\2\u019d\u019e\7\'\2\2\u019e\u019f\7?\2\2\u019fz\3\2\2\2\u01a0\u01a1"+
		"\7#\2\2\u01a1\u01a2\7?\2\2\u01a2|\3\2\2\2\u01a3\u01a4\7@\2\2\u01a4~\3"+
		"\2\2\2\u01a5\u01a6\7>\2\2\u01a6\u0080\3\2\2\2\u01a7\u01a8\7>\2\2\u01a8"+
		"\u01a9\7>\2\2\u01a9\u0082\3\2\2\2\u01aa\u01ab\7@\2\2\u01ab\u01ac\7@\2"+
		"\2\u01ac\u0084\3\2\2\2\u01ad\u01ae\7@\2\2\u01ae\u01af\7@\2\2\u01af\u01b0"+
		"\7@\2\2\u01b0\u0086\3\2\2\2\u01b1\u01b2\7>\2\2\u01b2\u01b3\7?\2\2\u01b3"+
		"\u0088\3\2\2\2\u01b4\u01b5\7@\2\2\u01b5\u01b6\7?\2\2\u01b6\u008a\3\2\2"+
		"\2\u01b7\u01bb\t\r\2\2\u01b8\u01ba\t\16\2\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u008c\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\27\2\u0099\u009c\u00a0\u00ac\u00b3\u00bc\u00bf"+
		"\u00c6\u00ca\u00cf\u00d4\u00d6\u00dd\u00df\u00e3\u00ec\u00f4\u0102\u0108"+
		"\u01bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}