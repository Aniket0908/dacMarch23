package in.cdac.acts.domain;

public class Person implements Cloneable {
		private String name;
		private Address ad;
		public Person(String name, String street,String city,String state){
			this.name=name;
			this.ad= new Address(street,city,state);
		}
		@Override
		public Person clone() {
		 try {
			Person other = (Person)super.clone();
			 other.ad=this.ad.clone();
			 return other;
		} catch (CloneNotSupportedException ex) {
			throw new InternalError(ex);
		}
		
		}
		
		public static void main(String[] args) {
			Person p = new Person("Aniket Raut","Waghapur Road","Yavatmal","Maharashtra");
			Person p1 = p.clone();
			System.out.println(p1==p);
		}
}
