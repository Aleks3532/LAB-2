���������  �����  Main {
    public  static  void  main ( String [] args ) {
        if (args . length ! =  2 ) {
            ������� . �� . println ( � ������ � ���������� � );
            ������� ;
        }
    int passLength = 0 ;
    int passCount = 0 ;
    ��� ( INT I = 0 ; � < ��� . �����; ++ �) {
        String arg = args [i];
        String [] tokens = arg . ����� ( " = " );
    if (tokens [ 0 ] . equals ( " --passLength " )) {
        passLength =  Integer . parseInt (������ [ 1 ]);
    } else  if (tokens [ 0 ] . equals ( " --passCount " )) {
        passCount =  Integer . parseInt (������ [ 1 ]);
    } ��� {
        ������� . �� . println ( � ������ � ���������� � );
        ������� ;
    }
    }
    ������� . �� . ������ ( " passLength =% d, passCount =% d \ n " , passLength, passCount);
    PassGen passgen =  �����  PassGen ();
    for ( int i = 0 ; i < passCount; ++ i) {
        ������ pass = passgen . GetPass (passLength);
        ������� . �� . Println (������);
    }
    }
    }