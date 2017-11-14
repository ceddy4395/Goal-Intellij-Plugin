package nl.tudelft.core.language.test.grammer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.tudelft.core.language.test.grammer.TestTypes.*;

%%

%{
    public TestLexer() {
        this((java.io.Reader)null);
    }
%}

%public
%class TestLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType


EOL=\R
WHITE_SPACE=\s+


SQSTRING='([^'\\]|\\.)*?'
DQSTRING=\"([^\"\\]|\\.)*?\"
INTEGER=-?[0-9]+|0b[01]+|0o[0-7]+|0x[0-9A-Fa-f]+|[0-9]{1,2}'[0-9A-Za-z]+
REAL=-?[0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?
LINE_COMMENT=%.*
ATOM=([a-z][A-Za-z0-9_]*)|('([^'\\]|\\.)*?')
VARIABLE=[A-Z_][A-Za-z0-9_]*

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }
  "use"               { return USE; }
  "as"                { return AS; }
  "with"              { return WITH; }
  "{"                 { return OPEN_CURLY; }
  "}"                 { return CLOSE_CURLY; }
  "module"            { return MODULE; }
  "number"            { return NUMBER; }
  "="                 { return EQ; }
  "*"                 { return STAR; }
  "."                 { return DOT; }
  ","                 { return COMMA; }

    "with"                 { return WITH; }
    "pre"                  { return PRE; }
    "post"                 { return POST; }

    "not"                  { return NOT; }
    "true"                 { return TRUE; }

    "is"                   { return IS; }

    "["                    { return OBRACKET; }
    "]"                    { return CBRACKET; }
    "("                    { return OPAREN; }
    ")"                    { return CPAREN; }
    ";"                    { return SEMI; }
    "|"                    { return BAR; }
    "->"                   { return IMPLIES; }
    "*->"                  { return SOFT_IMPLIES; }
    "\\+"                  { return NOT; }
    "<"                    { return LT; }
    "="                    { return EQ; }
    "=.."                  { return UNIV; }
    "=@="                  { return VARIANT; }
    "\\=@="                { return NOT_VARIANT; }
    "=:="                  { return EVALUATES; }
    "=<"                   { return LEQ; }
    "=="                   { return IDENTICAL; }
    "\\=="                 { return NOT_IDENTICAL; }
    ">"                    { return GT; }
    ">="                   { return GE; }
    "@<"                   { return GENERAL_LT; }
    "@=<"                  { return GENERAL_LE; }
    "@>"                   { return GENERAL_GT; }
    "@>="                  { return GENERAL_GE; }
    "\\="                  { return NOT_UNIFY; }
    ">:<"                  { return PARTIAL_UNIFICATION; }
    ":"                    { return COLON; }
    "+"                    { return PLUS; }
    "-"                    { return MINUS; }
    "/\\"                  { return BITWISE_AND; }
    "\\/"                  { return BITWISE_OR; }
    "//"                   { return INT_DIV; }
    "<<"                   { return BITSHIFT_LEFT; }
    ">>"                   { return BITSHIFT_RIGHT; }
    "**"                   { return POW; }
    "^"                    { return POW2; }
    "\\"                   { return INV; }
    "/"                    { return SLASH; }

  {SQSTRING}          { return SQSTRING; }
  {DQSTRING}          { return DQSTRING; }
  {INTEGER}           { return INTEGER; }
  {REAL}              { return REAL; }
  {ATOM}                 { return ATOM; }
  {VARIABLE}             { return VARIABLE; }
}

{LINE_COMMENT}        { return LINE_COMMENT; }
[^] { return BAD_CHARACTER; }
