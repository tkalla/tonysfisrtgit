package testPackage;
/**
 * 
 * @author tkall
 *@version 1.0
 *Created to inherit methods of replace class
 *Created on 8/22/2018
 */
public class Inheritance extends replace{
/**
 * 
 * @param t
 * Calls inheritance method to replace using given parameters
 */
	public static void main(String[] t)
		{ 
		Inheritance i= new Inheritance();
		//System.out.println(i.replace("Tony","y","y Kallakavumkal"));
		System.out.println(i.replace(null,"y","y Kallakavumkal"));
		}
	
	public String replace(String A, String B, String C) {
	              return replaceUtils(A, B, C);
		}

}
