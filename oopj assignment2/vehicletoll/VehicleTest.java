package vehicletoll;

import java.util.Scanner;

public class VehicleTest {
	private TollBillGenerator tb = new TollBillGenerator();
	private static Scanner sc = new Scanner(System.in);
	
	public void vehicleType(){
        System.out.print("Enter vehicle type : ");
        sc.nextLine();
        String vt=sc.nextLine();
        if(vt.equals("car") || vt.equals("van") || vt.equals("bus") || vt.equals("truck") ){
            tb.setVehicleType(vt);
        }
        else System.out.println("Invalid vehicle type");
    }
    public void numOfAxles(){
        System.out.print("Enter no of axles : ");
        tb.setNumAxle(sc.nextInt());
    }
    public void enterDistance(){
        System.out.print("Enter distance travelled : ");
        tb.setDistanceTravelled(sc.nextDouble());
    } 
	
	public void calculateTollFee() {
		double fee;
		if(tb.getVehicleType().equalsIgnoreCase("car")||tb.getVehicleType().equalsIgnoreCase("van")||tb.getVehicleType().equalsIgnoreCase("bus")) {
			fee = 0.25*tb.getDistanceTravelled()*tb.getNumAxle() + tb.getTollAmountDeu();
		}
		else
		{
			fee = 0.5*tb.getDistanceTravelled()*tb.getNumAxle() + tb.getTollAmountDeu();

		}
		tb.setTollFee(fee);
	}
	public void generateBill() {
		calculateTollFee();
		System.out.println("Vehicle Type: "+ tb.getVehicleType());
		System.out.println("no. of Axle: "+ tb.getNumAxle());
		System.out.println("Distance Travelled: "+ tb.getDistanceTravelled());
		System.out.println("toll amount:"+ tb.getTollFee());
		System.out.println("Amount due:"+ tb.getTollAmountDeu());
		
	}
	public int showMenu() {
		sc = new Scanner(System.in);
		System.out.println("1.Enter vehicle type (car, van, bus, or truck)");
		System.out.println("2.Enter number of axles");
		System.out.println("3.Enter distance travelled");
		System.out.println("4.Calculate toll fee");
		System.out.println("5.Generate bill");
		System.out.println("6.Exit");
		System.out.println("Enter your choice");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		VehicleTest vt = new VehicleTest();
		int choice;
		while((choice=vt.showMenu())!=6)
		{
			switch( choice ){
	        case 1:
	          vt.vehicleType();;
	          break;
	        case 2:
	           vt.numOfAxles();
	            break;
	        case 3:
	            vt.enterDistance();
	            break;
	        case 4:
	              vt.calculateTollFee();
	           
	            break;
	        case 5:
	            vt.generateBill();
	            
	            break;
	        case 6:
	            vt.numOfAxles();
	            break;
	      }
		}
		
	}
}
