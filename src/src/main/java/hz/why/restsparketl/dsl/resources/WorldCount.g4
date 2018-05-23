grammar WorldCount;

prog: stat
;

stat: expr
;

expr: 'create' FILETYPE'.'path 'as' TABLENAME       #create
| 'show' NUM TABLENAME                              #show
| 'count' TABLENAME                                 #count
;


path: BACKQUOTED_IDENTIFIER
;

FILETYPE: 'csv'|'text'
;

TABLENAME: ('a'..'z'|'A'..'Z')+
;

NUM: '0'..'9'+
;

BACKQUOTED_IDENTIFIER
    : '`' ( ~'`' | '``' )* '`'
    ;

WS:(' '|'\t'|'\n'|'\r')+{skip();};


