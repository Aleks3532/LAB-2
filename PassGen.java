импорт  java.util.Random ;
открытый  класс  PassGen {
    public  String  getPass ( int  passLength ) {
        String password =  "  " ;
        for ( int i = 0 ; i < passLength; ++ i) {
            пароль + = ( символ ) randRange ( ' A ' , ' Z ' );
        }
        вернуть пароль;
    }
    public  int  randRange ( int  min , int  max ) {
        int value = 0 ;
        Случайный случайный = новый  Случайный ();
        возврат мин + случайный . nextInt (max - min + 1 );
    }
}