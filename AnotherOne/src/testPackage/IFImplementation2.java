package testPackage;

public class IFImplementation2{

	public static void main(String [] e) {
		SBInheritance i = new IFImplementation(); //MYSQL client 1 
		SBInheritance f = new ImplementIF();  //MYSQL client 2
	System.out.println(i.testMe2());
	System.out.println(f.testMe2());
	    
	}
}
