class Q11{
    public static void main(String[] args){
        char ch = args[0].charAt(0);
        
        if(Character.isDigit(ch)){
            System.out.println(ch);
        }
        else{
            if(Character.isLowerCase(ch))
            {
                char c1 = Character.toUpperCase(ch);
                String s1 = String.valueOf(c1);
                int cp = s1.codePointAt(0);
                System.out.println(cp);
                System.out.println(c1);
            }
            else{
                char c2 = Character.toLowerCase(ch);
                System.out.println(c2);
            }
        }
    }

}