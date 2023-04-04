class Q14{
    public static void main(String[] args){
        //short instance to byte
        short b = 50;
        Short bs = new Short(b);
        byte n = bs.byteValue();
        System.out.println(n);

        //short instance to short
        short s1 = bs.shortValue();
        System.out.println(s1);

        //short instance to int
        int i = bs.intValue();
        System.out.println(i);

        //short instance to float
        float f = bs.floatValue();
        System.out.println(f);

        //short instance to double
         double d = bs.doubleValue();
        System.out.println(d);
        

    }
}