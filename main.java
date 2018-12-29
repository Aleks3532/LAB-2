публичный  класс  Main {
    public  static  void  main ( String [] args ) {
        if (args . length ! =  2 ) {
            Система . из . println ( « ошибка в аргументах » );
            возврат ;
        }
    int passLength = 0 ;
    int passCount = 0 ;
    для ( INT I = 0 ; я < арг . длины; ++ я) {
        String arg = args [i];
        String [] tokens = arg . сплит ( " = " );
    if (tokens [ 0 ] . equals ( " --passLength " )) {
        passLength =  Integer . parseInt (токены [ 1 ]);
    } else  if (tokens [ 0 ] . equals ( " --passCount " )) {
        passCount =  Integer . parseInt (токены [ 1 ]);
    } еще {
        Система . из . println ( « ошибка в аргументах » );
        возврат ;
    }
    }
    Система . из . формат ( " passLength =% d, passCount =% d \ n " , passLength, passCount);
    PassGen passgen =  новый  PassGen ();
    for ( int i = 0 ; i < passCount; ++ i) {
        Строка pass = passgen . GetPass (passLength);
        Система . из . Println (проход);
    }
    }
    }