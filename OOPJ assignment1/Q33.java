class Q33{
    public static void main(String[] args){
        int n1 = Integer.parseInt(args[ 0 ]);
        float n2 = Float.parseFloat(args[ 1 ]) ;
        double n3 = Double.parseDouble(args[ 2 ]) ;
        // double resul = n1+n2+n3;
        // System.out.println(resul);
        int ch =2;
        double result =0;
        switch(ch){
                
            case 1: result = n1 + n2 + n3;
                   
                    break;
            case 2: result = n1*n2*n3;
                       
                    break;
            case 3: result = n1 - n2;
                        
                    break;
            case 4: result = n1/n2;
                        
                     
        }
       System.out.println("Result :" + result);
        

    }
}