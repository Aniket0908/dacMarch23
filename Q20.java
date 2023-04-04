class Q20{
    public static void main(String[] args){
        //long value into string
        long l = 149l;
        String s1 = Long.toString(l);
        System.out.println(s1);

        //long value to long instance
        Long l1 = new Long(l);
        System.out.println(l1);

        //string instance to long instance
        String s2 = new String("78");
        Long l2 = Long.valueOf(s2);
        System.out.println(l2);

        //long value to hexadecimal
        String s3 = Long.toHexString(l);
        System.out.println(s3);

        //long value to binary
        String s4 = Long.toBinaryString(l);
        System.out.println(s4);

        //long value to octal
        String s5 = Long.toOctalString(l);
        System.out.println(s5);




    }
}