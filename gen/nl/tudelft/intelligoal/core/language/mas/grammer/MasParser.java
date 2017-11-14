// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;

import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MasParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == MasTypes.AGENT_BLOCK) {
      r = agentBlock(b, 0);
    }
    else if (t == MasTypes.CONSTRAINT) {
      r = constraint(b, 0);
    }
    else if (t == MasTypes.CONSTRAINT_LIST) {
      r = constraintList(b, 0);
    }
    else if (t == MasTypes.ENTITY) {
      r = entity(b, 0);
    }
    else if (t == MasTypes.ENVIRONMENT_PROPERTY) {
      r = environmentProperty(b, 0);
    }
    else if (t == MasTypes.ENVIRONMENT_PROPERTY_LIST) {
      r = environmentPropertyList(b, 0);
    }
    else if (t == MasTypes.ENVIRONMENT_SPEC) {
      r = environmentSpec(b, 0);
    }
    else if (t == MasTypes.IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == MasTypes.INSTRUCTION) {
      r = instruction(b, 0);
    }
    else if (t == MasTypes.INSTRUCTION_LIST) {
      r = instructionList(b, 0);
    }
    else if (t == MasTypes.LAUNCH_POLICY) {
      r = launchPolicy(b, 0);
    }
    else if (t == MasTypes.LAUNCH_RULE) {
      r = launchRule(b, 0);
    }
    else if (t == MasTypes.MAS_FILE) {
      r = masFile(b, 0);
    }
    else if (t == MasTypes.MODULE_ID) {
      r = moduleId(b, 0);
    }
    else if (t == MasTypes.MODULE_STRING) {
      r = moduleString(b, 0);
    }
    else if (t == MasTypes.NUMBER_LITERAL) {
      r = numberLiteral(b, 0);
    }
    else if (t == MasTypes.SIMPLE_IDENTIFIER) {
      r = simpleIdentifier(b, 0);
    }
    else if (t == MasTypes.STRING) {
      r = string(b, 0);
    }
    else if (t == MasTypes.USE_CASE) {
      r = useCase(b, 0);
    }
    else if (t == MasTypes.USE_CLAUSE) {
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
  // 'define' identifier 'as' 'agent {' useClause+ '}'
  public static boolean agentBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agentBlock")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, MasTypes.DEFINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.DEFINE);
    r = r && identifier(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.AS);
    r = r && consumeToken(b, "agent {");
    r = r && agentBlock_4(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.CCURLY);
    exit_section_(b, m, MasTypes.AGENT_BLOCK, r);
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
    Marker m = enter_section_(b, l, _NONE_, MasTypes.CONSTRAINT, "<constraint>");
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
    r = consumeTokens(b, 0, MasTypes.NAME, MasTypes.EQ);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'number' '=' numberLiteral
  private static boolean constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MasTypes.NUMBER, MasTypes.EQ);
    r = r && numberLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'max' '=' numberLiteral
  private static boolean constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MasTypes.MAX, MasTypes.EQ);
    r = r && numberLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constraint (',' constraint)*
  public static boolean constraintList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraintList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.CONSTRAINT_LIST, "<constraint list>");
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
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.COMMA);
    r = r && constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '*' | ('type' '=' simpleIdentifier) | ('name' '=' simpleIdentifier)
  public static boolean entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.ENTITY, "<entity>");
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.STAR);
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
    r = consumeTokens(b, 0, MasTypes.TYPE, MasTypes.EQ);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'name' '=' simpleIdentifier
  private static boolean entity_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MasTypes.NAME, MasTypes.EQ);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier '=' (identifier | numberLiteral)
  public static boolean environmentProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.ENVIRONMENT_PROPERTY, "<environment property>");
    r = identifier(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.EQ);
    r = r && environmentProperty_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier | numberLiteral
  private static boolean environmentProperty_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentProperty_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    if (!r) r = numberLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // environmentProperty (',' environmentProperty)*
  public static boolean environmentPropertyList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentPropertyList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.ENVIRONMENT_PROPERTY_LIST, "<environment property list>");
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
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.COMMA);
    r = r && environmentProperty(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'use' string 'as' 'environment' ('with' environmentPropertyList)? '.'
  public static boolean environmentSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environmentSpec")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, MasTypes.USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.USE);
    r = r && string(b, l + 1);
    r = r && consumeTokens(b, 0, MasTypes.AS, MasTypes.ENVIRONMENT);
    r = r && environmentSpec_4(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.DOT);
    exit_section_(b, m, MasTypes.ENVIRONMENT_SPEC, r);
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
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.WITH);
    r = r && environmentPropertyList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID | string | atom
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.IDENTIFIER, "<identifier>");
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.ID);
    if (!r) r = string(b, l + 1);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, MasTypes.ATOM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ('with' constraintList)?
  public static boolean instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.INSTRUCTION, "<instruction>");
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
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.WITH);
    r = r && constraintList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // instruction (',' instruction)*
  public static boolean instructionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instructionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.INSTRUCTION_LIST, "<instruction list>");
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
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.COMMA);
    r = r && instruction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'launchpolicy' '{' launchRule+ '}'
  public static boolean launchPolicy(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "launchPolicy")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, MasTypes.LAUNCHPOLICY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MasTypes.LAUNCHPOLICY, MasTypes.OCURLY);
    r = r && launchPolicy_2(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.CCURLY);
    exit_section_(b, m, MasTypes.LAUNCH_POLICY, r);
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
    if (!nextTokenIs(b, "<launch rule>", MasTypes.LAUNCH, MasTypes.WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.LAUNCH_RULE, "<launch rule>");
    r = launchRule_0(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.LAUNCH);
    r = r && instructionList(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.DOT);
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
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.WHEN);
    r = r && entity(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // environmentSpec? agentBlock+ launchPolicy
  public static boolean masFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "masFile")) return false;
    if (!nextTokenIs(b, "<mas file>", MasTypes.DEFINE, MasTypes.USE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.MAS_FILE, "<mas file>");
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
  // moduleString
  public static boolean moduleId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleId")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, MasTypes.ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = moduleString(b, l + 1);
    exit_section_(b, m, MasTypes.MODULE_ID, r);
    return r;
  }

  /* ********************************************************** */
  // simpleIdentifier ('.' simpleIdentifier)*
  public static boolean moduleString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleString")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, MasTypes.ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleIdentifier(b, l + 1);
    r = r && moduleString_1(b, l + 1);
    exit_section_(b, m, MasTypes.MODULE_STRING, r);
    return r;
  }

  // ('.' simpleIdentifier)*
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

  // '.' simpleIdentifier
  private static boolean moduleString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleString_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.DOT);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER | REAL
  public static boolean numberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numberLiteral")) return false;
    if (!nextTokenIs(b, "<number literal>", MasTypes.INTEGER, MasTypes.REAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.NUMBER_LITERAL, "<number literal>");
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.INTEGER);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, MasTypes.REAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LINE_COMMENT |  masFile
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.LINE_COMMENT);
    if (!r) r = masFile(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean simpleIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleIdentifier")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, MasTypes.ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.ID);
    exit_section_(b, m, MasTypes.SIMPLE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // SQSTRING | DQSTRING
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "<string>", MasTypes.DQSTRING, MasTypes.SQSTRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MasTypes.STRING, "<string>");
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.SQSTRING);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, MasTypes.DQSTRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // USE_CASE_VAL 'module'?
  public static boolean useCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useCase")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, MasTypes.USE_CASE_VAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.USE_CASE_VAL);
    r = r && useCase_1(b, l + 1);
    exit_section_(b, m, MasTypes.USE_CASE, r);
    return r;
  }

  // 'module'?
  private static boolean useCase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useCase_1")) return false;
    GeneratedParserUtilBase.consumeToken(b, MasTypes.MODULE);
    return true;
  }

  /* ********************************************************** */
  // 'use' moduleId 'as' useCase '.'
  public static boolean useClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useClause")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, MasTypes.USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, MasTypes.USE);
    r = r && moduleId(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.AS);
    r = r && useCase(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, MasTypes.DOT);
    exit_section_(b, m, MasTypes.USE_CLAUSE, r);
    return r;
  }

}
