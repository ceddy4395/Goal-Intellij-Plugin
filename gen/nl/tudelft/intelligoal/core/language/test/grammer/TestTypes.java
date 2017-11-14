// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.test.grammer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.tudelft.core.language.test.grammer.psi.impl.*;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestAgentDefImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestBasicTermImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestEventuallyRuleImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestFileReferenceImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestIdentifierImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestLeadstoRuleImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestListImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestMoodImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestNumberImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestPredicateImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestQueryImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestQueryListImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestRuleImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestStringImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestTermImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestTermListImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestTestModuleImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestTimeoutDefImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestUsageImpl;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.impl.TestUseClauseImpl;

public interface TestTypes {

  IElementType AGENT_DEF = new TestElementType("AGENT_DEF");
  IElementType BASIC_TERM = new TestElementType("BASIC_TERM");
  IElementType EVENTUALLY_RULE = new TestElementType("EVENTUALLY_RULE");
  IElementType FILE_REFERENCE = new TestElementType("FILE_REFERENCE");
  IElementType IDENTIFIER = new TestElementType("IDENTIFIER");
  IElementType LEADSTO_RULE = new TestElementType("LEADSTO_RULE");
  IElementType LIST = new TestElementType("LIST");
  IElementType MOOD = new TestElementType("MOOD");
  IElementType NUMBER = new TestElementType("NUMBER");
  IElementType PREDICATE = new TestElementType("PREDICATE");
  IElementType QUERY = new TestElementType("QUERY");
  IElementType QUERY_LIST = new TestElementType("QUERY_LIST");
  IElementType RULE = new TestElementType("RULE");
  IElementType STRING = new TestElementType("STRING");
  IElementType TERM = new TestElementType("TERM");
  IElementType TERM_LIST = new TestElementType("TERM_LIST");
  IElementType TEST_MODULE = new TestElementType("TEST_MODULE");
  IElementType TIMEOUT_DEF = new TestElementType("TIMEOUT_DEF");
  IElementType USAGE = new TestElementType("USAGE");
  IElementType USE_CLAUSE = new TestElementType("USE_CLAUSE");

  IElementType AGOAL = new TestTokenType("a-goal");
  IElementType AS = new TestTokenType("as");
  IElementType ATOM = new TestTokenType("ATOM");
  IElementType BANG = new TestTokenType("!");
  IElementType BAR = new TestTokenType("|");
  IElementType BEL = new TestTokenType("bel");
  IElementType BITSHIFT_LEFT = new TestTokenType("<<");
  IElementType BITSHIFT_RIGHT = new TestTokenType(">>");
  IElementType BITWISE_AND = new TestTokenType("/\\");
  IElementType BITWISE_OR = new TestTokenType("\\/");
  IElementType CBRACKET = new TestTokenType("]");
  IElementType CLOSE_CURLY = new TestTokenType("}");
  IElementType COLON = new TestTokenType(":");
  IElementType COMMA = new TestTokenType(",");
  IElementType CPAREN = new TestTokenType(")");
  IElementType DO = new TestTokenType("do");
  IElementType DOT = new TestTokenType(".");
  IElementType DQSTRING = new TestTokenType("DQSTRING");
  IElementType EQ = new TestTokenType("=");
  IElementType EVALUATES = new TestTokenType("=:=");
  IElementType EVENTUALLY = new TestTokenType("eventually");
  IElementType GE = new TestTokenType(">=");
  IElementType GENERAL_GE = new TestTokenType("@>=");
  IElementType GENERAL_GT = new TestTokenType("@>");
  IElementType GENERAL_LE = new TestTokenType("@=<");
  IElementType GENERAL_LT = new TestTokenType("@<");
  IElementType GOAL = new TestTokenType("goal");
  IElementType GOALA = new TestTokenType("goal-a");
  IElementType GT = new TestTokenType(">");
  IElementType IDENTICAL = new TestTokenType("==");
  IElementType IMPLIES = new TestTokenType("->");
  IElementType IN = new TestTokenType("in");
  IElementType INTEGER = new TestTokenType("INTEGER");
  IElementType INTERGER = new TestTokenType("INTERGER");
  IElementType INT_DIV = new TestTokenType("//");
  IElementType INV = new TestTokenType("\\");
  IElementType IS = new TestTokenType("is");
  IElementType KNOWLEDGE = new TestTokenType("knowledge");
  IElementType LEADSTO = new TestTokenType("leadsto");
  IElementType LEQ = new TestTokenType("=<");
  IElementType LINE_COMMENT = new TestTokenType("LINE_COMMENT");
  IElementType LT = new TestTokenType("<");
  IElementType MAS = new TestTokenType("mas");
  IElementType MINUS = new TestTokenType("-");
  IElementType MODULE = new TestTokenType("module");
  IElementType NOT = new TestTokenType("\\+");
  IElementType NOT_IDENTICAL = new TestTokenType("\\==");
  IElementType NOT_UNIFY = new TestTokenType("\\=");
  IElementType NOT_VARIANT = new TestTokenType("\\=@=");
  IElementType OBRACKET = new TestTokenType("[");
  IElementType OPAREN = new TestTokenType("(");
  IElementType OPEN_CURLY = new TestTokenType("{");
  IElementType PARTIAL_UNIFICATION = new TestTokenType(">:<");
  IElementType PERCEPT = new TestTokenType("percept");
  IElementType PLUS = new TestTokenType("+");
  IElementType POST = new TestTokenType("post");
  IElementType POW = new TestTokenType("**");
  IElementType POW2 = new TestTokenType("^");
  IElementType PRE = new TestTokenType("pre");
  IElementType REAL = new TestTokenType("REAL");
  IElementType SEMI = new TestTokenType(";");
  IElementType SENT = new TestTokenType("sent");
  IElementType SLASH = new TestTokenType("/");
  IElementType SOFT_IMPLIES = new TestTokenType("*->");
  IElementType SQSTRING = new TestTokenType("SQSTRING");
  IElementType STAR = new TestTokenType("*");
  IElementType TERMLIST = new TestTokenType("termlist");
  IElementType TEST = new TestTokenType("test");
  IElementType TRUE = new TestTokenType("true");
  IElementType UNIV = new TestTokenType("=..");
  IElementType USE = new TestTokenType("use");
  IElementType VARIABLE = new TestTokenType("VARIABLE");
  IElementType VARIANT = new TestTokenType("=@=");
  IElementType WHAT = new TestTokenType("?");
  IElementType WITH = new TestTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AGENT_DEF) {
        return new TestAgentDefImpl(node);
      }
      else if (type == BASIC_TERM) {
        return new TestBasicTermImpl(node);
      }
      else if (type == EVENTUALLY_RULE) {
        return new TestEventuallyRuleImpl(node);
      }
      else if (type == FILE_REFERENCE) {
        return new TestFileReferenceImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new TestIdentifierImpl(node);
      }
      else if (type == LEADSTO_RULE) {
        return new TestLeadstoRuleImpl(node);
      }
      else if (type == LIST) {
        return new TestListImpl(node);
      }
      else if (type == MOOD) {
        return new TestMoodImpl(node);
      }
      else if (type == NUMBER) {
        return new TestNumberImpl(node);
      }
      else if (type == PREDICATE) {
        return new TestPredicateImpl(node);
      }
      else if (type == QUERY) {
        return new TestQueryImpl(node);
      }
      else if (type == QUERY_LIST) {
        return new TestQueryListImpl(node);
      }
      else if (type == RULE) {
        return new TestRuleImpl(node);
      }
      else if (type == STRING) {
        return new TestStringImpl(node);
      }
      else if (type == TERM) {
        return new TestTermImpl(node);
      }
      else if (type == TERM_LIST) {
        return new TestTermListImpl(node);
      }
      else if (type == TEST_MODULE) {
        return new TestTestModuleImpl(node);
      }
      else if (type == TIMEOUT_DEF) {
        return new TestTimeoutDefImpl(node);
      }
      else if (type == USAGE) {
        return new TestUsageImpl(node);
      }
      else if (type == USE_CLAUSE) {
        return new TestUseClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
