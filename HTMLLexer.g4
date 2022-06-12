
lexer grammar  HTMLLexer;




XML
    : '<?xml' .*? '>'
    ;


SEA_WS
    :  (' '|'\t'|'\r'? '\n')+

    ;

START : SEA_WS* 'app' SEA_WS* '{' SEA_WS* ->pushMode(SPLUS);

mode SPLUS;
SEA_WS2:  (' '|'\t'|'\r'? '\n')+

    ;
AUTH: SEA_WS2* 'auth' SEA_WS2* '(' SEA_WS2*->pushMode(ATTRIBUTE);
NAME : SEA_WS2* 'name' SEA_WS2* '(' SEA_WS2*->pushMode(ATTRIBUTE);
LOGO : SEA_WS2* 'logo' SEA_WS2* '(' SEA_WS2*->pushMode(ATTRIBUTE);
LOGIN : SEA_WS2* 'login' SEA_WS2* '('* SEA_WS2*->pushMode(ATTRIBUTE);
SIGNUP : SEA_WS2* 'signUp' SEA_WS2* '('* SEA_WS2*->pushMode(ATTRIBUTE);
INJECTUSER : SEA_WS2* 'injectUser' ' '* '(' SEA_WS2*->pushMode(ATTRIBUTE);
NAV : SEA_WS2* 'nav' SEA_WS2* '('* SEA_WS2*->pushMode(ATTRIBUTE);
FOOTER : SEA_WS2* 'footer' SEA_WS2* '('* SEA_WS2*->pushMode(ATTRIBUTE);
PAGE : SEA_WS2* 'page' SEA_WS2* '('* SEA_WS2*->pushMode(ATTRIBUTE);
CONTROLLER: SEA_WS2* 'controller' SEA_WS2*;
FORMS:SEA_WS2* 'form' ' '*->pushMode(ATTRIBUTE);
PNAME:SEA_WS2* ('a'..'z'|'A'..'Z')+ ' '* ->pushMode(ATTRIBUTE);


SPLUS_COMMENT
    : '<!--' .*? '-->'
    ;

END:' '* '}' ' '*-> popMode;


mode ATTRIBUTE;
CLOSE_ATTRIBUTE: ' '* ')'* ' '* ';' ' '*-> popMode;
BRACKET_OPEN:' '* '{'  ' '*;
BRACKET_CLOSE:' '* '}' ' '*  ' '*;
BRACKET_OPEN2:' '* '['  ' '*;
BRACKET_CLOSE2:' '* ']' ' '*  ' '*;

CHECK_OPEN:' '* '('  ' '*;
CHECK_CLOSE:' '* ')'  ' '*;
SINGLE_QOUTE:' '* '\'' ' '*;
DOUBLE_QOUTE:' '* '"'  ' '*;

TEXT_COLOR:' '* 'textColor' ' '*;
COLOR:' '* 'color' ' '*;
INPUT_COLOR:' '* 'inputColor' ' '*;
ALIGN_LEFT:' '* 'align:'' '* '\'' ' '* 'left' ' '* '\'' ' '*;
ALIGN_RIGHT:' '* 'align:'' '* '\'' ' '* 'right' ' '* '\'' ' '*;
ALIGN_UP:' '* 'align:'' '* '\'' ' '* 'up' ' '* '\'' ' '*;
USER_ROLE :' '* 'role:'' '* '\'' ' '* 'user' ' '* '\'' ' '*;
ADMIN_ROLE:' '* 'role:'' '* '\'' ' '* 'admin' ' '* '\'' ' '*;


USER:' '* 'user' ' '*;
ADMIN:' '* 'admin' ' '*;

//HOME:' '* 'home' ' '*;
FORM:' '* 'form' ' '*;
TABLE:' '* 'table' ' '*;
EDIT:' '* 'edit' ' '*;
DELETE:' '* 'delete' ' '*;
VIEW:' '* 'view' ' '*;
SUBMIT:' '* 'submit' ' '*;
ATT:' '* 'att' ' '*;
ATTEND:' '* 'attend' ' '*;
CHECK:' '* 'check' ' '*;
CHECK_ONE:' '* 'checkOne' ' '*;
ONLY : ' '* 'only' ' '*;

LIST:' '* 'list' ' '*;
BLOCK:' '* 'block' ' '*;
METRO:' '* 'metro' ' '*;

ASSIGN:' '* ':' ' '*;
COMMA:' '* ',' ' '*;
DOT:' '* '.' ' '*;

VAR:' '* ('a'..'z'|'A'..'Z'|' '|NUMBER|MAIL_ATT|DOT)+ ' '*;

MAIL_ATT : ' '* '@' ' '* ;

NUMBER :' '* '#'*('0'..'9')+' '*;
