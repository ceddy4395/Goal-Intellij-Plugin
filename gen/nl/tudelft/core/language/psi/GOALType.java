// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;

public interface GOALType {

  IElementType AGENT_BLOCK = new GoalTokenType("AGENT_BLOCK");
  IElementType CONSTRAINT = new GoalTokenType("CONSTRAINT");
  IElementType CONSTRAINT_LIST = new GoalTokenType("CONSTRAINT_LIST");
  IElementType ENTITY = new GoalTokenType("ENTITY");
  IElementType ENVIRONMENT_PROPERTY = new GoalTokenType("ENVIRONMENT_PROPERTY");
  IElementType ENVIRONMENT_PROPERTY_LIST = new GoalTokenType("ENVIRONMENT_PROPERTY_LIST");
  IElementType ENVIRONMENT_SPEC = new GoalTokenType("ENVIRONMENT_SPEC");
  IElementType IDENTIFIER = new GoalTokenType("IDENTIFIER");
  IElementType INSTRUCTION = new GoalTokenType("INSTRUCTION");
  IElementType INSTRUCTION_LIST = new GoalTokenType("INSTRUCTION_LIST");
  IElementType LAUNCH_POLICY = new GoalTokenType("LAUNCH_POLICY");
  IElementType LAUNCH_RULE = new GoalTokenType("LAUNCH_RULE");
  IElementType MAS_FILE = new GoalTokenType("MAS_FILE");
  IElementType MODULE_ID = new GoalTokenType("MODULE_ID");
  IElementType MODULE_STRING = new GoalTokenType("MODULE_STRING");
  IElementType NUMBER_LITERAL = new GoalTokenType("NUMBER_LITERAL");
  IElementType SIMPLE_IDENTIFIER = new GoalTokenType("SIMPLE_IDENTIFIER");
  IElementType STRING = new GoalTokenType("STRING");
  IElementType USE_CASE = new GoalTokenType("USE_CASE");
  IElementType USE_CLAUSE = new GoalTokenType("USE_CLAUSE");

  IElementType ACTIONFILE = new GoalTokenType("actionFile");
  IElementType AGENT = new GoalTokenType("agent");
  IElementType AGOAL = new GoalTokenType("a-goal");
  IElementType AS = new GoalTokenType("as");
  IElementType ATOM = new GoalTokenType("atom");
  IElementType BAR = new GoalTokenType("|");
  IElementType BASIC_USAGE_VAL = new GoalTokenType("BASIC_USAGE_VAL");
  IElementType BEL = new GoalTokenType("bel");
  IElementType BITSHIFT_LEFT = new GoalTokenType("<<");
  IElementType BITSHIFT_RIGHT = new GoalTokenType(">>");
  IElementType BITWISE_AND = new GoalTokenType("/\\");
  IElementType BITWISE_OR = new GoalTokenType("\\/");
  IElementType CBRACKET = new GoalTokenType("]");
  IElementType CCURLY = new GoalTokenType("}");
  IElementType COLON = new GoalTokenType(":");
  IElementType COMMA = new GoalTokenType(",");
  IElementType COMMENT = new GoalTokenType("comment");
  IElementType CPAREN = new GoalTokenType(")");
  IElementType DEFINE = new GoalTokenType("define");
  IElementType DO = new GoalTokenType("do");
  IElementType DONE = new GoalTokenType("done");
  IElementType DOT = new GoalTokenType(".");
  IElementType DQSTRING = new GoalTokenType("DQSTRING");
  IElementType ENVIRONMENT = new GoalTokenType("environment");
  IElementType EQ = new GoalTokenType("=");
  IElementType EVALUATES = new GoalTokenType("=:=");
  IElementType EXIT = new GoalTokenType("exit");
  IElementType EXIT_MODULE = new GoalTokenType("exit-module");
  IElementType EXIT_VAL = new GoalTokenType("EXIT_VAL");
  IElementType FOCUS = new GoalTokenType("focus");
  IElementType FOCUS_VAL = new GoalTokenType("FOCUS_VAL");
  IElementType FORALL = new GoalTokenType("forall");
  IElementType GE = new GoalTokenType(">=");
  IElementType GENERAL_GE = new GoalTokenType("@>=");
  IElementType GENERAL_GT = new GoalTokenType("@>");
  IElementType GENERAL_LE = new GoalTokenType("@=<");
  IElementType GENERAL_LT = new GoalTokenType("@<");
  IElementType GOAL = new GoalTokenType("goal");
  IElementType GOALA = new GoalTokenType("goal-a");
  IElementType GT = new GoalTokenType(">");
  IElementType ID = new GoalTokenType("ID");
  IElementType IDENTICAL = new GoalTokenType("==");
  IElementType IF = new GoalTokenType("if");
  IElementType IMPLIES = new GoalTokenType("->");
  IElementType IN = new GoalTokenType("in");
  IElementType INTEGER = new GoalTokenType("INTEGER");
  IElementType INT_DIV = new GoalTokenType("//");
  IElementType INV = new GoalTokenType("\\");
  IElementType IS = new GoalTokenType("is");
  IElementType LAUNCH = new GoalTokenType("launch");
  IElementType LAUNCHPOLICY = new GoalTokenType("launchpolicy");
  IElementType LEADSTO = new GoalTokenType("leadsto");
  IElementType LEQ = new GoalTokenType("=<");
  IElementType LINE_COMMENT = new GoalTokenType("LINE_COMMENT");
  IElementType LT = new GoalTokenType("<");
  IElementType MAIL_SELECTOR_VAL = new GoalTokenType("MAIL_SELECTOR_VAL");
  IElementType MAX = new GoalTokenType("max");
  IElementType MINUS = new GoalTokenType("-");
  IElementType MODULE = new GoalTokenType("module");
  IElementType MODULEFILE = new GoalTokenType("moduleFile");
  IElementType MOOD = new GoalTokenType("MOOD");
  IElementType NAME = new GoalTokenType("name");
  IElementType NOT = new GoalTokenType("\\+");
  IElementType NOT_IDENTICAL = new GoalTokenType("\\==");
  IElementType NOT_UNIFY = new GoalTokenType("\\=");
  IElementType NOT_VARIANT = new GoalTokenType("\\=@=");
  IElementType NUMBER = new GoalTokenType("number");
  IElementType OBRACKET = new GoalTokenType("[");
  IElementType OCURLY = new GoalTokenType("{");
  IElementType OPAREN = new GoalTokenType("(");
  IElementType ORDER = new GoalTokenType("order");
  IElementType ORDER_VAL = new GoalTokenType("ORDER_VAL");
  IElementType PARTIAL_UNIFICATION = new GoalTokenType(">:<");
  IElementType PERCEPT = new GoalTokenType("percept");
  IElementType PLUS = new GoalTokenType("+");
  IElementType POST = new GoalTokenType("post");
  IElementType POW = new GoalTokenType("**");
  IElementType POW2 = new GoalTokenType("^");
  IElementType PRE = new GoalTokenType("pre");
  IElementType REAL = new GoalTokenType("REAL");
  IElementType SEMI = new GoalTokenType(";");
  IElementType SEND = new GoalTokenType("send");
  IElementType SENT = new GoalTokenType("sent");
  IElementType SLASH = new GoalTokenType("/");
  IElementType SOFT_IMPLIES = new GoalTokenType("*->");
  IElementType SQSTRING = new GoalTokenType("SQSTRING");
  IElementType STAR = new GoalTokenType("*");
  IElementType TEST = new GoalTokenType("test");
  IElementType TEST_COND = new GoalTokenType("TEST_COND");
  IElementType THEN = new GoalTokenType("then");
  IElementType TIMEOUT = new GoalTokenType("timeout");
  IElementType TRUE = new GoalTokenType("true");
  IElementType TYPE = new GoalTokenType("type");
  IElementType UNIV = new GoalTokenType("=..");
  IElementType UNTIL = new GoalTokenType("until");
  IElementType USE = new GoalTokenType("use");
  IElementType USE_CASE_VAL = new GoalTokenType("USE_CASE_VAL");
  IElementType VARIABLE = new GoalTokenType("VARIABLE");
  IElementType VARIANT = new GoalTokenType("=@=");
  IElementType WHEN = new GoalTokenType("when");
  IElementType WITH = new GoalTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AGENT_BLOCK) {
        return new GoalAgentBlockImpl(node);
      }
      else if (type == CONSTRAINT) {
        return new GoalConstraintImpl(node);
      }
      else if (type == CONSTRAINT_LIST) {
        return new GoalConstraintListImpl(node);
      }
      else if (type == ENTITY) {
        return new GoalEntityImpl(node);
      }
      else if (type == ENVIRONMENT_PROPERTY) {
        return new GoalEnvironmentPropertyImpl(node);
      }
      else if (type == ENVIRONMENT_PROPERTY_LIST) {
        return new GoalEnvironmentPropertyListImpl(node);
      }
      else if (type == ENVIRONMENT_SPEC) {
        return new GoalEnvironmentSpecImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new GoalIdentifierImpl(node);
      }
      else if (type == INSTRUCTION) {
        return new GoalInstructionImpl(node);
      }
      else if (type == INSTRUCTION_LIST) {
        return new GoalInstructionListImpl(node);
      }
      else if (type == LAUNCH_POLICY) {
        return new GoalLaunchPolicyImpl(node);
      }
      else if (type == LAUNCH_RULE) {
        return new GoalLaunchRuleImpl(node);
      }
      else if (type == MAS_FILE) {
        return new GoalMasFileImpl(node);
      }
      else if (type == MODULE_ID) {
        return new GoalModuleIdImpl(node);
      }
      else if (type == MODULE_STRING) {
        return new GoalModuleStringImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new GoalNumberLiteralImpl(node);
      }
      else if (type == SIMPLE_IDENTIFIER) {
        return new GoalSimpleIdentifierImpl(node);
      }
      else if (type == STRING) {
        return new GoalStringImpl(node);
      }
      else if (type == USE_CASE) {
        return new GoalUseCaseImpl(node);
      }
      else if (type == USE_CLAUSE) {
        return new GoalUseClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
