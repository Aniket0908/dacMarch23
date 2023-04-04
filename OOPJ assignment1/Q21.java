class Q21{
    public static void main(String[] args){
        //long instance to byte
        long b = 50l;
        Long is = new Long(b);
        byte n = is.byteValue();
        System.out.println(n);

       //long instance to short
        short s1 = is.shortValue();
        System.out.println(s1);

        //long instance to int
        int i = is.intValue();
        System.out.println(i);

        //long instance to long
        long l = is.longValue();
        System.out.println(l);

       //long instance to float
        float f = is.floatValue();
        System.out.println(f);

        //long instance to double
         double d = is.doubleValue();
        System.out.println(d);
        

    }
}