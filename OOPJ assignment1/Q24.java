class Q24{
    public static void main(String[] args){
        //float value into string
        float f = 23.45f;
        String s1 = Float.toString(f);
        System.out.println(s1);

        //float value to float instance
        Float f1 = new Float(f);
        System.out.println(f1);

        //string instance to float instance
        String s2 = new String("23.56");
        Float f2 = Float.valueOf(s2);
        System.out.println(f2);

        //float value to hexadecimal
        String s3 = Float.toHexString(f);
        System.out.println(s3);




    }
}