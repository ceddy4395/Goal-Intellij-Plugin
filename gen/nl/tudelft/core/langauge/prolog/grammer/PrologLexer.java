/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package nl.tudelft.core.langauge.prolog.grammer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.tudelft.core.language.actionspec.grammer.PrologTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>PrologLexer.flex</tt>
 */
public class PrologLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int directive = 2;
  public static final int clause = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\53\1\1\2\46\1\1\22\0\1\53\1\73\1\50\2\0\1\52\1\0\1\40\1\62\1\63\1"+
    "\66\1\44\1\55\1\31\1\42\1\56\1\33\1\34\6\35\2\32\1\60\1\64\1\67\1\70\1\57"+
    "\1\0\1\71\4\37\1\43\1\37\24\41\1\54\1\45\1\61\1\72\1\22\1\0\1\6\1\26\1\11"+
    "\1\3\1\21\1\25\1\15\1\27\1\10\2\51\1\17\1\7\1\5\1\13\1\23\1\51\1\24\1\12\1"+
    "\14\1\16\1\30\1\51\1\36\1\4\1\20\1\0\1\65\10\0\1\47\32\0\1\2\337\0\1\2\177"+
    "\0\13\2\35\0\2\47\5\0\1\2\57\0\1\2\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\3\1\7\4\1\1\2\5"+
    "\1\1\1\6\1\7\1\10\2\4\1\11\1\12\2\5"+
    "\1\1\1\13\1\14\1\1\1\15\1\10\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\1\1\30\1\31\1\0\1\3\1\0\2\32\1\33"+
    "\1\34\11\4\2\5\5\0\1\4\1\0\1\35\1\36"+
    "\1\0\1\5\1\37\1\0\1\5\2\0\1\40\1\0"+
    "\1\41\1\42\1\43\2\0\1\44\1\45\1\46\1\47"+
    "\1\0\1\50\1\51\1\0\1\52\1\53\2\0\1\54"+
    "\1\55\1\0\1\56\1\57\1\0\11\4\4\5\1\60"+
    "\1\0\2\61\1\62\1\0\1\63\1\64\1\65\1\66"+
    "\1\67\1\70\1\71\11\4\1\72\15\4\1\73\45\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[194];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\u01a4"+
    "\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348\0\u0384"+
    "\0\u03c0\0\u03fc\0\u0438\0\u0474\0\264\0\264\0\264\0\u04b0"+
    "\0\u04ec\0\u0528\0\u0564\0\u05a0\0\u05dc\0\u0618\0\264\0\u0654"+
    "\0\u0690\0\264\0\u06cc\0\u0708\0\u0744\0\264\0\264\0\264"+
    "\0\264\0\264\0\u0780\0\u07bc\0\u07f8\0\u0834\0\264\0\264"+
    "\0\u0168\0\264\0\u0870\0\u08ac\0\u01a4\0\u08e8\0\264\0\u0924"+
    "\0\u0960\0\u099c\0\u09d8\0\u0a14\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04"+
    "\0\u03c0\0\u0b40\0\u0b7c\0\u0bb8\0\u0bf4\0\u0c30\0\u0474\0\264"+
    "\0\u0c6c\0\u0258\0\u0258\0\u0ca8\0\u0ce4\0\264\0\u0d20\0\u0d5c"+
    "\0\u0d98\0\u0618\0\264\0\u0dd4\0\264\0\264\0\u0e10\0\u0690"+
    "\0\u0e4c\0\264\0\264\0\264\0\264\0\u0e88\0\264\0\264"+
    "\0\u0ec4\0\264\0\264\0\u0f00\0\u0f3c\0\264\0\264\0\u0f78"+
    "\0\u0fb4\0\264\0\u0ff0\0\u102c\0\u1068\0\u10a4\0\u10e0\0\u111c"+
    "\0\u1158\0\u1194\0\u11d0\0\u120c\0\u0b7c\0\u0bb8\0\u0bf4\0\u0c30"+
    "\0\264\0\u1248\0\u1248\0\u1284\0\264\0\u12c0\0\264\0\264"+
    "\0\264\0\264\0\264\0\264\0\264\0\u12fc\0\u1338\0\u1374"+
    "\0\u13b0\0\u13ec\0\u1428\0\u1464\0\u14a0\0\u14dc\0\264\0\u1518"+
    "\0\u1554\0\u1590\0\u15cc\0\u1608\0\u1644\0\u1680\0\u16bc\0\u16f8"+
    "\0\u1734\0\u1770\0\u17ac\0\u17e8\0\u0258\0\u1824\0\u1860\0\u189c"+
    "\0\u18d8\0\u1914\0\u1950\0\u198c\0\u19c8\0\u1a04\0\u1a40\0\u1a7c"+
    "\0\u1ab8\0\u1af4\0\u1b30\0\u1b6c\0\u1ba8\0\u1be4\0\u1c20\0\u1c5c"+
    "\0\u1c98\0\u1cd4\0\u1d10\0\u1d4c\0\u1d88\0\u1dc4\0\u1e00\0\u1e3c"+
    "\0\u1e78\0\u1eb4\0\u1ef0\0\u1f2c\0\u1f68\0\u1fa4\0\u1fe0\0\u201c"+
    "\0\u2058\0\u2094";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[194];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\2\5\17\6\1\4\6\6\5\4\1\6\1\4"+
    "\1\7\5\4\2\5\1\4\1\6\1\10\1\5\4\4"+
    "\1\11\14\4\2\5\1\12\3\13\1\14\1\15\3\13"+
    "\1\16\5\13\1\4\1\17\4\13\1\20\1\21\1\22"+
    "\1\23\2\22\1\13\1\4\1\24\1\4\1\25\3\4"+
    "\2\5\1\4\1\13\1\10\1\5\1\4\1\26\1\27"+
    "\16\4\2\5\3\13\1\30\1\13\1\31\11\13\1\32"+
    "\6\13\1\33\1\34\1\35\2\34\1\13\1\32\1\36"+
    "\1\32\1\25\1\32\1\37\1\40\2\5\1\41\1\13"+
    "\1\10\1\5\1\42\1\26\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\75\0\2\5\43\0\2\5\3\0\1\5"+
    "\23\0\26\6\1\0\6\6\1\0\1\6\1\0\1\6"+
    "\5\0\1\6\22\0\40\61\1\62\4\61\1\63\26\61"+
    "\1\64\1\65\44\64\1\65\4\64\1\65\1\66\17\64"+
    "\31\0\1\67\45\0\1\13\1\70\3\13\1\71\20\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\25\0\26\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\10\13\1\72\2\13\1\73\2\13"+
    "\1\74\7\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\2\13\1\75\23\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\24\13"+
    "\1\76\1\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\13\13\1\77\12\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\10\13"+
    "\1\100\15\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\54\0\4\101\70\0\4\102\2\0\1\103"+
    "\46\0\1\104\12\0\1\105\3\0\4\102\1\106\1\0"+
    "\1\103\33\0\40\107\1\110\4\107\1\111\26\107\3\0"+
    "\7\13\1\112\16\13\1\0\6\13\1\0\1\13\1\0"+
    "\1\13\5\0\1\13\25\0\7\13\1\113\16\13\1\0"+
    "\6\13\1\0\1\13\1\0\1\13\5\0\1\13\25\0"+
    "\26\32\1\0\6\32\1\0\1\32\1\0\1\32\5\0"+
    "\1\32\53\0\1\114\4\115\21\0\1\116\35\0\1\117"+
    "\10\0\4\120\2\0\1\103\1\0\1\121\1\117\43\0"+
    "\1\104\5\0\1\117\4\0\1\105\3\0\4\120\1\106"+
    "\1\0\1\103\1\0\1\121\1\117\30\0\40\122\1\123"+
    "\4\122\1\124\26\122\44\0\1\125\11\0\1\126\11\0"+
    "\1\127\3\0\45\130\1\131\2\130\1\132\23\130\45\0"+
    "\1\133\10\0\1\134\74\0\1\135\1\136\7\0\1\137"+
    "\34\0\1\140\73\0\1\141\34\0\1\142\74\0\1\143"+
    "\46\0\1\144\15\0\1\145\6\0\1\146\1\147\1\150"+
    "\61\0\1\151\7\0\1\152\1\153\3\0\1\61\1\0"+
    "\44\61\2\0\24\61\1\64\1\0\72\64\1\66\1\0"+
    "\72\66\3\0\2\13\1\154\23\13\1\0\6\13\1\0"+
    "\1\13\1\0\1\13\5\0\1\13\25\0\7\13\1\155"+
    "\16\13\1\0\6\13\1\0\1\13\1\0\1\13\5\0"+
    "\1\13\25\0\1\156\25\13\1\0\6\13\1\0\1\13"+
    "\1\0\1\13\5\0\1\13\25\0\14\13\1\157\11\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\25\0\11\13\1\160\14\13\1\0\6\13\1\0\1\13"+
    "\1\0\1\13\5\0\1\13\25\0\5\13\1\161\20\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\25\0\21\13\1\162\4\13\1\0\6\13\1\0\1\13"+
    "\1\0\1\13\5\0\1\13\25\0\23\13\1\163\2\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\25\0\14\13\1\164\11\13\1\0\6\13\1\0\1\13"+
    "\1\0\1\13\5\0\1\13\54\0\4\101\2\0\1\103"+
    "\36\0\17\165\1\0\6\165\1\0\6\165\1\0\1\165"+
    "\1\0\1\165\5\0\1\165\55\0\3\166\71\0\2\167"+
    "\42\0\1\170\2\0\1\170\2\0\1\170\7\0\1\170"+
    "\3\0\2\170\3\0\4\170\1\0\1\170\3\0\1\170"+
    "\30\0\1\107\1\0\44\107\2\0\24\107\57\0\1\171"+
    "\35\0\1\117\10\0\4\115\4\0\1\121\1\117\61\0"+
    "\1\172\4\173\6\0\1\172\50\0\1\117\10\0\4\115"+
    "\2\0\1\103\1\0\1\121\1\117\62\0\4\174\36\0"+
    "\1\122\1\0\44\122\2\0\24\122\70\0\1\175\1\176"+
    "\2\0\1\130\1\0\44\130\2\0\24\130\67\0\1\177"+
    "\63\0\1\200\56\0\1\201\121\0\1\202\73\0\1\203"+
    "\73\0\1\204\72\0\1\205\7\0\3\13\1\206\22\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\25\0\6\13\1\207\17\13\1\0\6\13\1\0\1\13"+
    "\1\0\1\13\5\0\1\13\25\0\13\13\1\210\12\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\25\0\11\13\1\211\14\13\1\0\6\13\1\0\1\13"+
    "\1\0\1\13\5\0\1\13\25\0\3\13\1\212\22\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\25\0\11\13\1\213\14\13\1\0\6\13\1\0\1\13"+
    "\1\0\1\13\5\0\1\13\25\0\16\13\1\214\7\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\25\0\14\13\1\215\11\13\1\0\6\13\1\0\1\13"+
    "\1\0\1\13\5\0\1\13\25\0\3\13\1\216\22\13"+
    "\1\0\6\13\1\0\1\13\1\0\1\13\5\0\1\13"+
    "\54\0\4\173\57\0\1\117\10\0\4\174\5\0\1\117"+
    "\120\0\1\217\6\0\4\13\1\215\21\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\10\13"+
    "\1\220\15\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\14\13\1\221\11\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\5\13"+
    "\1\222\20\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\17\13\1\223\6\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\5\13"+
    "\1\224\20\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\3\13\1\225\22\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\5\13"+
    "\1\226\20\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\11\13\1\227\14\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\2\13"+
    "\1\230\23\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\16\13\1\231\7\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\22\13"+
    "\1\227\3\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\20\13\1\232\5\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\3\13"+
    "\1\233\22\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\1\234\25\13\1\0\6\13\1\0"+
    "\1\13\1\0\1\13\5\0\1\13\25\0\6\13\1\235"+
    "\17\13\1\0\6\13\1\0\1\13\1\0\1\13\5\0"+
    "\1\13\25\0\5\13\1\236\20\13\1\0\6\13\1\0"+
    "\1\13\1\0\1\13\5\0\1\13\25\0\11\13\1\237"+
    "\14\13\1\0\6\13\1\0\1\13\1\0\1\13\5\0"+
    "\1\13\25\0\17\13\1\240\6\13\1\0\6\13\1\0"+
    "\1\13\1\0\1\13\5\0\1\13\25\0\21\13\1\241"+
    "\4\13\1\0\6\13\1\0\1\13\1\0\1\13\5\0"+
    "\1\13\25\0\14\13\1\242\11\13\1\0\6\13\1\0"+
    "\1\13\1\0\1\13\5\0\1\13\25\0\17\13\1\243"+
    "\6\13\1\0\6\13\1\0\1\13\1\0\1\13\5\0"+
    "\1\13\25\0\14\13\1\244\11\13\1\0\6\13\1\0"+
    "\1\13\1\0\1\13\5\0\1\13\25\0\5\13\1\245"+
    "\20\13\1\0\6\13\1\0\1\13\1\0\1\13\5\0"+
    "\1\13\25\0\11\13\1\246\14\13\1\0\6\13\1\0"+
    "\1\13\1\0\1\13\5\0\1\13\25\0\16\13\1\247"+
    "\7\13\1\0\6\13\1\0\1\13\1\0\1\13\5\0"+
    "\1\13\25\0\5\13\1\250\20\13\1\0\6\13\1\0"+
    "\1\13\1\0\1\13\5\0\1\13\25\0\5\13\1\15"+
    "\6\13\1\251\11\13\1\0\6\13\1\0\1\13\1\0"+
    "\1\13\5\0\1\13\25\0\16\13\1\235\7\13\1\0"+
    "\6\13\1\0\1\13\1\0\1\13\5\0\1\13\25\0"+
    "\12\13\1\252\13\13\1\0\6\13\1\0\1\13\1\0"+
    "\1\13\5\0\1\13\25\0\21\13\1\253\4\13\1\0"+
    "\6\13\1\0\1\13\1\0\1\13\5\0\1\13\25\0"+
    "\1\254\25\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\15\13\1\255\10\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\10\13"+
    "\1\256\15\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\13\13\1\257\12\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\3\13"+
    "\1\260\22\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\5\13\1\261\20\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\3\13"+
    "\1\262\22\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\6\13\1\263\17\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\10\13"+
    "\1\264\15\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\2\13\1\265\23\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\6\13"+
    "\1\266\17\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\11\13\1\267\14\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\3\13"+
    "\1\270\22\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\13\13\1\271\12\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\7\13"+
    "\1\272\16\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\3\13\1\273\22\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\5\13"+
    "\1\274\20\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\14\13\1\235\11\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\7\13"+
    "\1\235\16\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\20\13\1\275\5\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\11\13"+
    "\1\244\14\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\10\13\1\276\15\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\3\13"+
    "\1\277\22\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\2\13\1\235\23\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\21\13"+
    "\1\300\4\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\16\13\1\301\7\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\25\0\2\13"+
    "\1\302\23\13\1\0\6\13\1\0\1\13\1\0\1\13"+
    "\5\0\1\13\25\0\11\13\1\235\14\13\1\0\6\13"+
    "\1\0\1\13\1\0\1\13\5\0\1\13\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8400];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\20\1\3\11\7\1\1\11\2\1\1\11"+
    "\3\1\5\11\4\1\2\11\1\0\1\11\1\0\3\1"+
    "\1\11\13\1\5\0\1\11\1\0\2\1\1\0\1\1"+
    "\1\11\1\0\1\1\2\0\1\11\1\0\2\11\1\1"+
    "\2\0\4\11\1\0\2\11\1\0\2\11\2\0\2\11"+
    "\1\0\1\1\1\11\1\0\15\1\1\11\1\0\2\1"+
    "\1\11\1\0\7\11\11\1\1\11\63\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[194];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public PrologLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public PrologLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 60: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 61: break;
          case 3: 
            { yybegin(clause); return ATOM;
            }
          case 62: break;
          case 4: 
            { return ATOM;
            }
          case 63: break;
          case 5: 
            { return INTEGER;
            }
          case 64: break;
          case 6: 
            { yybegin(YYINITIAL); return DOT;
            }
          case 65: break;
          case 7: 
            { return COMMA;
            }
          case 66: break;
          case 8: 
            { return SLASH;
            }
          case 67: break;
          case 9: 
            { return VARIABLE;
            }
          case 68: break;
          case 10: 
            { return MINUS;
            }
          case 69: break;
          case 11: 
            { return PLUS;
            }
          case 70: break;
          case 12: 
            { return INV;
            }
          case 71: break;
          case 13: 
            { return OBRACKET;
            }
          case 72: break;
          case 14: 
            { return GT;
            }
          case 73: break;
          case 15: 
            { return COLON;
            }
          case 74: break;
          case 16: 
            { return CBRACKET;
            }
          case 75: break;
          case 17: 
            { return OPAREN;
            }
          case 76: break;
          case 18: 
            { return CPAREN;
            }
          case 77: break;
          case 19: 
            { return SEMI;
            }
          case 78: break;
          case 20: 
            { return BAR;
            }
          case 79: break;
          case 21: 
            { return MULT;
            }
          case 80: break;
          case 22: 
            { return LT;
            }
          case 81: break;
          case 23: 
            { return UNIFY;
            }
          case 82: break;
          case 24: 
            { return POW2;
            }
          case 83: break;
          case 25: 
            { return CUT;
            }
          case 84: break;
          case 26: 
            { return LINE_COMMENT;
            }
          case 85: break;
          case 27: 
            { return DOC_COMMENT;
            }
          case 86: break;
          case 28: 
            { yybegin(directive); return NECK;
            }
          case 87: break;
          case 29: 
            { return AS;
            }
          case 88: break;
          case 30: 
            { return IS;
            }
          case 89: break;
          case 31: 
            { return IMPLIES;
            }
          case 90: break;
          case 32: 
            { return SQSTRING;
            }
          case 91: break;
          case 33: 
            { return NOT;
            }
          case 92: break;
          case 34: 
            { return BITWISE_OR;
            }
          case 93: break;
          case 35: 
            { return NOT_UNIFY;
            }
          case 94: break;
          case 36: 
            { return DQSTRING;
            }
          case 95: break;
          case 37: 
            { return BITWISE_AND;
            }
          case 96: break;
          case 38: 
            { return INT_DIV;
            }
          case 97: break;
          case 39: 
            { return BITSHIFT_RIGHT;
            }
          case 98: break;
          case 40: 
            { return GE;
            }
          case 99: break;
          case 41: 
            { return NECK;
            }
          case 100: break;
          case 42: 
            { return POW;
            }
          case 101: break;
          case 43: 
            { return BITSHIFT_LEFT;
            }
          case 102: break;
          case 44: 
            { return LEQ;
            }
          case 103: break;
          case 45: 
            { return IDENTICAL;
            }
          case 104: break;
          case 46: 
            { return GENERAL_GT;
            }
          case 105: break;
          case 47: 
            { return GENERAL_LT;
            }
          case 106: break;
          case 48: 
            { return DCG;
            }
          case 107: break;
          case 49: 
            { return REAL;
            }
          case 108: break;
          case 50: 
            { return NOT_IDENTICAL;
            }
          case 109: break;
          case 51: 
            { return PARTIAL_UNIFICATION;
            }
          case 110: break;
          case 52: 
            { return SOFT_IMPLIES;
            }
          case 111: break;
          case 53: 
            { return UNIV;
            }
          case 112: break;
          case 54: 
            { return EVALUATES;
            }
          case 113: break;
          case 55: 
            { return VARIANT;
            }
          case 114: break;
          case 56: 
            { return GENERAL_GE;
            }
          case 115: break;
          case 57: 
            { return GENERAL_LE;
            }
          case 116: break;
          case 58: 
            { return NOT_VARIANT;
            }
          case 117: break;
          case 59: 
            { return DIRECTIVE;
            }
          case 118: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
