// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.impl.*;

public interface PrologTypes {

  IElementType CALLABLE = new PrologElementType("CALLABLE");
  IElementType CLAUSE = new PrologElementType("CLAUSE");
  IElementType DIRECTIVE_CLAUSE = new PrologElementType("DIRECTIVE_CLAUSE");
  IElementType LIST = new PrologElementType("LIST");
  IElementType NUMBER = new PrologElementType("NUMBER");
  IElementType OPERATOR = new PrologElementType("OPERATOR");
  IElementType PREDICATE = new PrologElementType("PREDICATE");
  IElementType PREDICATE_SPEC = new PrologElementType("PREDICATE_SPEC");
  IElementType STRING = new PrologElementType("STRING");
  IElementType TERM = new PrologElementType("TERM");
  IElementType TERM_LIST = new PrologElementType("TERM_LIST");
  IElementType VARIABLE_LIST = new PrologElementType("VARIABLE_LIST");

  IElementType AS = new PrologTokenType("as");
  IElementType ATOM = new PrologTokenType("ATOM");
  IElementType BAR = new PrologTokenType("|");
  IElementType BITSHIFT_LEFT = new PrologTokenType("<<");
  IElementType BITSHIFT_RIGHT = new PrologTokenType(">>");
  IElementType BITWISE_AND = new PrologTokenType("/\\");
  IElementType BITWISE_OR = new PrologTokenType("\\/");
  IElementType CBRACKET = new PrologTokenType("]");
  IElementType COLON = new PrologTokenType(":");
  IElementType COMMA = new PrologTokenType(",");
  IElementType CPAREN = new PrologTokenType(")");
  IElementType CUT = new PrologTokenType("!");
  IElementType DCG = new PrologTokenType("-->");
  IElementType DIRECTIVE = new PrologTokenType("DIRECTIVE");
  IElementType DOC_COMMENT = new PrologTokenType("doc_comment");
  IElementType DOT = new PrologTokenType(".");
  IElementType DQSTRING = new PrologTokenType("DQSTRING");
  IElementType EVALUATES = new PrologTokenType("=:=");
  IElementType GE = new PrologTokenType(">=");
  IElementType GENERAL_GE = new PrologTokenType("@>=");
  IElementType GENERAL_GT = new PrologTokenType("@>");
  IElementType GENERAL_LE = new PrologTokenType("@=<");
  IElementType GENERAL_LT = new PrologTokenType("@<");
  IElementType GT = new PrologTokenType(">");
  IElementType IDENTICAL = new PrologTokenType("==");
  IElementType IMPLIES = new PrologTokenType("->");
  IElementType INTEGER = new PrologTokenType("INTEGER");
  IElementType INT_DIV = new PrologTokenType("//");
  IElementType INV = new PrologTokenType("\\");
  IElementType IS = new PrologTokenType("is");
  IElementType LEQ = new PrologTokenType("=<");
  IElementType LINE_COMMENT = new PrologTokenType("line_comment");
  IElementType LT = new PrologTokenType("<");
  IElementType MINUS = new PrologTokenType("-");
  IElementType MULT = new PrologTokenType("*");
  IElementType NECK = new PrologTokenType(":-");
  IElementType NOT = new PrologTokenType("\\+");
  IElementType NOT_IDENTICAL = new PrologTokenType("\\==");
  IElementType NOT_UNIFY = new PrologTokenType("\\=");
  IElementType NOT_VARIANT = new PrologTokenType("\\=@=");
  IElementType OBRACKET = new PrologTokenType("[");
  IElementType OPAREN = new PrologTokenType("(");
  IElementType PARTIAL_UNIFICATION = new PrologTokenType(">:<");
  IElementType PLUS = new PrologTokenType("+");
  IElementType POW = new PrologTokenType("**");
  IElementType POW2 = new PrologTokenType("^");
  IElementType REAL = new PrologTokenType("REAL");
  IElementType SEMI = new PrologTokenType(";");
  IElementType SLASH = new PrologTokenType("/");
  IElementType SOFT_IMPLIES = new PrologTokenType("*->");
  IElementType SQSTRING = new PrologTokenType("SQSTRING");
  IElementType UNIFY = new PrologTokenType("=");
  IElementType UNIV = new PrologTokenType("=..");
  IElementType VARIABLE = new PrologTokenType("VARIABLE");
  IElementType VARIANT = new PrologTokenType("=@=");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CALLABLE) {
        return new PrologCallableImpl(node);
      }
      else if (type == CLAUSE) {
        return new PrologClauseImpl(node);
      }
      else if (type == DIRECTIVE_CLAUSE) {
        return new PrologDirectiveClauseImpl(node);
      }
      else if (type == LIST) {
        return new PrologListImpl(node);
      }
      else if (type == NUMBER) {
        return new PrologNumberImpl(node);
      }
      else if (type == OPERATOR) {
        return new PrologOperatorImpl(node);
      }
      else if (type == PREDICATE) {
        return new PrologPredicateImpl(node);
      }
      else if (type == PREDICATE_SPEC) {
        return new PrologPredicateSpecImpl(node);
      }
      else if (type == STRING) {
        return new PrologStringImpl(node);
      }
      else if (type == TERM) {
        return new PrologTermImpl(node);
      }
      else if (type == TERM_LIST) {
        return new PrologTermListImpl(node);
      }
      else if (type == VARIABLE_LIST) {
        return new PrologVariableListImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
