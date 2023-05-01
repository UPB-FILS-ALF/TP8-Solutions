grammar Alf;

start               : (statement SEMICOLON NEWLINE*)*               #multilineProg
                    | statement SEMICOLON                           #singlelineProg
                    ;

statement           : declaration                                   #declarationRule
                    | expression                                    #expressionRule
                    | list_declaration                              #listRule
                    | function_declaration                          #functionRule
                    | attribution                                   #attributionRule
                    | function_call                                 #functionCallRule
                    ;

declaration         : type VARIABLE EQ expression                   #variableDeclaration
                    | type VARIABLE EQ function_call                #variableFunctionCall
                    ;

type                : INT                                           #typeInt
                    | FLOAT                                         #typeFloat
                    | STRING                                        #typeString
                    ;

value               : INT_NUMBER                                    #valueInt
                    | FLOAT_NUMBER                                  #valueFloat
                    | STRING_TEXT                                   #valueString
                    | VARIABLE                                      #valueVariable
                    ;

expression          : left=expression op=MUL right=expression       #expressionMultiply
                    | left=expression op=DIV right=expression       #expressionDivision
                    | left=expression op=REM right=expression       #expressionRem
                    | left=expression op=ADD right=expression       #expressionAddition
                    | left=expression op=SUB right=expression       #expressionSubtraction
                    | LP expression RP                              #expressionParanthesis
                    | value                                         #expressionValue
                    ;

attribution         : VARIABLE EQ expression                        #variableAttribution
                    ;

list_declaration    : LIST VARIABLE EQ LSP values RSP               #listDeclaration
                    ;

values              : (value COMMA)*                                #listValues
                    ;

function_declaration: FUNCTION VARIABLE LP (parameter COMMA*)* RP LB (statement SEMICOLON)* return_function RB    #functionContent
                    ;

parameter           : declaration                                   #functionParameter
                    ;

return_function     : RETURN statement SEMICOLON                    #returnStatement
                    | RETURN SEMICOLON                              #emptyReturn
                    ;

function_call       : VARIABLE LP (value COMMA*)* RP                #functionCall
                    ;


WS                  :   (' ')       -> skip;
NEWLINE             :   ([\r\n]+)   -> skip;
FUNCTION            :   'function';
VARIABLE            :   ('_'[a-zA-Z0-9]+);
ADD                 :   '+';
SUB                 :   '-';
MUL                 :   '*';
DIV                 :   '/';
REM                 :   '%';
INT                 :   'int';
FLOAT               :   'float';
STRING              :   'String';
LIST                :   'list';
LP                  :   '(';
RP                  :   ')';
EQ                  :   '=';
SEMICOLON           :   ';';
LSP                 :   '[';
RSP                 :   ']';
COMMA               :   ',';
LB                  :   '{';
RB                  :   '}';
RETURN              :   'return';
INT_NUMBER          :   ([0-9]+);
FLOAT_NUMBER        :   ([0-9]+'.'[0-9]+);
STRING_TEXT         :   ('"'~["]+'"'|'\''~[']+'\'');