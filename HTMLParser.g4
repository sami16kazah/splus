
parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

splus:  START    (phpPlus)*   END ;

phpPlus :  (SPLUS_COMMENT|phpElement)+;
phpElement:name|logo|nav|footer|login|signUp|auth|inject|contollers|style|page|SEA_WS2;
//basic
string : SINGLE_QOUTE var SINGLE_QOUTE;
var : VAR;
//basic declerations
name: NAME string CLOSE_ATTRIBUTE;
logo: LOGO string CLOSE_ATTRIBUTE;
nav:  NAV CLOSE_ATTRIBUTE;
footer: FOOTER string CLOSE_ATTRIBUTE;
page : PAGE pageAttributes CLOSE_ATTRIBUTE;
//authetication
login: LOGIN CLOSE_ATTRIBUTE;
signUp:SIGNUP CLOSE_ATTRIBUTE;
auth: AUTH CLOSE_ATTRIBUTE;
// inject users to db
inject : INJECTUSER role COMMA email COMMA password CLOSE_ATTRIBUTE;
role : (USER_ROLE|ADMIN_ROLE);
email:var;
password:var;
//pages
name_page: var;
tableName: var;
columnName: var;
pageAttributes: name_page COMMA? (pageForm|pageTable)? COMMA? authiticated?;
authiticated : ONLY ASSIGN (USER|ADMIN);
pageForm : FORM ASSIGN tableName;
pageTable: TABLE ASSIGN tableName ASSIGN viewAs;
viewAs : (LIST|BLOCK|METRO) ASSIGN columnName ;

//controllers
contollers :CONTROLLER (loginController | singUpController | navController | footerController | pageController|formController) CLOSE_ATTRIBUTE;
loginController: LOGIN ASSIGN destenation;
singUpController:SIGNUP ASSIGN destenation;
navController:NAV ASSIGN array;
footerController: FOOTER ASSIGN array;
formController : FORMS tableName ASSIGN formAttributes ;
pageController: pageName ASSIGN destenation;
pageName : PNAME;
destenation: var;
array: BRACKET_OPEN2 elements+ BRACKET_CLOSE2;
elements : COMMA* var COMMA*;
formAttributes : BRACKET_OPEN2 attributes+ BRACKET_CLOSE2;
attributes: COMMA* attName ASSIGN attType COMMA*;
attName:var;
attType:var;
//styling
style: (loginStyle|signUpStyle|navStyle|footerStyle|pageStyle) CLOSE_ATTRIBUTE ;
loginStyle: LOGIN ASSIGN CHECK_OPEN styleAttributes+  ;
signUpStyle :SIGNUP ASSIGN CHECK_OPEN styleAttributes+  ;
navStyle: NAV ASSIGN CHECK_OPEN styleAttributes+  ;
footerStyle: FOOTER ASSIGN CHECK_OPEN styleAttributes+  ;
pageStyle: PAGE var ASSIGN CHECK_OPEN styleAttributes+  ;
styleAttributes:COMMA* (textColor|color|align|inputColor) COMMA*;
textColor:TEXT_COLOR ASSIGN var;
color:COLOR ASSIGN var;
inputColor:INPUT_COLOR ASSIGN var;
align : (ALIGN_UP|ALIGN_RIGHT|ALIGN_LEFT);
