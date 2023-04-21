package vehicletoll;


public class TollBillGenerator {
	private String vehicleType;
	private int numAxle;
	private double distanceTravelled;
	private double tollFee;
	private double tollAmountDeu = 2.00;
	
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNumAxle() {
		return numAxle;
	}
	public void setNumAxle(int numAxle) {
		this.numAxle = numAxle;
	}
	public double getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public double getTollAmountDeu() {
		return tollAmountDeu;
	}
	public void setTollAmountDeu(double tollAmountDeu) {
		this.tollAmountDeu = tollAmountDeu;
	}
	public double getTollFee() {
		return tollFee;
	}
	public void setTollFee(double tollFee) {
		this.tollFee = tollFee;
	}
	
}
