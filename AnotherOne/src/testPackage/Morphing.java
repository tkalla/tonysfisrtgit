package testPackage;
/**
 * 
 * @author tkall
 *@version 1.0
 *Created class for Polymorphism Understanding
 *Created On: 8/22/2018
 */ 

public class Morphing {
/**
 * 
 * @param oneMore
 * @param twoMore
 * @param threeMore
 * Return String after Replacing
 * 
 */
	public String methodOne(String oneMore, String twoMore, String threeMore) {
		return oneMore.replace(twoMore, threeMore); 	
	// Failure parameter
	}
	public String methodOne(String oneMore, String twoMore, String threeMore, String defult) {
	// Failsafe parameter, adding additional parameter allows 2nd method to be called instead
		try{
				return oneMore.replace(twoMore, threeMore); 	
	}
	catch(Exception e) {
		return defult; 
		}
	}
	public static void main(String [] y) {
		Polymorphism p = new Polymorphism();
	//System.out.println(p.methodOne(null, "y", "t something")) (failure of methodOne);
		System.out.println(p.methodOne(null, "y", "t something", "sorry"));
		// successful methodOne from choosing the 4 parameter method and 'defaulting' when a null value is given
	}
}
