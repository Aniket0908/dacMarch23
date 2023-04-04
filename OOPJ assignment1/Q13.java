class Q13{
    public static void main(String[] args){
        //short value to string
        short sh = 234;
        String s1 = Short.toString(sh);
        System.out.println(s1);

        //short value to short instance
        Short sh1 = Short.valueOf(sh);
        System.out.println(sh1);

        String s1 = new String("123");
        Short sh3 = new Short(s1);
        System.out.println(sh3);
    }
}