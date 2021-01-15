package basic;

public class CallByClassName {

	static int filmPrice=45; //  static global variable 
	
	static String firstName="Hamlat"; 
	
	public static void  display(){
		
		System.out.println("Hi");
		
		
		
	}
	
	public static void main(String[] args) {
		
		int filmPrice2=50; // static local variable 
		System.out.println(filmPrice2);
		
		//  to call a static variable we need to call by class name ,; classname.variable name 
		
		System.out.println(CallByClassName.filmPrice);
		
	
	 System.out.println(DataType.bookPrice);
	 DataType.main(args);
	  CallByClassName.filmPrice=100;
	  System.out.println(filmPrice);
	  // how re assign value 
	
	}
}

