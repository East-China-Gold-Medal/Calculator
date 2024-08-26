grammar Calculator;

@header {
package com.steiner.calculator.codegen;
}

expr: plusOrMinus;

plusOrMinus: atom (PLUS atom | MINUS atom) # PMWithAtom
           | atom (PLUS plusOrMinus | MINUS plusOrMinus) # PMWithSelf
           | atom (PLUS multiOrDiv | MINUS multiOrDiv) # PMWithMD
           | multiOrDiv # MD
           ;

multiOrDiv: atom (MULTI atom | DIV atom) # MDWithAtom
          | atom (MULTI plusOrMinus | DIV plusOrMinus) # MDWithSelf
          ;

atom: MINUS? INT # AtomInt
    | MINUS? DOUBLE # AtomDouble
    | LPAREN plusOrMinus RPAREN # Parens
    ;


LPAREN: '(';
RPAREN: ')';
PLUS: '+';
MINUS: '-';
MULTI: '*';
DIV: '/';
DOT: '.';
INT: [0-9]+;
DOUBLE: [0-9]+ DOT [0-9]+;
WS: [ \t\r\n]+ -> skip;