package testPackage;

import Exceptions.NoInput;
import Exceptions.customExceptions;

/**
 * 
 * @author tkall
 *@version 1.0
 *Created class for Polymorphism Understanding
 *Created On: 8/22/2018
 */ 

public class testException {
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
	public String methodOne(String oneMore, String twoMore, String threeMore, String defult) throws NoInput {
			try{
				return oneMore.replace(twoMore, threeMore); 	
	}
	catch(Exception e) {
		throw new NoInput ("input exception");
		
	}
				
	}
	public static void main(String [] y) throws customExceptions, NoInput {
		testException p = new testException();
	//System.out.println(p.methodOne(null, "y", "t something")) (failure of methodOne);
		try {
			System.out.println(p.methodOne(null, "y", "t something", "sorry"));
		} catch (NoInput e) {
			if(e.getMessage()!=null) {
				throw new NoInput("No Input Found");		}
			else {
				throw new customExceptions("Listen");
			}
		}
		// successful methodOne from choosing the 4 parameter method and 'defaulting' when a null value is given
	}
}
