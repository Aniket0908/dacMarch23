package in.cdac.acts.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
class Person{
	private String name;
	private int age;
	
	private Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
public class Program {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			Class<?> c = Person.class;
			Constructor<?> constructor = c.getDeclaredConstructor(String.class,int.class);
			constructor.setAccessible(true);
			Person person = (Person) constructor.newInstance("Aniket",25);
			System.out.println(person.toString());
			
			
			Method setname = c.getDeclaredMethod("setName", String.class);
			 setname.invoke(person, "Prerna");
			Method name = c.getDeclaredMethod("getName" );
			 System.out.println(name.invoke(person)); 
			 
			 Method setage = c.getDeclaredMethod("setAge", int.class);
			 setage.invoke(person, 19);
			Method getage = c.getDeclaredMethod("getAge" );
			 System.out.println(getage.invoke(person)); 
			 
				
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
