package testPackage;
import testPackage.HowAmI;
/**
 * 
 * @author tkall
 *@version 1.0
 *Always use StringBuilder for Concat, since string is an immutable class and JVM maintains string pool, which will impact performance.
 *
 */
public class StringBuffer {
	public static void main( String[] b) {
       StringBuilder sb = new StringBuilder("");
       
		System.out.println(sb.append(HowAmI.returnH()).append(HowAmI.returnS()).append(HowAmI.returnA()).append(HowAmI.returnS()).append(HowAmI.returnY()).append(HowAmI.returnS()).append(HowAmI.returnD()));
	
	}

}
