package testPackage;
/**
 * 
 * @author tkall
 *@version 1.0
 *static methods can be accessed without the creation of objects, using new keywords 
 */
public class HowAmI {
// Ensure that defined variables are made private 	
	private static String h = "How";
	private static String a = "are";
	private static String y = "you";
	private static String d = "Doing?";
	private static String s = " "; 
   
    
	public static void main( String[] b) {
		 //HowAmI hai = new HowAmI();
		//System.out.println(HowAmI.h.concat(HowAmI.a).concat(hai.t).concat(s).concat(y).concat(s).concat(d));
		//HowAmI yes = new HowAmI();
		System.out.println(HowAmI.returnH() + HowAmI.returnS() + HowAmI.returnA() + HowAmI.returnS() + HowAmI.returnY() + HowAmI.returnS() + HowAmI.returnD());
	
	}

	public static String returnH() {
		return HowAmI.h; // this is how to create methods (as well as return the string var)
	}
	public static String returnA() {
		return HowAmI.a;
	}
	public static String returnY() {
		return HowAmI.y;
	}
	public static String returnD() {
		return HowAmI.d;
	}
	public static String returnS() {
		return HowAmI.s;
	}
	
	
}