// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.tudelft.core.language.actionspec.grammer.psi.impl.*;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecActionSpecImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecAsClauseImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecAtomIdentifierImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecBasicTermImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecCallableImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecFileReferenceImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecIdentifierImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecListImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecNumberImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecOperatorImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecPredicateImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecStringImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecTermImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecTermListImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecUsageImpl;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl.ActionSpecUseClauseImpl;

public interface ActionSpecTypes {

  IElementType ACTION_SPEC = new ActionSpecElementType("ACTION_SPEC");
  IElementType AS_CLAUSE = new ActionSpecElementType("AS_CLAUSE");
  IElementType ATOM_IDENTIFIER = new ActionSpecElementType("ATOM_IDENTIFIER");
  IElementType BASIC_TERM = new ActionSpecElementType("BASIC_TERM");
  IElementType CALLABLE = new ActionSpecElementType("CALLABLE");
  IElementType FILE_REFERENCE = new ActionSpecElementType("FILE_REFERENCE");
  IElementType IDENTIFIER = new ActionSpecElementType("IDENTIFIER");
  IElementType LIST = new ActionSpecElementType("LIST");
  IElementType NUMBER = new ActionSpecElementType("NUMBER");
  IElementType OPERATOR = new ActionSpecElementType("OPERATOR");
  IElementType PREDICATE = new ActionSpecElementType("PREDICATE");
  IElementType STRING = new ActionSpecElementType("STRING");
  IElementType TERM = new ActionSpecElementType("TERM");
  IElementType TERM_LIST = new ActionSpecElementType("TERM_LIST");
  IElementType USAGE = new ActionSpecElementType("USAGE");
  IElementType USE_CLAUSE = new ActionSpecElementType("USE_CLAUSE");

  IElementType ACTION_USE_CASE_VAL = new ActionSpecTokenType("ACTION_USE_CASE_VAL");
  IElementType AS = new ActionSpecTokenType("as");
  IElementType ATOM = new ActionSpecTokenType("ATOM");
  IElementType BAR = new ActionSpecTokenType("|");
  IElementType BITSHIFT_LEFT = new ActionSpecTokenType("<<");
  IElementType BITSHIFT_RIGHT = new ActionSpecTokenType(">>");
  IElementType BITWISE_AND = new ActionSpecTokenType("/\\");
  IElementType BITWISE_OR = new ActionSpecTokenType("\\/");
  IElementType CBRACKET = new ActionSpecTokenType("]");
  IElementType CLOSE_CURLY = new ActionSpecTokenType("}");
  IElementType COLON = new ActionSpecTokenType(":");
  IElementType COMMA = new ActionSpecTokenType(",");
  IElementType CPAREN = new ActionSpecTokenType(")");
  IElementType DEFINE = new ActionSpecTokenType("define");
  IElementType DOT = new ActionSpecTokenType(".");
  IElementType DQSTRING = new ActionSpecTokenType("DQSTRING");
  IElementType EQ = new ActionSpecTokenType("=");
  IElementType EVALUATES = new ActionSpecTokenType("=:=");
  IElementType GE = new ActionSpecTokenType(">=");
  IElementType GENERAL_GE = new ActionSpecTokenType("@>=");
  IElementType GENERAL_GT = new ActionSpecTokenType("@>");
  IElementType GENERAL_LE = new ActionSpecTokenType("@=<");
  IElementType GENERAL_LT = new ActionSpecTokenType("@<");
  IElementType GT = new ActionSpecTokenType(">");
  IElementType IDENTICAL = new ActionSpecTokenType("==");
  IElementType IMPLIES = new ActionSpecTokenType("->");
  IElementType INTEGER = new ActionSpecTokenType("INTEGER");
  IElementType INT_DIV = new ActionSpecTokenType("//");
  IElementType INV = new ActionSpecTokenType("\\");
  IElementType IS = new ActionSpecTokenType("is");
  IElementType KNOWLEDGE = new ActionSpecTokenType("knowledge");
  IElementType LEQ = new ActionSpecTokenType("=<");
  IElementType LINE_COMMENT = new ActionSpecTokenType("LINE_COMMENT");
  IElementType LT = new ActionSpecTokenType("<");
  IElementType MINUS = new ActionSpecTokenType("-");
  IElementType MULT = new ActionSpecTokenType("*");
  IElementType NOT = new ActionSpecTokenType("\\+");
  IElementType NOT_IDENTICAL = new ActionSpecTokenType("\\==");
  IElementType NOT_UNIFY = new ActionSpecTokenType("\\=");
  IElementType NOT_VARIANT = new ActionSpecTokenType("\\=@=");
  IElementType OBRACKET = new ActionSpecTokenType("[");
  IElementType OPAREN = new ActionSpecTokenType("(");
  IElementType OPEN_CURLY = new ActionSpecTokenType("{");
  IElementType PARTIAL_UNIFICATION = new ActionSpecTokenType(">:<");
  IElementType PLUS = new ActionSpecTokenType("+");
  IElementType POST = new ActionSpecTokenType("post");
  IElementType POW = new ActionSpecTokenType("**");
  IElementType POW2 = new ActionSpecTokenType("^");
  IElementType PRE = new ActionSpecTokenType("pre");
  IElementType REAL = new ActionSpecTokenType("REAL");
  IElementType SEMI = new ActionSpecTokenType(";");
  IElementType SLASH = new ActionSpecTokenType("/");
  IElementType SOFT_IMPLIES = new ActionSpecTokenType("*->");
  IElementType SQSTRING = new ActionSpecTokenType("SQSTRING");
  IElementType TRUE = new ActionSpecTokenType("true");
  IElementType UNIV = new ActionSpecTokenType("=..");
  IElementType USE = new ActionSpecTokenType("use");
  IElementType VARIABLE = new ActionSpecTokenType("VARIABLE");
  IElementType VARIANT = new ActionSpecTokenType("=@=");
  IElementType WITH = new ActionSpecTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACTION_SPEC) {
        return new ActionSpecActionSpecImpl(node);
      }
      else if (type == AS_CLAUSE) {
        return new ActionSpecAsClauseImpl(node);
      }
      else if (type == ATOM_IDENTIFIER) {
        return new ActionSpecAtomIdentifierImpl(node);
      }
      else if (type == BASIC_TERM) {
        return new ActionSpecBasicTermImpl(node);
      }
      else if (type == CALLABLE) {
        return new ActionSpecCallableImpl(node);
      }
      else if (type == FILE_REFERENCE) {
        return new ActionSpecFileReferenceImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new ActionSpecIdentifierImpl(node);
      }
      else if (type == LIST) {
        return new ActionSpecListImpl(node);
      }
      else if (type == NUMBER) {
        return new ActionSpecNumberImpl(node);
      }
      else if (type == OPERATOR) {
        return new ActionSpecOperatorImpl(node);
      }
      else if (type == PREDICATE) {
        return new ActionSpecPredicateImpl(node);
      }
      else if (type == STRING) {
        return new ActionSpecStringImpl(node);
      }
      else if (type == TERM) {
        return new ActionSpecTermImpl(node);
      }
      else if (type == TERM_LIST) {
        return new ActionSpecTermListImpl(node);
      }
      else if (type == USAGE) {
        return new ActionSpecUsageImpl(node);
      }
      else if (type == USE_CLAUSE) {
        return new ActionSpecUseClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
