package nl.tudelft.intelligoal.core.language.actionspec.grammer;

import java.util.Stack;
import java.util.Collections;
import java.util.Arrays;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.tudelft.intelligoal.core.language.actionspec.grammer.ActionSpecTypes.*;

%%

%{
  public ActionSpecLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%final
%class ActionSpecLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

WHITE_SPACE=\s+

ACTION_USE_CASE_VAL=internal|external
INTEGER=-?[0-9]+|0b[01]+|0o[0-7]+|0x[0-9A-Fa-f]+|[0-9]{1,2}'[0-9A-Za-z]+
REAL=-?[0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?
SQSTRING='([^'\\]|\\.)*?'
DQSTRING=\"([^\"\\]|\\.)*?\"
ATOM=([a-z][A-Za-z0-9_]*)|('([^'\\]|\\.)*?')
VARIABLE=[A-Z_][A-Za-z0-9_]*
LINE_COMMENT=%.*

%%

{WHITE_SPACE}            { return WHITE_SPACE; }

<YYINITIAL> {
  "use"                  { return USE; }
  "as"                   { return AS; }
  "knowledge"            { return KNOWLEDGE; }

  "define"               { return DEFINE; }
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
  "{"                    { return OPEN_CURLY; }
  "}"                    { return CLOSE_CURLY; }
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
  "*"                    { return MULT; }
  "//"                   { return INT_DIV; }
  "<<"                   { return BITSHIFT_LEFT; }
  ">>"                   { return BITSHIFT_RIGHT; }
  "**"                   { return POW; }
  "^"                    { return POW2; }
  "\\"                   { return INV; }
  "/"                    { return SLASH; }

  "."                    { return DOT; }
  ","                    { return COMMA; }

  {ACTION_USE_CASE_VAL}  { return ACTION_USE_CASE_VAL; }
  {INTEGER}              { return INTEGER; }
  {REAL}                 { return REAL; }
  {SQSTRING}             { return SQSTRING; }
  {DQSTRING}             { return DQSTRING; }
  {ATOM}                 { return ATOM; }
  {VARIABLE}             { return VARIABLE; }
}

{LINE_COMMENT}           { return LINE_COMMENT; }
.                        { return BAD_CHARACTER; }
