package testPackage;
/**
 * 
 * @author tkall
 *@version 1.0
 *Created to show example of Overriding methods
 *Created on 8/22/2018
 */
public class Override extends Polymorphism {

	public String methodOne(String oneMore, String twoMore, String threeMore, String defult) {
	
				String inherit = super.methodOne(oneMore, twoMore, threeMore, defult); 	
				if(inherit.equalsIgnoreCase("tony")){
					return "successfully overridden"; 
				
					}
				else {
					return inherit;
		//Calls methodOne from Polymorphism class, if it returns a value "tony" then override with a new phrase, otherwise it proceeds as normal			
				}
	}
	
	public static void main(String[] h) {
		
	Override o= new Override();
	System.out.println(o.methodOne(null, "yes", "no", "tony"));
	}
	// New override class is initialized and see that when the null value can't be parsed, override ignores the 'default' and provides its overridden value
	
}
