class Q9{
    public static void main(String[] args){
        
        byte b = 50;
        Byte bs = new Byte(b);
        byte n = bs.byteValue();
        System.out.println(n);

        short s1 = bs.shortValue();
        System.out.println(s1);

        int i = bs.intValue();
        System.out.println(i);

        float f = bs.floatValue();
        System.out.println(f);

         double d = bs.doubleValue();
        System.out.println(d);
        

    }
}