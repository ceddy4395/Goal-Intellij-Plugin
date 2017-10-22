// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static nl.tudelft.core.language.psi.GOALType.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GOALParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == AGENT_BLOCK) {
      r = agentBlock(b, 0);
    }
    else if (t == CONSTRAINT) {
      r = constraint(b, 0);
    }
    else if (t == CONSTRAINT_LIST) {
      r = constraintList(b, 0);
    }
    else if (t == ENTITY) {
      r = entity(b, 0);
    }
    else if (t == ENVIRONMENT_PROPERTY) {
      r = environmentProperty(b, 0);
    }
    else if (t == ENVIRONMENT_PROPERTY_LIST) {
      r = environmentPropertyList(b, 0);
    }
    else if (t == ENVIRONMENT_SPEC) {
      r = environmentSpec(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == INSTRUCTION) {
      r = instruction(b, 0);
    }
    else if (t == INSTRUCTION_LIST) {
      r = instructionList(b, 0);
    }
    else if (t == LAUNCH_POLICY) {
      r = launchPolicy(b, 0);
    }
    else if (t == LAUNCH_RULE) {
      r = launchRule(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == MAS_FILE) {
      r = masFile(b, 0);
    }
    else if (t == MODULE_ID) {
      r = moduleId(b, 0);
    }
    else if (t == MODULE_STRING) {
      r = moduleString(b, 0);
    }
    else if (t == NUMBER_LITERAL) {
      r = numberLiteral(b, 0);
    }
    else if (t == SIMPLE_IDENTIFIER) {
      r = simpleIdentifier(b, 0);
    }
    else if (t == STRING) {
      r = string(b, 0);
    }
    else if (t == TERM_LIST) {
      r = termList(b, 0);
    }
    else if (t == USE_CASE) {
      r = useCase(b, 0);
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
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // 'define' identifier 'as' '{' useClause+ '}'
  public static boolean agentBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agentBlock")) return false;
    if (!nextTokenIs(b, DEFINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFINE);
    r = r && identifier(b, l + 1);
    r = r && consumeTokens(b, 0, AS, OCURLY);
    r = r && agentBlock_4(b, l + 1);
    r = r && consumeToken(b, CCURLY);
    exit_section_(b, m, AGENT_BLOCK, r);
    return r;
  }

  // useClause+
  private static boolean agentBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agentBlock_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = useClause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!useClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "agentBlock_4", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('name' '=' identifier) | ('number' '=' numberLiteral) | ('max' '=' numberLiteral)
  public static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT, "<constraint>");
    r = constraint_0(b, l + 1);
    if (!r) r = constraint_1(b, l + 1);
    if (!r) r = constraint_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'name' '=' identifier
  private static boolean constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAME, EQ);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'number' '=' numberLiteral
  private static boolean constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, EQ);
    r = r && numberLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'max' '=' numberLiteral
  private static boolean constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAX, EQ);
    r = r && numberLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constraint (',' constraint)*
  public static boolean constraintList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraintList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT_LIST, "<constraint list>");
    r = constraint(b, l + 1);
    r = r && constraintList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' constraint)*
  private static boolean constraintList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraintList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!constraintList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constraintList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' constraint
  private static boolean constraintList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraintList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '*' | ('type' '=' simpleIdentifier) | ('name' '=' simpleIdentifier)
  public static boolean entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY, "<entity>");
    r = consumeToken(b, STAR);
    if (!r) r = entity_1(b, l + 1);
    if (!r) r = entity_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'type' '=' simpleIdentifier
  private static boolean entity_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, EQ);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'name' '=' simpleIdentifier
  private static boolean entity_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAME, EQ);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier '=' (identifier | numberLiteral | list)
  public static boolean environmentProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENVIRONMENT_PROPERTY, "<environment property>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && environmentProperty_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier | numberLiteral | list
  private static boolean environmentProperty_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentProperty_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    if (!r) r = numberLiteral(b, l + 1);
    if (!r) r = list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // environmentProperty (',' environmentProperty)*
  public static boolean environmentPropertyList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentPropertyList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENVIRONMENT_PROPERTY_LIST, "<environment property list>");
    r = environmentProperty(b, l + 1);
    r = r && environmentPropertyList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' environmentProperty)*
  private static boolean environmentPropertyList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentPropertyList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!environmentPropertyList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "environmentPropertyList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' environmentProperty
  private static boolean environmentPropertyList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentPropertyList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && environmentProperty(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'use' string 'as' 'environment' ('with' environmentPropertyList)? '.'
  public static boolean environmentSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentSpec")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && string(b, l + 1);
    r = r && consumeTokens(b, 0, AS, ENVIRONMENT);
    r = r && environmentSpec_4(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, ENVIRONMENT_SPEC, r);
    return r;
  }

  // ('with' environmentPropertyList)?
  private static boolean environmentSpec_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentSpec_4")) return false;
    environmentSpec_4_0(b, l + 1);
    return true;
  }

  // 'with' environmentPropertyList
  private static boolean environmentSpec_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentSpec_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && environmentPropertyList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID | string | atom
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, ID);
    if (!r) r = string(b, l + 1);
    if (!r) r = consumeToken(b, ATOM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ('with' constraintList)?
  public static boolean instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTRUCTION, "<instruction>");
    r = identifier(b, l + 1);
    r = r && instruction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('with' constraintList)?
  private static boolean instruction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction_1")) return false;
    instruction_1_0(b, l + 1);
    return true;
  }

  // 'with' constraintList
  private static boolean instruction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && constraintList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // instruction (',' instruction)*
  public static boolean instructionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instructionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTRUCTION_LIST, "<instruction list>");
    r = instruction(b, l + 1);
    r = r && instructionList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' instruction)*
  private static boolean instructionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instructionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!instructionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "instructionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' instruction
  private static boolean instructionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instructionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && instruction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'launchpolicy' '{' launchRule+ '}'
  public static boolean launchPolicy(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "launchPolicy")) return false;
    if (!nextTokenIs(b, LAUNCHPOLICY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LAUNCHPOLICY, OCURLY);
    r = r && launchPolicy_2(b, l + 1);
    r = r && consumeToken(b, CCURLY);
    exit_section_(b, m, LAUNCH_POLICY, r);
    return r;
  }

  // launchRule+
  private static boolean launchPolicy_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "launchPolicy_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = launchRule(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!launchRule(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "launchPolicy_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('when' entity)? 'launch' instructionList '.'
  public static boolean launchRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "launchRule")) return false;
    if (!nextTokenIs(b, "<launch rule>", LAUNCH, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAUNCH_RULE, "<launch rule>");
    r = launchRule_0(b, l + 1);
    r = r && consumeToken(b, LAUNCH);
    r = r && instructionList(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('when' entity)?
  private static boolean launchRule_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "launchRule_0")) return false;
    launchRule_0_0(b, l + 1);
    return true;
  }

  // 'when' entity
  private static boolean launchRule_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "launchRule_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && entity(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' (termList | list) ']'
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, OBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBRACKET);
    r = r && list_1(b, l + 1);
    r = r && consumeToken(b, CBRACKET);
    exit_section_(b, m, LIST, r);
    return r;
  }

  // termList | list
  private static boolean list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = termList(b, l + 1);
    if (!r) r = list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // environmentSpec? agentBlock+ launchPolicy
  public static boolean masFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "masFile")) return false;
    if (!nextTokenIs(b, "<mas file>", DEFINE, USE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAS_FILE, "<mas file>");
    r = masFile_0(b, l + 1);
    r = r && masFile_1(b, l + 1);
    r = r && launchPolicy(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // environmentSpec?
  private static boolean masFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "masFile_0")) return false;
    environmentSpec(b, l + 1);
    return true;
  }

  // agentBlock+
  private static boolean masFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "masFile_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = agentBlock(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!agentBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "masFile_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string | moduleString
  public static boolean moduleId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleId")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_ID, "<module id>");
    r = string(b, l + 1);
    if (!r) r = moduleString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID ('.' ID)*
  public static boolean moduleString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleString")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && moduleString_1(b, l + 1);
    exit_section_(b, m, MODULE_STRING, r);
    return r;
  }

  // ('.' ID)*
  private static boolean moduleString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleString_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!moduleString_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "moduleString_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' ID
  private static boolean moduleString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleString_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER | REAL
  public static boolean numberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numberLiteral")) return false;
    if (!nextTokenIs(b, "<number literal>", INTEGER, REAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_LITERAL, "<number literal>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, REAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LINE_COMMENT | moduleFile | actionFile | masFile
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, MODULEFILE);
    if (!r) r = consumeToken(b, ACTIONFILE);
    if (!r) r = masFile(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean simpleIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleIdentifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, SIMPLE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // SQSTRING | DQSTRING
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "<string>", DQSTRING, SQSTRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, SQSTRING);
    if (!r) r = consumeToken(b, DQSTRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // term (',' term)*
  public static boolean termList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "termList")) return false;
    if (!nextTokenIs(b, "<term>", TERM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM_LIST, "<term>");
    r = consumeToken(b, TERM);
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
    r = consumeTokens(b, 0, COMMA, TERM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // USE_CASE_VAL 'module'?
  public static boolean useCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useCase")) return false;
    if (!nextTokenIs(b, USE_CASE_VAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE_CASE_VAL);
    r = r && useCase_1(b, l + 1);
    exit_section_(b, m, USE_CASE, r);
    return r;
  }

  // 'module'?
  private static boolean useCase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useCase_1")) return false;
    consumeToken(b, MODULE);
    return true;
  }

  /* ********************************************************** */
  // 'use' moduleId 'as' 'agent' useCase '.'
  public static boolean useClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useClause")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && moduleId(b, l + 1);
    r = r && consumeTokens(b, 0, AS, AGENT);
    r = r && useCase(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, USE_CLAUSE, r);
    return r;
  }

}
