// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static nl.tudelft.intelligoal.core.language.prolog.grammer.PrologTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PrologParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CALLABLE) {
      r = callable(b, 0);
    }
    else if (t == CLAUSE) {
      r = clause(b, 0);
    }
    else if (t == DIRECTIVE_CLAUSE) {
      r = directiveClause(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == NUMBER) {
      r = number(b, 0);
    }
    else if (t == OPERATOR) {
      r = operator(b, 0);
    }
    else if (t == PREDICATE) {
      r = predicate(b, 0);
    }
    else if (t == PREDICATE_SPEC) {
      r = predicateSpec(b, 0);
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
    else if (t == VARIABLE_LIST) {
      r = variableList(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return prologFile(b, l + 1);
  }

  /* ********************************************************** */
  // predicate | VARIABLE | number | string | '(' termList ')' | list | '!'
  static boolean basicTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basicTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<term>");
    r = predicate(b, l + 1);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = number(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = basicTerm_4(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = consumeToken(b, CUT);
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
  // op_disjunction | op_bar | op_implies | op_soft_implies | op_lt | op_unify | op_univ | op_variant | op_not_variant | op_evaluates | op_leq | op_identical | op_not_identical | op_gt | op_ge | op_general_lt | op_general_le | op_general_gt | op_general_ge | op_not_unify | op_partial_unification | op_colon | op_plus | op_minus | op_bitwise_and | op_bitwise_or | op_mult | op_div | op_int_div | op_bitshift_left | op_bitshift_right | op_pow | op_pow2 | op_as | op_is | op_not_identical2
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
    if (!r) r = op_is(b, l + 1);
    if (!r) r = op_not_identical2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATOM '(' variableList ')' | ATOM
  public static boolean callable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable")) return false;
    if (!nextTokenIs(b, ATOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = callable_0(b, l + 1);
    if (!r) r = consumeToken(b, ATOM);
    exit_section_(b, m, CALLABLE, r);
    return r;
  }

  // ATOM '(' variableList ')'
  private static boolean callable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ATOM, OPAREN);
    r = r && variableList(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (rule | fact) '.'
  public static boolean clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLAUSE, "<clause>");
    r = clause_0(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, recover_clause_parser_);
    return r;
  }

  // rule | fact
  private static boolean clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule(b, l + 1);
    if (!r) r = fact(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':-' DIRECTIVE predicateSpecList '.'
  public static boolean directiveClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directiveClause")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DIRECTIVE_CLAUSE, "<directive clause>");
    r = consumeTokens(b, 1, NECK, DIRECTIVE);
    p = r; // pin = 1
    r = r && report_error_(b, predicateSpecList(b, l + 1));
    r = p && consumeToken(b, DOT) && r;
    exit_section_(b, l, m, r, p, recover_clause_parser_);
    return r || p;
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
  // predicate
  static boolean fact(PsiBuilder b, int l) {
    return predicate(b, l + 1);
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
    return consumeToken(b, IS);
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
    return consumeToken(b, NOT);
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
    return consumeToken(b, UNIFY);
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
  // ATOM ['(' termList ')']
  public static boolean predicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate")) return false;
    if (!nextTokenIs(b, ATOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATOM);
    r = r && predicate_1(b, l + 1);
    exit_section_(b, m, PREDICATE, r);
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
  // ATOM '/' INTEGER
  public static boolean predicateSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicateSpec")) return false;
    if (!nextTokenIs(b, ATOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ATOM, SLASH, INTEGER);
    exit_section_(b, m, PREDICATE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // predicateSpec (',' predicateSpec)*
  static boolean predicateSpecList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicateSpecList")) return false;
    if (!nextTokenIs(b, ATOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = predicateSpec(b, l + 1);
    r = r && predicateSpecList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' predicateSpec)*
  private static boolean predicateSpecList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicateSpecList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!predicateSpecList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "predicateSpecList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' predicateSpec
  private static boolean predicateSpecList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicateSpecList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && predicateSpec(b, l + 1);
    exit_section_(b, m, null, r);
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
  // (directiveClause | clause) *
  static boolean prologFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!prologFile_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prologFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // directiveClause | clause
  private static boolean prologFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = directiveClause(b, l + 1);
    if (!r) r = clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(clause|directiveClause)
  static boolean recover_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_clause_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // clause|directiveClause
  private static boolean recover_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_clause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clause(b, l + 1);
    if (!r) r = directiveClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // predicate ':-' termList
  static boolean rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule")) return false;
    if (!nextTokenIs(b, ATOM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = predicate(b, l + 1);
    r = r && consumeToken(b, NECK);
    p = r; // pin = 2
    r = r && termList(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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

  final static Parser recover_clause_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recover_clause(b, l + 1);
    }
  };
}
