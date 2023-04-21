package telephone;

public class TelephoneBill {
		private String customerName;
		private String phoneNumber;
		private int numberOfCalls;
		private double Duration;
		
		
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public int getNumberOfCalls() {
			return numberOfCalls;
		}
		public void setNumberOfCalls(int numberOfCalls) {
			this.numberOfCalls = numberOfCalls;
		}
		public double getDuration() {
			return Duration;
		}
		public void setDuration(double duration) {
			Duration = duration;
		}
		
		
		
}
