package in.cdac.acts.domain;

public class Address implements Cloneable {
		private String street;
		private String city;
		private String state;
		public Address() {
			this("", "", "");
		}
		public Address(String street,String city,String state) {
			this.street=street;
			this.city=city;
			this.state=state;
		}
		@Override
		protected Address clone() {
		 try {
			Address other = (Address) super.clone();
			 return other;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
		 
		}
}
