package testPackage;
/**
 * 
 * @author tkall
 *@version 1.0
 *Created to provide an example of abstraction, showing how making classes private can make methods more secure
 *Created on 8/22/2018
 */
public class Abstraction extends replace{
/**
 * 
 * @param t
 * Calls inheritance method to replace using given parameters
 */
	public static void main(String[] t)
		{ 
		Inheritance i= new Inheritance();
		//System.out.println(i.ireplaceUtils("Tony","y","y Kallakavumkal"));
		//Above method wouldn't work as ireplaceUtils is made private, the below method can access ireplaceUtils through the replaceUtils because it is within the replace class 
		System.out.println(i.replaceUtils("Tony","y","y Kallakavumkal"));
		}
	
	public String replace(String A, String B, String C) {
	              return replaceUtils(A, B, C);
		}

}
