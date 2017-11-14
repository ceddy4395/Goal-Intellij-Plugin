package nl.tudelft.intelligoal.core.language.module.grammer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes.*;

%%

%{
    public ModuleLexer() {
        this((java.io.Reader)null);
    }
%}

%public
%class ModuleLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

EOL=\R
WHITE_SPACE=\s+

BASIC_USAGE_VAL=actionspec|knowledge|beliefs|goals
ORDER_VAL=linear|linearall|linearrandom|random|randomall|linearallrandom
EXIT_VAL=nogoals|never|always|noaction
FOCUS_VAL=none|new|select|filter
SELECTOR_VAL=all|allother|some|someother|self|this
INTEGER=-?[0-9]+|0b[01]+|0o[0-7]+|0x[0-9A-Fa-f]+|[0-9]{1,2}'[0-9A-Za-z]+
REAL=-?[0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?
SQSTRING='([^'\\]|\\.)*?'
DQSTRING=\"([^\"\\]|\\.)*?\"
ATOM=([a-z][A-Za-z0-9_]*)|('([^'\\]|\\.)*?')
VARIABLE=[A-Z_][A-Za-z0-9_]*
LINE_COMMENT=%.*

%%
<YYINITIAL> {
  {WHITE_SPACE}          { return WHITE_SPACE; }

  "use"                  { return USE; }
  "as"                   { return AS; }
  "module"               { return MODULE; }
  "define"               { return DEFINE; }
  "order"                { return ORDER; }
  "exit"                 { return EXIT; }
  "focus"                { return FOCUS; }
  "bel"                  { return BEL; }
  "percept"              { return PERCEPT; }
  "goal"                 { return GOAL; }
  "goal-a"               { return GOALA; }
  "a-goal"               { return AGOAL; }
  "not"                  { return NOT; }
  "\\+"                  { return UNPLUS; }
  "true"                 { return TRUE; }
  "if"                   { return IF; }
  "then"                 { return THEN; }
  "forall"               { return FORALL; }
  "do"                   { return DO; }
  "listall"              { return LISTALL; }
  "send"                 { return SEND; }
  "sent"                 { return SENT; }
  "exit-module"          { return EXIT_MODULE; }
  "log"                  { return LOG; }
  "print"                { return PRINT; }
  "insert"               { return INSERT; }
  "delete"               { return DELETE; }
  "adopt"                { return ADOPT; }
  "drop"                 { return DROP; }
  "."                    { return DOT; }
  ","                    { return COMMA; }
  "="                    { return EQ; }
  "["                    { return OBRACKET; }
  "]"                    { return CBRACKET; }
  "("                    { return OPAREN; }
  ")"                    { return CPAREN; }
  "{"                    { return OPEN_CURLY; }
  "}"                    { return CLOSE_CURLY; }
  "!"                    { return BANG; }
  "?"                    { return WHAT; }
  "<-"                   { return REVERSE_SNEK; }
  ";"                    { return SEMI; }
  "|"                    { return BAR; }
  "->"                   { return IMPLIES; }
  "*->"                  { return SOFT_IMPLIES; }
  "<"                    { return LT; }
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

  {BASIC_USAGE_VAL}      { return BASIC_USAGE_VAL; }
  {ORDER_VAL}            { return ORDER_VAL; }
  {EXIT_VAL}             { return EXIT_VAL; }
  {FOCUS_VAL}            { return FOCUS_VAL; }
  {SELECTOR_VAL}         { return SELECTOR_VAL; }
  {INTEGER}              { return INTEGER; }
  {REAL}                 { return REAL; }
  {SQSTRING}             { return SQSTRING; }
  {DQSTRING}             { return DQSTRING; }
  {ATOM}                 { return ATOM; }
  {VARIABLE}             { return VARIABLE; }
  {LINE_COMMENT}         { return LINE_COMMENT; }

}

[^] { return BAD_CHARACTER; }
