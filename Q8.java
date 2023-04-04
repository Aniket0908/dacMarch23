class Q8{
    public static void main(String[] args){
        //byte value into String
        byte b = 50;
        String s = String.valueOf(b);
        System.out.println(s);

        //byte value into byte instance
        byte b1 = 67;
        Byte bi = Byte.valueOf(b1);
        System.out.println(bi);

        //string instance to byte instance
        String s1 = new String("2");
        byte b2 = Byte.parseByte(s1);
        Byte b3 = Byte.valueOf(b2);
        System.out.println(b3);


    }
}