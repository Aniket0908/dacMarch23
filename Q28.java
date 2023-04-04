class Q28{
    public static void main(String[] args){
        //double value to string
        double d = 12.56;
        String s1 = Double.toString(d);
        System.out.println(s1);

        //double value to double instance
        double d1 = 12.35;
        Double d2 = Double.valueOf(d1);
        System.out.println(d2);

        //string instance to double instance
        String s2 = new String("26");
        Double d3 = Double.valueOf(s2);
        System.out.println(d3);

        //Double value to Hexadecimal
        double d4 = 20;
        String s3 = Double.toHexString(d4);
        System.out.println(s3);

        //Double value to Binary
        long l1 = Double.doubleToLongBits(d4);
        String s4 = Long.toBinaryString(l1);
        System.out.println(s4);

        //Double value to Octal
        String s5 = Long.toOctalString(l1);
        System.out.println(s5);


    }
}