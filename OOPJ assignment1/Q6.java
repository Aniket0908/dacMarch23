class Q6{
    public static void main(String[] args){
        //boolean to String
        boolean b = true;                  
        String s1 = String.valueOf(b);
        System.out.println(b);
        //boolean to Boolean instance
        Boolean b1= Boolean.valueOf(b);   
        System.out.println(b1);
        String s2 = "false";
        //String to boolean
        boolean b2 = Boolean.parseBoolean(s2);
        System.out.println(b2);
        //String value to Boolean instance
        String s5 = "false";
        boolean b4 = Boolean.parseBoolean(s5);
        Boolean b5 = Boolean.valueOf(b4);
        System.out.print(b4);

       
    }
}