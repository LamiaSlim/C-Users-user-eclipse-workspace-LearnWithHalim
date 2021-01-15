package basic;

public class CallByObject {

	// no static variable 
	// how to call a non static variable inside main method 
	// the solution is using object name
	// we need to create an object:  ClassName ObjectName =new ConstructorOfclass ();
	
	String carName="Honda"; // non static global variable 
	
	
	
	
	
	public static void main(String[] args) {
		
	CallByObject obj=new CallByObject();
	System.out.println(obj.carName);
	
	}
}


