class Q7{
    public static void main(String[] args){
        byte b =Byte.BYTES;
        System.out.println(b);
        byte b1 = Byte.SIZE;
        System.out.println(b1);
        b=Byte.MAX_VALUE;
         System.out.println(b);
        b=Byte.MIN_VALUE;
         System.out.println(b);

        Byte b3 = new Byte(3);
       byte b4=b3.byteValue();
        System.out.println(b4);
    }
}