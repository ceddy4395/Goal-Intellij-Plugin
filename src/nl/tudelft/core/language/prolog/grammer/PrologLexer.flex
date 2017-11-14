package nl.tudelft.core.language.prolog.grammer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.tudelft.core.language.prolog.grammer.PrologTypes.*;

%%

%{
  public PrologLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class PrologLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\r?\n
WHITE_SPACE=\s+

DIRECTIVE=dynamic|discontiguous|initialization|meta_predicate|module_transparent|multifile|public|thread_local|thread_initialization|volatile
INTEGER=-?[0-9]+|0b[01]+|0o[0-7]+|0x[0-9A-Fa-f]+|[0-9]{1,2}'[0-9A-Za-z]+
REAL=-?[0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?
SQSTRING='([^'\\]|\\.)*?'
DQSTRING=\"([^\"\\]|\\.)*?\"
ATOM=([a-z][A-Za-z0-9_]*)|('([^'\\]|\\.)*?')
VARIABLE=[A-Z_][A-Za-z0-9_]*
DOC_COMMENT=%[ \t\n\x0B\f\r]*\[[^\r\n]*
LINE_COMMENT=%[ \t\n\x0B\f\r]*[^\[][^\r\n]*

%state directive
%state clause

%%

{EOL}                 { return WHITE_SPACE; }
{WHITE_SPACE}         { return WHITE_SPACE; }

<directive> {
  ","                 { return COMMA; }
  "/"                 { return SLASH; }
  "."                 { yybegin(YYINITIAL); return DOT; }

  {DIRECTIVE}         { return DIRECTIVE; }
  {INTEGER}           { return INTEGER; }
  {ATOM}              { return ATOM; }
}

<clause> {
  "."                 { yybegin(YYINITIAL); return DOT; }

  "-->"               { return DCG; }
  ":-"                { return NECK; }
  "/"                 { return SLASH; }
  ","                 { return COMMA; }
  "["                 { return OBRACKET; }
  "]"                 { return CBRACKET; }
  "("                 { return OPAREN; }
  ")"                 { return CPAREN; }
  ";"                 { return SEMI; }
  "|"                 { return BAR; }
  "->"                { return IMPLIES; }
  "*->"               { return SOFT_IMPLIES; }
  "\\+"               { return NOT; }
  "<"                 { return LT; }
  "="                 { return UNIFY; }
  "=.."               { return UNIV; }
  "=@="               { return VARIANT; }
  "\\=@="             { return NOT_VARIANT; }
  "=:="               { return EVALUATES; }
  "=<"                { return LEQ; }
  "=="                { return IDENTICAL; }
  "\\=="              { return NOT_IDENTICAL; }
  ">"                 { return GT; }
  ">="                { return GE; }
  "@<"                { return GENERAL_LT; }
  "@=<"               { return GENERAL_LE; }
  "@>"                { return GENERAL_GT; }
  "@>="               { return GENERAL_GE; }
  "\\="               { return NOT_UNIFY; }
  ">:<"               { return PARTIAL_UNIFICATION; }
  ":"                 { return COLON; }
  "+"                 { return PLUS; }
  "-"                 { return MINUS; }
  "/\\"               { return BITWISE_AND; }
  "\\/"               { return BITWISE_OR; }
  "*"                 { return MULT; }
  "//"                { return INT_DIV; }
  "<<"                { return BITSHIFT_LEFT; }
  ">>"                { return BITSHIFT_RIGHT; }
  "**"                { return POW; }
  "^"                 { return POW2; }
  "\\"                { return INV; }
  "!"                 { return CUT; }
  "as"                { return AS; }
  "is"                { return IS; }

  {INTEGER}           { return INTEGER; }
  {REAL}              { return REAL; }
  {SQSTRING}          { return SQSTRING; }
  {DQSTRING}          { return DQSTRING; }
  {VARIABLE}          { return VARIABLE; }
  {ATOM}              { return ATOM; }
}

<YYINITIAL> {
  {ATOM}              { yybegin(clause); return ATOM; }
  ":-"                { yybegin(directive); return NECK; }
}

{DOC_COMMENT}       { return DOC_COMMENT; }
{LINE_COMMENT}      { return LINE_COMMENT; }

[^] { return BAD_CHARACTER; }
