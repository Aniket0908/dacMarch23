class Q29{
    public static void main(String[] args){
        //double instance to byte
        double b = 50.54;
        Double is = new Double(b);
        byte n = is.byteValue();
        System.out.println(n);

       //double instance to short
        short s1 = is.shortValue();
        System.out.println(s1);

        //double instance to int
        int i = is.intValue();
        System.out.println(i);

        //double instance to long
        long l = is.longValue();
        System.out.println(l);

       //double instance to float
        float f = is.floatValue();
        System.out.println(f);

        //double instance to double
         double d = is.doubleValue();
        System.out.println(d);
        

    }
}