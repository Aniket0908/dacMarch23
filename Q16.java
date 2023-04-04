class Q16{
    public static void main(String[] args){
        //integer value into string
        int i = 187;
        String s1 = Integer.toString(i);
        System.out.println(s1);

        //int value to int instance
        Integer i1 = new Integer(i);
        System.out.println(i1);

        //string instance to int instance
        String s2 = new String("78");
        Integer i2 = Integer.valueOf(s2);
        System.out.println(i2);

        //int value to hexadecimal
        String s3 = Integer.toHexString(i);
        System.out.println(s3);

        //int value to binary
        String s4 = Integer.toBinaryString(i);
        System.out.println(s4);

        //int value to octal
        String s5 = Integer.toOctalString(i);
        System.out.println(s5);




    }
}