// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.mas.grammer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.tudelft.core.language.mas.grammer.psi.impl.*;

public interface MasTypes {

  IElementType AGENT_BLOCK = new MasElementType("AGENT_BLOCK");
  IElementType CONSTRAINT = new MasElementType("CONSTRAINT");
  IElementType CONSTRAINT_LIST = new MasElementType("CONSTRAINT_LIST");
  IElementType ENTITY = new MasElementType("ENTITY");
  IElementType ENVIRONMENT_PROPERTY = new MasElementType("ENVIRONMENT_PROPERTY");
  IElementType ENVIRONMENT_PROPERTY_LIST = new MasElementType("ENVIRONMENT_PROPERTY_LIST");
  IElementType ENVIRONMENT_SPEC = new MasElementType("ENVIRONMENT_SPEC");
  IElementType IDENTIFIER = new MasElementType("IDENTIFIER");
  IElementType INSTRUCTION = new MasElementType("INSTRUCTION");
  IElementType INSTRUCTION_LIST = new MasElementType("INSTRUCTION_LIST");
  IElementType LAUNCH_POLICY = new MasElementType("LAUNCH_POLICY");
  IElementType LAUNCH_RULE = new MasElementType("LAUNCH_RULE");
  IElementType MAS_FILE = new MasElementType("MAS_FILE");
  IElementType MODULE_ID = new MasElementType("MODULE_ID");
  IElementType MODULE_STRING = new MasElementType("MODULE_STRING");
  IElementType NUMBER_LITERAL = new MasElementType("NUMBER_LITERAL");
  IElementType SIMPLE_IDENTIFIER = new MasElementType("SIMPLE_IDENTIFIER");
  IElementType STRING = new MasElementType("STRING");
  IElementType USE_CASE = new MasElementType("USE_CASE");
  IElementType USE_CLAUSE = new MasElementType("USE_CLAUSE");

  IElementType AGENT = new MasTokenType("agent");
  IElementType AGOAL = new MasTokenType("a-goal");
  IElementType AS = new MasTokenType("as");
  IElementType ATOM = new MasTokenType("atom");
  IElementType BAR = new MasTokenType("|");
  IElementType BEL = new MasTokenType("bel");
  IElementType BITSHIFT_LEFT = new MasTokenType("<<");
  IElementType BITSHIFT_RIGHT = new MasTokenType(">>");
  IElementType BITWISE_AND = new MasTokenType("/\\");
  IElementType BITWISE_OR = new MasTokenType("\\/");
  IElementType CBRACKET = new MasTokenType("]");
  IElementType CCURLY = new MasTokenType("}");
  IElementType COLON = new MasTokenType(":");
  IElementType COMMA = new MasTokenType(",");
  IElementType COMMENT = new MasTokenType("comment");
  IElementType CPAREN = new MasTokenType(")");
  IElementType DEFINE = new MasTokenType("define");
  IElementType DO = new MasTokenType("do");
  IElementType DONE = new MasTokenType("done");
  IElementType DOT = new MasTokenType(".");
  IElementType DQSTRING = new MasTokenType("DQSTRING");
  IElementType ENVIRONMENT = new MasTokenType("environment");
  IElementType EQ = new MasTokenType("=");
  IElementType EVALUATES = new MasTokenType("=:=");
  IElementType EXIT = new MasTokenType("exit");
  IElementType EXIT_MODULE = new MasTokenType("exit-module");
  IElementType EXIT_VAL = new MasTokenType("EXIT_VAL");
  IElementType FOCUS = new MasTokenType("focus");
  IElementType FOCUS_VAL = new MasTokenType("FOCUS_VAL");
  IElementType FORALL = new MasTokenType("forall");
  IElementType GE = new MasTokenType(">=");
  IElementType GENERAL_GE = new MasTokenType("@>=");
  IElementType GENERAL_GT = new MasTokenType("@>");
  IElementType GENERAL_LE = new MasTokenType("@=<");
  IElementType GENERAL_LT = new MasTokenType("@<");
  IElementType GOAL = new MasTokenType("goal");
  IElementType GOALA = new MasTokenType("goal-a");
  IElementType GT = new MasTokenType(">");
  IElementType ID = new MasTokenType("ID");
  IElementType IDENTICAL = new MasTokenType("==");
  IElementType IF = new MasTokenType("if");
  IElementType IMPLIES = new MasTokenType("->");
  IElementType IN = new MasTokenType("in");
  IElementType INTEGER = new MasTokenType("INTEGER");
  IElementType INT_DIV = new MasTokenType("//");
  IElementType INV = new MasTokenType("\\");
  IElementType IS = new MasTokenType("is");
  IElementType LAUNCH = new MasTokenType("launch");
  IElementType LAUNCHPOLICY = new MasTokenType("launchpolicy");
  IElementType LEADSTO = new MasTokenType("leadsto");
  IElementType LEQ = new MasTokenType("=<");
  IElementType LINE_COMMENT = new MasTokenType("LINE_COMMENT");
  IElementType LT = new MasTokenType("<");
  IElementType MAIL_SELECTOR_VAL = new MasTokenType("MAIL_SELECTOR_VAL");
  IElementType MAX = new MasTokenType("max");
  IElementType MINUS = new MasTokenType("-");
  IElementType MODULE = new MasTokenType("module");
  IElementType MODULE_BASIC_USAGE_VAL = new MasTokenType("MODULE_BASIC_USAGE_VAL");
  IElementType MOOD = new MasTokenType("MOOD");
  IElementType NAME = new MasTokenType("name");
  IElementType NOT = new MasTokenType("\\+");
  IElementType NOT_IDENTICAL = new MasTokenType("\\==");
  IElementType NOT_UNIFY = new MasTokenType("\\=");
  IElementType NOT_VARIANT = new MasTokenType("\\=@=");
  IElementType NUMBER = new MasTokenType("number");
  IElementType OBRACKET = new MasTokenType("[");
  IElementType OCURLY = new MasTokenType("{");
  IElementType OPAREN = new MasTokenType("(");
  IElementType ORDER = new MasTokenType("order");
  IElementType ORDER_VAL = new MasTokenType("ORDER_VAL");
  IElementType PARTIAL_UNIFICATION = new MasTokenType(">:<");
  IElementType PERCEPT = new MasTokenType("percept");
  IElementType PLUS = new MasTokenType("+");
  IElementType POST = new MasTokenType("post");
  IElementType POW = new MasTokenType("**");
  IElementType POW2 = new MasTokenType("^");
  IElementType PRE = new MasTokenType("pre");
  IElementType REAL = new MasTokenType("REAL");
  IElementType SEMI = new MasTokenType(";");
  IElementType SEND = new MasTokenType("send");
  IElementType SENT = new MasTokenType("sent");
  IElementType SLASH = new MasTokenType("/");
  IElementType SOFT_IMPLIES = new MasTokenType("*->");
  IElementType SQSTRING = new MasTokenType("SQSTRING");
  IElementType STAR = new MasTokenType("*");
  IElementType TEST = new MasTokenType("test");
  IElementType TEST_COND = new MasTokenType("TEST_COND");
  IElementType THEN = new MasTokenType("then");
  IElementType TIMEOUT = new MasTokenType("timeout");
  IElementType TRUE = new MasTokenType("true");
  IElementType TYPE = new MasTokenType("type");
  IElementType UNIV = new MasTokenType("=..");
  IElementType UNTIL = new MasTokenType("until");
  IElementType USE = new MasTokenType("use");
  IElementType USE_CASE_VAL = new MasTokenType("USE_CASE_VAL");
  IElementType VARIABLE = new MasTokenType("VARIABLE");
  IElementType VARIANT = new MasTokenType("=@=");
  IElementType WHEN = new MasTokenType("when");
  IElementType WITH = new MasTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AGENT_BLOCK) {
        return new MasAgentBlockImpl(node);
      }
      else if (type == CONSTRAINT) {
        return new MasConstraintImpl(node);
      }
      else if (type == CONSTRAINT_LIST) {
        return new MasConstraintListImpl(node);
      }
      else if (type == ENTITY) {
        return new MasEntityImpl(node);
      }
      else if (type == ENVIRONMENT_PROPERTY) {
        return new MasEnvironmentPropertyImpl(node);
      }
      else if (type == ENVIRONMENT_PROPERTY_LIST) {
        return new MasEnvironmentPropertyListImpl(node);
      }
      else if (type == ENVIRONMENT_SPEC) {
        return new MasEnvironmentSpecImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new MasIdentifierImpl(node);
      }
      else if (type == INSTRUCTION) {
        return new MasInstructionImpl(node);
      }
      else if (type == INSTRUCTION_LIST) {
        return new MasInstructionListImpl(node);
      }
      else if (type == LAUNCH_POLICY) {
        return new MasLaunchPolicyImpl(node);
      }
      else if (type == LAUNCH_RULE) {
        return new MasLaunchRuleImpl(node);
      }
      else if (type == MAS_FILE) {
        return new MasMasFileImpl(node);
      }
      else if (type == MODULE_ID) {
        return new MasModuleIdImpl(node);
      }
      else if (type == MODULE_STRING) {
        return new MasModuleStringImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new MasNumberLiteralImpl(node);
      }
      else if (type == SIMPLE_IDENTIFIER) {
        return new MasSimpleIdentifierImpl(node);
      }
      else if (type == STRING) {
        return new MasStringImpl(node);
      }
      else if (type == USE_CASE) {
        return new MasUseCaseImpl(node);
      }
      else if (type == USE_CLAUSE) {
        return new MasUseClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
