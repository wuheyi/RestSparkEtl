grammar WorldCount;

prog: stat
;

stat: expr
;

expr: 'create' FILETYPE'.'filedir 'as' TABLENAME
| 'show' NUM TABLENAME
| 'count' TABLENAME
;


FILETYPE: 'csv'|'text'
;

filedir: FILENAME'.'FILETYPE
;

TABLENAME: ('a'..'z'|'A'..'Z')+
;

FILENAME: ('a'..'z'|'A'..'Z')+
;

NUM: '0'..'9'+
;

WS:(' '|'\t'|'\n'|'\r')+{skip();};


