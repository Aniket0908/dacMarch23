class Q25{
    public static void main(String[] args){
        //float instance to byte
        float b = 50.76f;
        Float fs = new Float(b);
        byte n = fs.byteValue();
        System.out.println(n);

       //float instance to short
        short s1 = fs.shortValue();
        System.out.println(s1);

        //float instance to int
        int i = fs.intValue();
        System.out.println(i);

        //float instance to long
        long l = fs.longValue();
        System.out.println(l);

       //float instance to float
        float f = fs.floatValue();
        System.out.println(f);

        //float instance to double
         double d = fs.doubleValue();
        System.out.println(d);
        

    }
}