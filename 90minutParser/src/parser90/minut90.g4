grammar minut90;

r : liga ;

liga : 'liga' OKR_L STRING OKR_R KLA_L druzyny KLA_R ;

OKR_L : '(' ;
OKR_R : ')' ;
KLA_L : '{' ;
KLA_R : '}' ;
CU    : '"' ;

druzyny : druzyna druzyny | druzyna ;

druzyna : 'druzyna' OKR_L STRING OKR_R KLA_L MECZE PUNKTY ZWYCIESTWA REMISY PORAZKI bramki KLA_R;

MECZE      : 'mecze'      OKR_L INT OKR_R ;
PUNKTY     : 'punkty'     OKR_L INT OKR_R ;
ZWYCIESTWA : 'zwyciestwa' OKR_L INT OKR_R ;
REMISY     : 'remisy'     OKR_L INT OKR_R ;
PORAZKI    : 'porazki'    OKR_L INT OKR_R ;

bramki : 'bramki' OKR_L OKR_R KLA_L STRZELONE STRACONE KLA_R ;

STRZELONE : 'strzelone' OKR_L INT OKR_R ;
STRACONE  : 'stracone'  OKR_L INT OKR_R ;

fragment ESCAPED_QUOTE : '\\"'; 

STRING : '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"';

WS : [ \t\r\n]+ -> skip ;

INT   : DIGIT+ ;
DIGIT : [0-9]  ;