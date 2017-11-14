// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.module.grammer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.tudelft.core.language.module.grammer.psi.impl.*;

public interface ModuleTypes {

  IElementType ACTION = new ModuleElementType("ACTION");
  IElementType ACTION_COMBO = new ModuleElementType("ACTION_COMBO");
  IElementType ADOPT_ACTION = new ModuleElementType("ADOPT_ACTION");
  IElementType BASIC_TERM = new ModuleElementType("BASIC_TERM");
  IElementType BLOCK = new ModuleElementType("BLOCK");
  IElementType CALLABLE = new ModuleElementType("CALLABLE");
  IElementType CALLABLE_MODULE = new ModuleElementType("CALLABLE_MODULE");
  IElementType DELETE_ACTION = new ModuleElementType("DELETE_ACTION");
  IElementType DROP_ACTION = new ModuleElementType("DROP_ACTION");
  IElementType FILE_REFERENCE = new ModuleElementType("FILE_REFERENCE");
  IElementType IDENTIFIER = new ModuleElementType("IDENTIFIER");
  IElementType INSERT_ACTION = new ModuleElementType("INSERT_ACTION");
  IElementType LIST = new ModuleElementType("LIST");
  IElementType MACRO_DEF = new ModuleElementType("MACRO_DEF");
  IElementType MODULE_CLAUSE = new ModuleElementType("MODULE_CLAUSE");
  IElementType MODULE_NAME = new ModuleElementType("MODULE_NAME");
  IElementType MOOD = new ModuleElementType("MOOD");
  IElementType NUMBER = new ModuleElementType("NUMBER");
  IElementType OPERATOR = new ModuleElementType("OPERATOR");
  IElementType OPTION = new ModuleElementType("OPTION");
  IElementType PREDICATE = new ModuleElementType("PREDICATE");
  IElementType PREDICATE_ACTION = new ModuleElementType("PREDICATE_ACTION");
  IElementType QUERY = new ModuleElementType("QUERY");
  IElementType QUERY_LIST = new ModuleElementType("QUERY_LIST");
  IElementType RULE = new ModuleElementType("RULE");
  IElementType SELECTOR = new ModuleElementType("SELECTOR");
  IElementType SEND_ACTION = new ModuleElementType("SEND_ACTION");
  IElementType STRING = new ModuleElementType("STRING");
  IElementType TERM = new ModuleElementType("TERM");
  IElementType TERM_LIST = new ModuleElementType("TERM_LIST");
  IElementType USAGE = new ModuleElementType("USAGE");
  IElementType USE_CLAUSE = new ModuleElementType("USE_CLAUSE");
  IElementType VARIABLE_LIST = new ModuleElementType("VARIABLE_LIST");

  IElementType ADOPT = new ModuleTokenType("adopt");
  IElementType AGOAL = new ModuleTokenType("a-goal");
  IElementType AS = new ModuleTokenType("as");
  IElementType ATOM = new ModuleTokenType("ATOM");
  IElementType BANG = new ModuleTokenType("!");
  IElementType BAR = new ModuleTokenType("|");
  IElementType BASIC_USAGE_VAL = new ModuleTokenType("BASIC_USAGE_VAL");
  IElementType BEL = new ModuleTokenType("bel");
  IElementType BITSHIFT_LEFT = new ModuleTokenType("<<");
  IElementType BITSHIFT_RIGHT = new ModuleTokenType(">>");
  IElementType BITWISE_AND = new ModuleTokenType("/\\");
  IElementType BITWISE_OR = new ModuleTokenType("\\/");
  IElementType CBRACKET = new ModuleTokenType("]");
  IElementType CLOSE_CURLY = new ModuleTokenType("}");
  IElementType COLON = new ModuleTokenType(":");
  IElementType COMMA = new ModuleTokenType(",");
  IElementType CPAREN = new ModuleTokenType(")");
  IElementType DEFINE = new ModuleTokenType("define");
  IElementType DELETE = new ModuleTokenType("delete");
  IElementType DO = new ModuleTokenType("do");
  IElementType DOT = new ModuleTokenType(".");
  IElementType DQSTRING = new ModuleTokenType("DQSTRING");
  IElementType DROP = new ModuleTokenType("drop");
  IElementType EQ = new ModuleTokenType("=");
  IElementType EVALUATES = new ModuleTokenType("=:=");
  IElementType EXIT = new ModuleTokenType("exit");
  IElementType EXIT_MODULE = new ModuleTokenType("exit-module");
  IElementType EXIT_VAL = new ModuleTokenType("EXIT_VAL");
  IElementType FOCUS = new ModuleTokenType("focus");
  IElementType FOCUS_VAL = new ModuleTokenType("FOCUS_VAL");
  IElementType FORALL = new ModuleTokenType("forall");
  IElementType GE = new ModuleTokenType(">=");
  IElementType GENERAL_GE = new ModuleTokenType("@>=");
  IElementType GENERAL_GT = new ModuleTokenType("@>");
  IElementType GENERAL_LE = new ModuleTokenType("@=<");
  IElementType GENERAL_LT = new ModuleTokenType("@<");
  IElementType GOAL = new ModuleTokenType("goal");
  IElementType GOALA = new ModuleTokenType("goal-a");
  IElementType GT = new ModuleTokenType(">");
  IElementType IDENTICAL = new ModuleTokenType("==");
  IElementType IF = new ModuleTokenType("if");
  IElementType IMPLIES = new ModuleTokenType("->");
  IElementType INSERT = new ModuleTokenType("insert");
  IElementType INTEGER = new ModuleTokenType("INTEGER");
  IElementType INT_DIV = new ModuleTokenType("//");
  IElementType INV = new ModuleTokenType("\\");
  IElementType LEQ = new ModuleTokenType("=<");
  IElementType LINE_COMMENT = new ModuleTokenType("line_comment");
  IElementType LISTALL = new ModuleTokenType("listall");
  IElementType LOG = new ModuleTokenType("log");
  IElementType LT = new ModuleTokenType("<");
  IElementType MINUS = new ModuleTokenType("-");
  IElementType MODULE = new ModuleTokenType("module");
  IElementType MULT = new ModuleTokenType("*");
  IElementType NOT = new ModuleTokenType("not");
  IElementType NOT_IDENTICAL = new ModuleTokenType("\\==");
  IElementType NOT_UNIFY = new ModuleTokenType("\\=");
  IElementType NOT_VARIANT = new ModuleTokenType("\\=@=");
  IElementType OBRACKET = new ModuleTokenType("[");
  IElementType OPAREN = new ModuleTokenType("(");
  IElementType OPEN_CURLY = new ModuleTokenType("{");
  IElementType ORDER = new ModuleTokenType("order");
  IElementType ORDER_VAL = new ModuleTokenType("ORDER_VAL");
  IElementType PARTIAL_UNIFICATION = new ModuleTokenType(">:<");
  IElementType PERCEPT = new ModuleTokenType("percept");
  IElementType PLUS = new ModuleTokenType("+");
  IElementType POW = new ModuleTokenType("**");
  IElementType POW2 = new ModuleTokenType("^");
  IElementType PRINT = new ModuleTokenType("print");
  IElementType REAL = new ModuleTokenType("REAL");
  IElementType REVERSE_SNEK = new ModuleTokenType("<-");
  IElementType SELECTOR_VAL = new ModuleTokenType("SELECTOR_VAL");
  IElementType SEMI = new ModuleTokenType(";");
  IElementType SEND = new ModuleTokenType("send");
  IElementType SENT = new ModuleTokenType("sent");
  IElementType SLASH = new ModuleTokenType("/");
  IElementType SOFT_IMPLIES = new ModuleTokenType("*->");
  IElementType SQSTRING = new ModuleTokenType("SQSTRING");
  IElementType THEN = new ModuleTokenType("then");
  IElementType TRUE = new ModuleTokenType("true");
  IElementType UNIV = new ModuleTokenType("=..");
  IElementType UNPLUS = new ModuleTokenType("\\+");
  IElementType USE = new ModuleTokenType("use");
  IElementType VARIABLE = new ModuleTokenType("VARIABLE");
  IElementType VARIANT = new ModuleTokenType("=@=");
  IElementType WHAT = new ModuleTokenType("?");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACTION) {
        return new ModuleActionImpl(node);
      }
      else if (type == ACTION_COMBO) {
        return new ModuleActionComboImpl(node);
      }
      else if (type == ADOPT_ACTION) {
        return new ModuleAdoptActionImpl(node);
      }
      else if (type == BASIC_TERM) {
        return new ModuleBasicTermImpl(node);
      }
      else if (type == BLOCK) {
        return new ModuleBlockImpl(node);
      }
      else if (type == CALLABLE) {
        return new ModuleCallableImpl(node);
      }
      else if (type == CALLABLE_MODULE) {
        return new ModuleCallableModuleImpl(node);
      }
      else if (type == DELETE_ACTION) {
        return new ModuleDeleteActionImpl(node);
      }
      else if (type == DROP_ACTION) {
        return new ModuleDropActionImpl(node);
      }
      else if (type == FILE_REFERENCE) {
        return new ModuleFileReferenceImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new ModuleIdentifierImpl(node);
      }
      else if (type == INSERT_ACTION) {
        return new ModuleInsertActionImpl(node);
      }
      else if (type == LIST) {
        return new ModuleListImpl(node);
      }
      else if (type == MACRO_DEF) {
        return new ModuleMacroDefImpl(node);
      }
      else if (type == MODULE_CLAUSE) {
        return new ModuleModuleClauseImpl(node);
      }
      else if (type == MODULE_NAME) {
        return new ModuleModuleNameImpl(node);
      }
      else if (type == MOOD) {
        return new ModuleMoodImpl(node);
      }
      else if (type == NUMBER) {
        return new ModuleNumberImpl(node);
      }
      else if (type == OPERATOR) {
        return new ModuleOperatorImpl(node);
      }
      else if (type == OPTION) {
        return new ModuleOptionImpl(node);
      }
      else if (type == PREDICATE) {
        return new ModulePredicateImpl(node);
      }
      else if (type == PREDICATE_ACTION) {
        return new ModulePredicateActionImpl(node);
      }
      else if (type == QUERY) {
        return new ModuleQueryImpl(node);
      }
      else if (type == QUERY_LIST) {
        return new ModuleQueryListImpl(node);
      }
      else if (type == RULE) {
        return new ModuleRuleImpl(node);
      }
      else if (type == SELECTOR) {
        return new ModuleSelectorImpl(node);
      }
      else if (type == SEND_ACTION) {
        return new ModuleSendActionImpl(node);
      }
      else if (type == STRING) {
        return new ModuleStringImpl(node);
      }
      else if (type == TERM) {
        return new ModuleTermImpl(node);
      }
      else if (type == TERM_LIST) {
        return new ModuleTermListImpl(node);
      }
      else if (type == USAGE) {
        return new ModuleUsageImpl(node);
      }
      else if (type == USE_CLAUSE) {
        return new ModuleUseClauseImpl(node);
      }
      else if (type == VARIABLE_LIST) {
        return new ModuleVariableListImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
