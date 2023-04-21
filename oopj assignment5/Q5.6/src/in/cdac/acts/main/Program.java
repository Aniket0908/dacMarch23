package in.cdac.acts.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		System.out.print("Enter the path of Class: ");
 	 Class<?> c = Class.forName(sc.nextLine());
 	 Program.getTpyeInfo(c);
 	 Program.getFieldinfo(c);
 	 Program.getMethodInfo(c);
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
 	
}

private static void getMethodInfo(Class<?> c) {
	System.out.println("Methods in "+c.getName()+" are: ");
	 Method[] meth = c.getMethods();
	 for (Method method : meth) {
		    String modName  = Modifier.toString(method.getModifiers());
		    String returnType = method.getReturnType().getSimpleName();
		    String methName = method.getName();
		    
		     Parameter[] parameters = method.getParameters();
		     StringBuffer paramsList = new StringBuffer("( ");
		     for (Parameter parameter : parameters) {
					String paramType = parameter.getType().getName();
					paramsList.append(paramType);
					paramsList.append(" ");
					String paramName =  parameter.getName();
					paramsList.append(paramName);
					paramsList.append(", ");
				}
		     if( parameters.length > 0 )
					paramsList.deleteCharAt( paramsList.length() - 2);
				paramsList.append(")");
				System.out.println( modName+" "+returnType+" "+methName+""+paramsList); 
	}
	 System.out.println();
	
}

private static void getFieldinfo(Class<?> c) {
		System.out.println("Fields in "+c.getName()+" are: ");
 	  Field[] arr = c.getFields();
 	  for (Field field : arr) {
		String fieldname = field.getName();
		String fieldTypeNmae=field.getType().getName();
		String motype=Modifier.toString(field.getModifiers());
		System.out.println(fieldname + "   "+fieldTypeNmae+ "   "+motype);
	}
 	  System.out.println();
}

private static void getTpyeInfo(Class<?> c) {
 	String str = c.getName();
 	System.out.println("Entered Path of Class is "+str);
	System.out.println("Name of class is: "+c.getSimpleName());
	 Package pkg = c.getPackage();
	 System.out.println("Name of Package is: "+pkg.getName());
	 int mod = c.getModifiers();
	 
	 System.out.println("Name of Modifier is: "+Modifier.toString(mod));
	  Class<?>[] arr = c.getInterfaces();
	  StringBuffer sb = new StringBuffer();
	  for (Class<?> class1 : arr) {
		sb.append("Name of Interface : "+class1.getName()+" ");
	}
	  System.out.println(sb);
	  System.out.println("Name of Super Class : "+c.getSuperclass().getName());
	  System.out.println();
}

}
