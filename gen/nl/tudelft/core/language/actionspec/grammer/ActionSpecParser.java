// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.actionspec.grammer;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static nl.tudelft.core.language.actionspec.grammer.ActionSpecTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ActionSpecParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACTION_SPEC) {
      r = actionSpec(b, 0);
    }
    else if (t == AS_CLAUSE) {
      r = asClause(b, 0);
    }
    else if (t == ATOM_IDENTIFIER) {
      r = atomIdentifier(b, 0);
    }
    else if (t == BASIC_TERM) {
      r = basicTerm(b, 0);
    }
    else if (t == CALLABLE) {
      r = callable(b, 0);
    }
    else if (t == FILE_REFERENCE) {
      r = fileReference(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
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
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return specification(b, l + 1);
  }

  /* ********************************************************** */
  // 'define' callable asClause? 'with' 'pre' '{' termList '}' 'post' '{' termList '}'
  public static boolean actionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actionSpec")) return false;
    if (!nextTokenIs(b, DEFINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFINE);
    r = r && callable(b, l + 1);
    r = r && actionSpec_2(b, l + 1);
    r = r && consumeTokens(b, 0, WITH, PRE, OPEN_CURLY);
    r = r && termList(b, l + 1);
    r = r && consumeTokens(b, 0, CLOSE_CURLY, POST, OPEN_CURLY);
    r = r && termList(b, l + 1);
    r = r && consumeToken(b, CLOSE_CURLY);
    exit_section_(b, m, ACTION_SPEC, r);
    return r;
  }

  // asClause?
  private static boolean actionSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actionSpec_2")) return false;
    asClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'as' ('internal' | 'external')
  public static boolean asClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asClause")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && asClause_1(b, l + 1);
    exit_section_(b, m, AS_CLAUSE, r);
    return r;
  }

  // 'internal' | 'external'
  private static boolean asClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "external");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATOM
  public static boolean atomIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomIdentifier")) return false;
    if (!nextTokenIs(b, ATOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATOM);
    exit_section_(b, m, ATOM_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // predicate | VARIABLE | number | string | '(' termList ')' | list | TRUE
  public static boolean basicTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basicTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_TERM, "<basic term>");
    r = predicate(b, l + 1);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = number(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = basicTerm_4(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
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
  // op_disjunction | op_bar | op_implies | op_soft_implies | op_lt | op_unify | op_univ | op_variant | op_not_variant | op_evaluates | op_leq | op_identical | op_not_identical | op_gt | op_ge | op_general_lt | op_general_le | op_general_gt | op_general_ge | op_not_unify | op_partial_unification | op_colon | op_plus | op_minus | op_bitwise_and | op_bitwise_or | op_mult | op_div | op_int_div | op_bitshift_left | op_bitshift_right | op_pow | op_pow2 | op_as | op_not_identical2 | ATOM
  static boolean binaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<operator>");
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
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // complexCallable | identifier
  public static boolean callable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable")) return false;
    if (!nextTokenIs(b, "<callable>", ATOM, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALLABLE, "<callable>");
    r = complexCallable(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier '(' parameters ')'
  static boolean complexCallable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexCallable")) return false;
    if (!nextTokenIs(b, "", ATOM, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, OPAREN);
    r = r && parameters(b, l + 1);
    r = r && consumeToken(b, CPAREN);
    exit_section_(b, m, null, r);
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
  // string | identifier
  public static boolean fileReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fileReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_REFERENCE, "<file reference>");
    r = string(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ATOM | VARIABLE
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, "<identifier>", ATOM, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, ATOM);
    if (!r) r = consumeToken(b, VARIABLE);
    exit_section_(b, l, m, r, false, null);
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
  // VARIABLE ',' parameters | VARIABLE
  static boolean parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters")) return false;
    if (!nextTokenIs(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameters_0(b, l + 1);
    if (!r) r = consumeToken(b, VARIABLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // VARIABLE ',' parameters
  private static boolean parameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARIABLE, COMMA);
    r = r && parameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // atomIdentifier ['(' termList ')']
  public static boolean predicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate")) return false;
    if (!nextTokenIs(b, ATOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atomIdentifier(b, l + 1);
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
  // op_plus | op_minus | op_not
  static boolean prefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<operator>");
    r = op_plus(b, l + 1);
    if (!r) r = op_minus(b, l + 1);
    if (!r) r = op_not(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !('define')
  static boolean recover_actionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_actionSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, DEFINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !('use'|'define')
  static boolean recover_topClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_topClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_topClause_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'use'|'define'
  private static boolean recover_topClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_topClause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    if (!r) r = consumeToken(b, DEFINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // useClause+ actionSpec+
  static boolean specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specification")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = specification_0(b, l + 1);
    r = r && specification_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // useClause+
  private static boolean specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = useClause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!useClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "specification_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // actionSpec+
  private static boolean specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specification_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actionSpec(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!actionSpec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "specification_1", c)) break;
      c = current_position_(b);
    }
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
  // 'knowledge'
  public static boolean usage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usage")) return false;
    if (!nextTokenIs(b, KNOWLEDGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KNOWLEDGE);
    exit_section_(b, m, USAGE, r);
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

  final static Parser recover_topClause_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recover_topClause(b, l + 1);
    }
  };
}
