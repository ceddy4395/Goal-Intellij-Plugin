package nl.tudelft.core;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.psi.GOALType;
import com.intellij.psi.TokenType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.tudelft.core.language.psi.GOALType.*;

%%

%class GOALLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

EOL=\R
WHITE_SPACE=\s+


ID=[a-zA-Z_][a-zA-Z0-9_]*
USE_CASE_VAL=init|event|main
SQSTRING='([^'\\]|\\.)*?'
DQSTRING=\"([^\"\\]|\\.)*?\"
INTEGER=-?[0-9]+|0b[01]+|0o[0-7]+|0x[0-9A-Fa-f]+|[0-9]{1,2}'[0-9A-Za-z]+
REAL=-?[0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?
LINE_COMMENT=%.*

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "use"               { return USE; }
  "as"                { return AS; }
  "environment"       { return ENVIRONMENT; }
  "with"              { return WITH; }
  "define"            { return DEFINE; }
  "agent"             { return AGENT; }
  "{"                 { return OCURLY; }
  "}"                 { return CCURLY; }
  "module"            { return MODULE; }
  "launchpolicy"      { return LAUNCHPOLICY; }
  "when"              { return WHEN; }
  "launch"            { return LAUNCH; }
  "type"              { return TYPE; }
  "name"              { return NAME; }
  "number"            { return NUMBER; }
  "max"               { return MAX; }
  "="                 { return EQ; }
  "*"                 { return STAR; }
  "."                 { return DOT; }
  ","                 { return COMMA; }
  "instruction"       { return INSTRUCTION; }

  {USE_CASE_VAL}      { return USE_CASE_VAL; }
  {ID}                { return ID; }
  {SQSTRING}          { return SQSTRING; }
  {DQSTRING}          { return DQSTRING; }
  {INTEGER}           { return INTEGER; }
  {REAL}              { return REAL; }
}

{LINE_COMMENT}        { return LINE_COMMENT; }
[^] { return BAD_CHARACTER; }
