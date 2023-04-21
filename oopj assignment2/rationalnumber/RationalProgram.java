package rationalnumber;



public class RationalProgram {
	public static void main(String[] args) {
		Test t1 = new Test();
	
		
		int ch;
		while((ch=Test.menuList())!=0) {
			switch (ch) {
			case 1:t1.acceptRecord();
				break;
			case 2:t1.add();
				break;
			case 3:t1.subtract();
				break;
			case 4:t1.multiply();
				break;
			case 5:t1.divide();
				break;
			default:System.out.println("Enter a valid choice");
				break;
			
			}
		}
	}
	
	
	
}
