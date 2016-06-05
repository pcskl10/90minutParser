grammar minut90;

r : liga ;

liga : 'liga' OKR_L STRING OKR_R KLA_L druzyny KLA_R ;

OKR_L : '(' ;
OKR_R : ')' ;
KLA_L : '{' ;
KLA_R : '}' ;
CU    : '"' ;

druzyny : druzyna druzyny | druzyna ;

druzyna : 'druzyna' OKR_L STRING OKR_R KLA_L mecze punkty zwyciestwa remisy porazki bramki KLA_R;

mecze      : 'mecze'      OKR_L INT OKR_R ;
punkty     : 'punkty'     OKR_L INT OKR_R ;
zwyciestwa : 'zwyciestwa' OKR_L INT OKR_R ;
remisy     : 'remisy'     OKR_L INT OKR_R ;
porazki    : 'porazki'    OKR_L INT OKR_R ;

bramki : 'bramki' OKR_L OKR_R KLA_L strzelone stracone KLA_R ;

strzelone : 'strzelone' OKR_L INT OKR_R ;
stracone  : 'stracone'  OKR_L INT OKR_R ;

fragment ESCAPED_QUOTE : '\\"'; 

STRING : '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"';

WS : [ \t\r\n]+ -> skip ;

INT   : DIGIT+ ;
DIGIT : [0-9]  ;