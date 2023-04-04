class Q17{
    public static void main(String[] args){
        //integer instance to byte
        int b = 50;
        Integer is = new Integer(b);
        byte n = is.byteValue();
        System.out.println(n);

        //integer instance to short
        short s1 = is.shortValue();
        System.out.println(s1);

        //integer instance to int
        int i = is.intValue();
        System.out.println(i);

        //integer instance to float
        float f = is.floatValue();
        System.out.println(f);

        //integer instance to double
         double d = is.doubleValue();
        System.out.println(d);
        

    }
}