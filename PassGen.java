������  java.util.Random ;
��������  �����  PassGen {
    public  String  getPass ( int  passLength ) {
        String password =  "  " ;
        for ( int i = 0 ; i < passLength; ++ i) {
            ������ + = ( ������ ) randRange ( ' A ' , ' Z ' );
        }
        ������� ������;
    }
    public  int  randRange ( int  min , int  max ) {
        int value = 0 ;
        ��������� ��������� = �����  ��������� ();
        ������� ��� + ��������� . nextInt (max - min + 1 );
    }
}