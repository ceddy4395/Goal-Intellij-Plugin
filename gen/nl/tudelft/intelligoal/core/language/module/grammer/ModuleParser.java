// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ModuleParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACTION) {
      r = action(b, 0);
    }
    else if (t == ACTION_COMBO) {
      r = actionCombo(b, 0);
    }
    else if (t == ADOPT_ACTION) {
      r = adoptAction(b, 0);
    }
    else if (t == BASIC_TERM) {
      r = basicTerm(b, 0);
    }
    else if (t == BLOCK) {
      r = block(b, 0);
    }
    else if (t == CALLABLE) {
      r = callable(b, 0);
    }
    else if (t == CALLABLE_MODULE) {
      r = callableModule(b, 0);
    }
    else if (t == DELETE_ACTION) {
      r = deleteAction(b, 0);
    }
    else if (t == DROP_ACTION) {
      r = dropAction(b, 0);
    }
    else if (t == FILE_REFERENCE) {
      r = fileReference(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == INSERT_ACTION) {
      r = insertAction(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == MACRO_DEF) {
      r = macroDef(b, 0);
    }
    else if (t == MODULE_CLAUSE) {
      r = moduleClause(b, 0);
    }
    else if (t == MODULE_NAME) {
      r = moduleName(b, 0);
    }
    else if (t == MOOD) {
      r = mood(b, 0);
    }
    else if (t == NUMBER) {
      r = number(b, 0);
    }
    else if (t == OPERATOR) {
      r = operator(b, 0);
    }
    else if (t == OPTION) {
      r = option(b, 0);
    }
    else if (t == PREDICATE) {
      r = predicate(b, 0);
    }
    else if (t == PREDICATE_ACTION) {
      r = predicateAction(b, 0);
    }
    else if (t == QUERY) {
      r = query(b, 0);
    }
    else if (t == QUERY_LIST) {
      r = queryList(b, 0);
    }
    else if (t == RULE) {
      r = rule(b, 0);
    }
    else if (t == SELECTOR) {
      r = selector(b, 0);
    }
    else if (t == SEND_ACTION) {
      r = sendAction(b, 0);
    }
    else if (t == STRING) {
      r = string(b, 0);
    }
    else if (t == TERM) {
      r = term(b, 0);
    }
    else if (t == TERM_LIST) {
      r = termList(b, 0);
    }
    else if (t == USAGE) {
      r = usage(b, 0);
    }
    else if (t == USE_CLAUSE) {
      r = useClause(b, 0);
    }
    else if (t == VARIABLE_LIST) {
      r = variableList(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return moduleFile(b, l + 1);
  }

  /* ********************************************************** */
  // selectorAction | generalAction | predicateAction
  public static boolean action(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTION, "<action>");
    r = selectorAction(b, l + 1);
    if (!r) r = generalAction(b, l + 1);
    if (!r) r = predicateAction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // action ('+' action)*
  public static boolean actionCombo(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actionCombo")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTION_COMBO, "<action combo>");
    r = action(b, l + 1);
    r = r && actionCombo_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('+' action)*
  private static boolean actionCombo_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actionCombo_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!actionCombo_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "actionCombo_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+' action
  private static boolean actionCombo_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actionCombo_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && action(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block | (actionCombo '.')
  static boolean actionSet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actionSet")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    if (!r) r = actionSet_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // actionCombo '.'
  private static boolean actionSet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actionSet_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actionCombo(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'adopt' '(' termList ')'
  public static boolean adoptAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adoptAction")) return false;
    if (!nextTokenIs(b, ADOPT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ADOPT, OPAREN);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, ADOPT_ACTION, r);
    return r;
  }

  /* ********************************************************** */
  // predicate | VARIABLE | number | string | '(' termList ')' | list
  public static boolean basicTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basicTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_TERM, "<term>");
    r = predicate(b, l + 1);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = number(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = basicTerm_4(b, l + 1);
    if (!r) r = list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' termList ')'
  private static boolean basicTerm_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basicTerm_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPAREN);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'bel' '(' termList ')'
  static boolean belQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "belQuery")) return false;
    if (!nextTokenIs(b, BEL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, BEL, OPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, termList(b, l + 1));
    r = p && consumeToken(b, CPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // op_disjunction | op_bar | op_implies | op_soft_implies | op_lt | op_unify | op_univ | op_variant | op_not_variant | op_evaluates | op_leq | op_identical | op_not_identical | op_gt | op_ge | op_general_lt | op_general_le | op_general_gt | op_general_ge | op_not_unify | op_partial_unification | op_colon | op_plus | op_minus | op_bitwise_and | op_bitwise_or | op_mult | op_div | op_int_div | op_bitshift_left | op_bitshift_right | op_pow | op_pow2 | op_as | op_not_identical2 | ATOM
  static boolean binaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryOperator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_disjunction(b, l + 1);
    if (!r) r = op_bar(b, l + 1);
    if (!r) r = op_implies(b, l + 1);
    if (!r) r = op_soft_implies(b, l + 1);
    if (!r) r = op_lt(b, l + 1);
    if (!r) r = op_unify(b, l + 1);
    if (!r) r = op_univ(b, l + 1);
    if (!r) r = op_variant(b, l + 1);
    if (!r) r = op_not_variant(b, l + 1);
    if (!r) r = op_evaluates(b, l + 1);
    if (!r) r = op_leq(b, l + 1);
    if (!r) r = op_identical(b, l + 1);
    if (!r) r = op_not_identical(b, l + 1);
    if (!r) r = op_gt(b, l + 1);
    if (!r) r = op_ge(b, l + 1);
    if (!r) r = op_general_lt(b, l + 1);
    if (!r) r = op_general_le(b, l + 1);
    if (!r) r = op_general_gt(b, l + 1);
    if (!r) r = op_general_ge(b, l + 1);
    if (!r) r = op_not_unify(b, l + 1);
    if (!r) r = op_partial_unification(b, l + 1);
    if (!r) r = op_colon(b, l + 1);
    if (!r) r = op_plus(b, l + 1);
    if (!r) r = op_minus(b, l + 1);
    if (!r) r = op_bitwise_and(b, l + 1);
    if (!r) r = op_bitwise_or(b, l + 1);
    if (!r) r = op_mult(b, l + 1);
    if (!r) r = op_div(b, l + 1);
    if (!r) r = op_int_div(b, l + 1);
    if (!r) r = op_bitshift_left(b, l + 1);
    if (!r) r = op_bitshift_right(b, l + 1);
    if (!r) r = op_pow(b, l + 1);
    if (!r) r = op_pow2(b, l + 1);
    if (!r) r = op_as(b, l + 1);
    if (!r) r = op_not_identical2(b, l + 1);
    if (!r) r = consumeToken(b, ATOM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' rule+ '}'
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, OPEN_CURLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, null);
    r = consumeToken(b, OPEN_CURLY);
    p = r; // pin = 1
    r = r && report_error_(b, block_1(b, l + 1));
    r = p && consumeToken(b, CLOSE_CURLY) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // rule+
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!rule(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATOM ['(' variableList ')']
  public static boolean callable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable")) return false;
    if (!nextTokenIs(b, ATOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATOM);
    r = r && callable_1(b, l + 1);
    exit_section_(b, m, CALLABLE, r);
    return r;
  }

  // ['(' variableList ')']
  private static boolean callable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable_1")) return false;
    callable_1_0(b, l + 1);
    return true;
  }

  // '(' variableList ')'
  private static boolean callable_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPAREN);
    r = r && variableList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // moduleName ['(' variableList ')']
  public static boolean callableModule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callableModule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALLABLE_MODULE, "<callable module>");
    r = moduleName(b, l + 1);
    r = r && callableModule_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['(' variableList ')']
  private static boolean callableModule_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callableModule_1")) return false;
    callableModule_1_0(b, l + 1);
    return true;
  }

  // '(' variableList ')'
  private static boolean callableModule_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callableModule_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPAREN);
    r = r && variableList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'delete' '(' termList ')'
  public static boolean deleteAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deleteAction")) return false;
    if (!nextTokenIs(b, DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DELETE, OPAREN);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, DELETE_ACTION, r);
    return r;
  }

  /* ********************************************************** */
  // 'drop' '(' termList ')'
  public static boolean dropAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dropAction")) return false;
    if (!nextTokenIs(b, DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DROP, OPAREN);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, DROP_ACTION, r);
    return r;
  }

  /* ********************************************************** */
  // '(' nakedTerm ')'
  static boolean enclosedTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enclosedTerm")) return false;
    if (!nextTokenIs(b, "<term>", OPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<term>");
    r = consumeToken(b, OPAREN);
    r = r && nakedTerm(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'exit' '=' EXIT_VAL '.'
  static boolean exitProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exitProperty")) return false;
    if (!nextTokenIs(b, EXIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, EXIT, EQ, EXIT_VAL, DOT);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // string | VARIABLE | ATOM
  public static boolean fileReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fileReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_REFERENCE, "<file reference>");
    r = string(b, l + 1);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = consumeToken(b, ATOM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'focus' '=' FOCUS_VAL '.'
  static boolean focusProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "focusProperty")) return false;
    if (!nextTokenIs(b, FOCUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, FOCUS, EQ, FOCUS_VAL, DOT);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'forall' queryList 'do' actionSet
  static boolean forallRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forallRule")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FORALL);
    p = r; // pin = 1
    r = r && report_error_(b, queryList(b, l + 1));
    r = p && report_error_(b, consumeToken(b, DO)) && r;
    r = p && actionSet(b, l + 1) && r;
    exit_section_(b, l, m, r, p, recover_rule_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // 'exit-module' | logAction | printAction
  static boolean generalAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generalAction")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXIT_MODULE);
    if (!r) r = logAction(b, l + 1);
    if (!r) r = printAction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('goal' | 'a-goal' | 'goal-a') '(' termList ')'
  static boolean goalQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goalQuery")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = goalQuery_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, OPAREN));
    r = p && report_error_(b, termList(b, l + 1)) && r;
    r = p && consumeToken(b, CPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'goal' | 'a-goal' | 'goal-a'
  private static boolean goalQuery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goalQuery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GOAL);
    if (!r) r = consumeToken(b, AGOAL);
    if (!r) r = consumeToken(b, GOALA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATOM | VARIABLE | 'true' | 'define' | 'module' | 'order' | 'exit' | 'focus' | 'bel' | 'percept' | 'goal' | 'if' | 'then' | 'forall' | 'do' | 'listall' | 'send' | 'sent' | 'log' | 'print' | 'insert' | 'delete' | 'adopt' | 'drop' | BASIC_USAGE_VAL | ORDER_VAL | EXIT_VAL | FOCUS_VAL | SELECTOR_VAL | 'not'
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, ATOM);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, DEFINE);
    if (!r) r = consumeToken(b, MODULE);
    if (!r) r = consumeToken(b, ORDER);
    if (!r) r = consumeToken(b, EXIT);
    if (!r) r = consumeToken(b, FOCUS);
    if (!r) r = consumeToken(b, BEL);
    if (!r) r = consumeToken(b, PERCEPT);
    if (!r) r = consumeToken(b, GOAL);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, THEN);
    if (!r) r = consumeToken(b, FORALL);
    if (!r) r = consumeToken(b, DO);
    if (!r) r = consumeToken(b, LISTALL);
    if (!r) r = consumeToken(b, SEND);
    if (!r) r = consumeToken(b, SENT);
    if (!r) r = consumeToken(b, LOG);
    if (!r) r = consumeToken(b, PRINT);
    if (!r) r = consumeToken(b, INSERT);
    if (!r) r = consumeToken(b, DELETE);
    if (!r) r = consumeToken(b, ADOPT);
    if (!r) r = consumeToken(b, DROP);
    if (!r) r = consumeToken(b, BASIC_USAGE_VAL);
    if (!r) r = consumeToken(b, ORDER_VAL);
    if (!r) r = consumeToken(b, EXIT_VAL);
    if (!r) r = consumeToken(b, FOCUS_VAL);
    if (!r) r = consumeToken(b, SELECTOR_VAL);
    if (!r) r = consumeToken(b, NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'if' queryList 'then' actionSet
  static boolean ifRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifRule")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, IF);
    p = r; // pin = 1
    r = r && report_error_(b, queryList(b, l + 1));
    r = p && report_error_(b, consumeToken(b, THEN)) && r;
    r = p && actionSet(b, l + 1) && r;
    exit_section_(b, l, m, r, p, recover_rule_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // 'insert' '(' termList ')'
  public static boolean insertAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertAction")) return false;
    if (!nextTokenIs(b, INSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSERT, OPAREN);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, INSERT_ACTION, r);
    return r;
  }

  /* ********************************************************** */
  // 'not' '(' simpleQuery ')'
  static boolean invertedQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invertedQuery")) return false;
    if (!nextTokenIs(b, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, OPAREN);
    r = r && simpleQuery(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' termList ']'
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, OBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBRACKET);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CBRACKET);
    exit_section_(b, m, LIST, r);
    return r;
  }

  /* ********************************************************** */
  // 'listall' VARIABLE '<-' 'do' actionSet
  static boolean listallRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listallRule")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, LISTALL, VARIABLE, REVERSE_SNEK, DO);
    p = r; // pin = 1
    r = r && actionSet(b, l + 1);
    exit_section_(b, l, m, r, p, recover_rule_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // 'log' '(' termList ')'
  static boolean logAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logAction")) return false;
    if (!nextTokenIs(b, LOG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOG, OPAREN);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'define' callable 'as' queryList '.'
  public static boolean macroDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macroDef")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MACRO_DEF, "<macro def>");
    r = consumeToken(b, DEFINE);
    p = r; // pin = 1
    r = r && report_error_(b, callable(b, l + 1));
    r = p && report_error_(b, consumeToken(b, AS)) && r;
    r = p && report_error_(b, queryList(b, l + 1)) && r;
    r = p && consumeToken(b, DOT) && r;
    exit_section_(b, l, m, r, p, recover_topClause_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // 'sent' mood? '(' termList ')'
  static boolean mailQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mailQuery")) return false;
    if (!nextTokenIs(b, SENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, SENT);
    p = r; // pin = 1
    r = r && report_error_(b, mailQuery_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OPAREN)) && r;
    r = p && report_error_(b, termList(b, l + 1)) && r;
    r = p && consumeToken(b, CPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // mood?
  private static boolean mailQuery_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mailQuery_1")) return false;
    mood(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'module' callableModule block
  public static boolean moduleClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleClause")) return false;
    if (!nextTokenIs(b, MODULE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MODULE_CLAUSE, null);
    r = consumeToken(b, MODULE);
    p = r; // pin = 1
    r = r && report_error_(b, callableModule(b, l + 1));
    r = p && block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // useClause+ option* macroDef* moduleClause
  static boolean moduleFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleFile")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = moduleFile_0(b, l + 1);
    r = r && moduleFile_1(b, l + 1);
    r = r && moduleFile_2(b, l + 1);
    r = r && moduleClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // useClause+
  private static boolean moduleFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = useClause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!useClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "moduleFile_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // option*
  private static boolean moduleFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleFile_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!option(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "moduleFile_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // macroDef*
  private static boolean moduleFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleFile_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!macroDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "moduleFile_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // string | VARIABLE | ATOM
  public static boolean moduleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_NAME, "<module name>");
    r = string(b, l + 1);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = consumeToken(b, ATOM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':' | '?' | '!'
  public static boolean mood(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mood")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MOOD, "<mood>");
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, WHAT);
    if (!r) r = consumeToken(b, BANG);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // basicTerm (binaryOperator basicTerm)+ | prefixOperator+ basicTerm+ | basicTerm
  static boolean nakedTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nakedTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<term>");
    r = nakedTerm_0(b, l + 1);
    if (!r) r = nakedTerm_1(b, l + 1);
    if (!r) r = basicTerm(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // basicTerm (binaryOperator basicTerm)+
  private static boolean nakedTerm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nakedTerm_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basicTerm(b, l + 1);
    r = r && nakedTerm_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (binaryOperator basicTerm)+
  private static boolean nakedTerm_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nakedTerm_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nakedTerm_0_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!nakedTerm_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nakedTerm_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // binaryOperator basicTerm
  private static boolean nakedTerm_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nakedTerm_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binaryOperator(b, l + 1);
    r = r && basicTerm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prefixOperator+ basicTerm+
  private static boolean nakedTerm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nakedTerm_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nakedTerm_1_0(b, l + 1);
    r = r && nakedTerm_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prefixOperator+
  private static boolean nakedTerm_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nakedTerm_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefixOperator(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!prefixOperator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nakedTerm_1_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // basicTerm+
  private static boolean nakedTerm_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nakedTerm_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basicTerm(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!basicTerm(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nakedTerm_1_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER | REAL
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIs(b, "<number>", INTEGER, REAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER, "<number>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, REAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'as'
  static boolean op_as(PsiBuilder b, int l) {
    return consumeToken(b, AS);
  }

  /* ********************************************************** */
  // "|"
  static boolean op_bar(PsiBuilder b, int l) {
    return consumeToken(b, BAR);
  }

  /* ********************************************************** */
  // '<<'
  static boolean op_bitshift_left(PsiBuilder b, int l) {
    return consumeToken(b, BITSHIFT_LEFT);
  }

  /* ********************************************************** */
  // '>>'
  static boolean op_bitshift_right(PsiBuilder b, int l) {
    return consumeToken(b, BITSHIFT_RIGHT);
  }

  /* ********************************************************** */
  // '/\'
  static boolean op_bitwise_and(PsiBuilder b, int l) {
    return consumeToken(b, BITWISE_AND);
  }

  /* ********************************************************** */
  // '\/'
  static boolean op_bitwise_or(PsiBuilder b, int l) {
    return consumeToken(b, BITWISE_OR);
  }

  /* ********************************************************** */
  // ':'
  static boolean op_colon(PsiBuilder b, int l) {
    return consumeToken(b, COLON);
  }

  /* ********************************************************** */
  // ";"
  static boolean op_disjunction(PsiBuilder b, int l) {
    return consumeToken(b, SEMI);
  }

  /* ********************************************************** */
  // '/'
  static boolean op_div(PsiBuilder b, int l) {
    return consumeToken(b, SLASH);
  }

  /* ********************************************************** */
  // "=:="
  static boolean op_evaluates(PsiBuilder b, int l) {
    return consumeToken(b, EVALUATES);
  }

  /* ********************************************************** */
  // ">="
  static boolean op_ge(PsiBuilder b, int l) {
    return consumeToken(b, GE);
  }

  /* ********************************************************** */
  // "@>="
  static boolean op_general_ge(PsiBuilder b, int l) {
    return consumeToken(b, GENERAL_GE);
  }

  /* ********************************************************** */
  // "@>"
  static boolean op_general_gt(PsiBuilder b, int l) {
    return consumeToken(b, GENERAL_GT);
  }

  /* ********************************************************** */
  // "@=<"
  static boolean op_general_le(PsiBuilder b, int l) {
    return consumeToken(b, GENERAL_LE);
  }

  /* ********************************************************** */
  // "@<"
  static boolean op_general_lt(PsiBuilder b, int l) {
    return consumeToken(b, GENERAL_LT);
  }

  /* ********************************************************** */
  // ">"
  static boolean op_gt(PsiBuilder b, int l) {
    return consumeToken(b, GT);
  }

  /* ********************************************************** */
  // "=="
  static boolean op_identical(PsiBuilder b, int l) {
    return consumeToken(b, IDENTICAL);
  }

  /* ********************************************************** */
  // "->"
  static boolean op_implies(PsiBuilder b, int l) {
    return consumeToken(b, IMPLIES);
  }

  /* ********************************************************** */
  // "//"
  static boolean op_int_div(PsiBuilder b, int l) {
    return consumeToken(b, INT_DIV);
  }

  /* ********************************************************** */
  // '\'
  static boolean op_inv(PsiBuilder b, int l) {
    return consumeToken(b, INV);
  }

  /* ********************************************************** */
  // 'is'
  static boolean op_is(PsiBuilder b, int l) {
    return consumeToken(b, "is");
  }

  /* ********************************************************** */
  // "=<"
  static boolean op_leq(PsiBuilder b, int l) {
    return consumeToken(b, LEQ);
  }

  /* ********************************************************** */
  // "<"
  static boolean op_lt(PsiBuilder b, int l) {
    return consumeToken(b, LT);
  }

  /* ********************************************************** */
  // '-'
  static boolean op_minus(PsiBuilder b, int l) {
    return consumeToken(b, MINUS);
  }

  /* ********************************************************** */
  // "*"
  static boolean op_mult(PsiBuilder b, int l) {
    return consumeToken(b, MULT);
  }

  /* ********************************************************** */
  // "\+"
  static boolean op_not(PsiBuilder b, int l) {
    return consumeToken(b, UNPLUS);
  }

  /* ********************************************************** */
  // "=\="
  static boolean op_not_identical(PsiBuilder b, int l) {
    return consumeToken(b, NOT_IDENTICAL);
  }

  /* ********************************************************** */
  // "\=="
  static boolean op_not_identical2(PsiBuilder b, int l) {
    return consumeToken(b, NOT_IDENTICAL);
  }

  /* ********************************************************** */
  // "\="
  static boolean op_not_unify(PsiBuilder b, int l) {
    return consumeToken(b, NOT_UNIFY);
  }

  /* ********************************************************** */
  // "\=@="
  static boolean op_not_variant(PsiBuilder b, int l) {
    return consumeToken(b, NOT_VARIANT);
  }

  /* ********************************************************** */
  // ">:<"
  static boolean op_partial_unification(PsiBuilder b, int l) {
    return consumeToken(b, PARTIAL_UNIFICATION);
  }

  /* ********************************************************** */
  // '+'
  static boolean op_plus(PsiBuilder b, int l) {
    return consumeToken(b, PLUS);
  }

  /* ********************************************************** */
  // '**'
  static boolean op_pow(PsiBuilder b, int l) {
    return consumeToken(b, POW);
  }

  /* ********************************************************** */
  // '^'
  static boolean op_pow2(PsiBuilder b, int l) {
    return consumeToken(b, POW2);
  }

  /* ********************************************************** */
  // "*->"
  static boolean op_soft_implies(PsiBuilder b, int l) {
    return consumeToken(b, SOFT_IMPLIES);
  }

  /* ********************************************************** */
  // "="
  static boolean op_unify(PsiBuilder b, int l) {
    return consumeToken(b, EQ);
  }

  /* ********************************************************** */
  // "=.."
  static boolean op_univ(PsiBuilder b, int l) {
    return consumeToken(b, UNIV);
  }

  /* ********************************************************** */
  // "=@="
  static boolean op_variant(PsiBuilder b, int l) {
    return consumeToken(b, VARIANT);
  }

  /* ********************************************************** */
  // binaryOperator | prefixOperator
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = binaryOperator(b, l + 1);
    if (!r) r = prefixOperator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // exitProperty | focusProperty | orderProperty
  public static boolean option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "option")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPTION, "<option>");
    r = exitProperty(b, l + 1);
    if (!r) r = focusProperty(b, l + 1);
    if (!r) r = orderProperty(b, l + 1);
    exit_section_(b, l, m, r, false, recover_topClause_parser_);
    return r;
  }

  /* ********************************************************** */
  // 'order' '=' ORDER_VAL '.'
  static boolean orderProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderProperty")) return false;
    if (!nextTokenIs(b, ORDER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, ORDER, EQ, ORDER_VAL, DOT);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'percept' '(' termList ')'
  static boolean perceptQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perceptQuery")) return false;
    if (!nextTokenIs(b, PERCEPT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, PERCEPT, OPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, termList(b, l + 1));
    r = p && consumeToken(b, CPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier ['(' termList ')']
  public static boolean predicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREDICATE, "<predicate>");
    r = identifier(b, l + 1);
    r = r && predicate_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['(' termList ')']
  private static boolean predicate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate_1")) return false;
    predicate_1_0(b, l + 1);
    return true;
  }

  // '(' termList ')'
  private static boolean predicate_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPAREN);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // predicate
  public static boolean predicateAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicateAction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREDICATE_ACTION, "<predicate action>");
    r = predicate(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // op_plus | op_minus | op_not
  static boolean prefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixOperator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_plus(b, l + 1);
    if (!r) r = op_minus(b, l + 1);
    if (!r) r = op_not(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'print' '(' term ')'
  static boolean printAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "printAction")) return false;
    if (!nextTokenIs(b, PRINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PRINT, OPAREN);
    r = r && term(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // invertedQuery | simpleQuery
  public static boolean query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY, "<query>");
    r = invertedQuery(b, l + 1);
    if (!r) r = simpleQuery(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // query (',' query)*
  public static boolean queryList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_LIST, "<query>");
    r = query(b, l + 1);
    r = r && queryList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' query)*
  private static boolean queryList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!queryList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "queryList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' query
  private static boolean queryList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && query(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('if'|'forall'|'listall'|'}')
  static boolean recover_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_rule_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'if'|'forall'|'listall'|'}'
  private static boolean recover_rule_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_rule_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, FORALL);
    if (!r) r = consumeToken(b, LISTALL);
    if (!r) r = consumeToken(b, CLOSE_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('use'|'define'|'exit'|'focus'|'order'|'module')
  static boolean recover_topClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_topClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_topClause_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'use'|'define'|'exit'|'focus'|'order'|'module'
  private static boolean recover_topClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_topClause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    if (!r) r = consumeToken(b, DEFINE);
    if (!r) r = consumeToken(b, EXIT);
    if (!r) r = consumeToken(b, FOCUS);
    if (!r) r = consumeToken(b, ORDER);
    if (!r) r = consumeToken(b, MODULE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ifRule | forallRule | listallRule
  public static boolean rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE, "<rule>");
    r = ifRule(b, l + 1);
    if (!r) r = forallRule(b, l + 1);
    if (!r) r = listallRule(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SELECTOR_VAL | '(' (VARIABLE | ATOM) ')'
  public static boolean selector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector")) return false;
    if (!nextTokenIs(b, "<selector>", OPAREN, SELECTOR_VAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTOR, "<selector>");
    r = consumeToken(b, SELECTOR_VAL);
    if (!r) r = selector_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' (VARIABLE | ATOM) ')'
  private static boolean selector_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPAREN);
    r = r && selector_1_1(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // VARIABLE | ATOM
  private static boolean selector_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLE);
    if (!r) r = consumeToken(b, ATOM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (selector '.')? (insertAction | deleteAction | adoptAction | dropAction | sendAction)
  static boolean selectorAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorAction")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectorAction_0(b, l + 1);
    r = r && selectorAction_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (selector '.')?
  private static boolean selectorAction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorAction_0")) return false;
    selectorAction_0_0(b, l + 1);
    return true;
  }

  // selector '.'
  private static boolean selectorAction_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorAction_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selector(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // insertAction | deleteAction | adoptAction | dropAction | sendAction
  private static boolean selectorAction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorAction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = insertAction(b, l + 1);
    if (!r) r = deleteAction(b, l + 1);
    if (!r) r = adoptAction(b, l + 1);
    if (!r) r = dropAction(b, l + 1);
    if (!r) r = sendAction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (selector '.')? (belQuery | goalQuery | perceptQuery | mailQuery)
  static boolean selectorQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorQuery")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectorQuery_0(b, l + 1);
    r = r && selectorQuery_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (selector '.')?
  private static boolean selectorQuery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorQuery_0")) return false;
    selectorQuery_0_0(b, l + 1);
    return true;
  }

  // selector '.'
  private static boolean selectorQuery_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorQuery_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selector(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // belQuery | goalQuery | perceptQuery | mailQuery
  private static boolean selectorQuery_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectorQuery_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = belQuery(b, l + 1);
    if (!r) r = goalQuery(b, l + 1);
    if (!r) r = perceptQuery(b, l + 1);
    if (!r) r = mailQuery(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'send' mood? '(' termList ')'
  public static boolean sendAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sendAction")) return false;
    if (!nextTokenIs(b, SEND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEND);
    r = r && sendAction_1(b, l + 1);
    r = r && consumeToken(b, OPAREN);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, SEND_ACTION, r);
    return r;
  }

  // mood?
  private static boolean sendAction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sendAction_1")) return false;
    mood(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // selectorQuery | predicate
  static boolean simpleQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleQuery")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectorQuery(b, l + 1);
    if (!r) r = predicate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DQSTRING | SQSTRING
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "<string>", DQSTRING, SQSTRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, DQSTRING);
    if (!r) r = consumeToken(b, SQSTRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // enclosedTerm | nakedTerm
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = enclosedTerm(b, l + 1);
    if (!r) r = nakedTerm(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // term (',' term)*
  public static boolean termList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "termList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM_LIST, "<term>");
    r = term(b, l + 1);
    r = r && termList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' term)*
  private static boolean termList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "termList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!termList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "termList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' term
  private static boolean termList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "termList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BASIC_USAGE_VAL | 'module'
  public static boolean usage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usage")) return false;
    if (!nextTokenIs(b, "<usage>", MODULE, BASIC_USAGE_VAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USAGE, "<usage>");
    r = consumeToken(b, BASIC_USAGE_VAL);
    if (!r) r = consumeToken(b, MODULE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'use' fileReference ('as' usage)? '.'
  public static boolean useClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useClause")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USE_CLAUSE, "<use clause>");
    r = consumeToken(b, USE);
    p = r; // pin = 1
    r = r && report_error_(b, fileReference(b, l + 1));
    r = p && report_error_(b, useClause_2(b, l + 1)) && r;
    r = p && consumeToken(b, DOT) && r;
    exit_section_(b, l, m, r, p, recover_topClause_parser_);
    return r || p;
  }

  // ('as' usage)?
  private static boolean useClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useClause_2")) return false;
    useClause_2_0(b, l + 1);
    return true;
  }

  // 'as' usage
  private static boolean useClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && usage(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE (',' VARIABLE)*
  public static boolean variableList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableList")) return false;
    if (!nextTokenIs(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLE);
    r = r && variableList_1(b, l + 1);
    exit_section_(b, m, VARIABLE_LIST, r);
    return r;
  }

  // (',' VARIABLE)*
  private static boolean variableList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variableList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' VARIABLE
  private static boolean variableList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, VARIABLE);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser recover_rule_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recover_rule(b, l + 1);
    }
  };
  final static Parser recover_topClause_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recover_topClause(b, l + 1);
    }
  };
}
