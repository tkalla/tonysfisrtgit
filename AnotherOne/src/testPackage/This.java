package testPackage;
/**
 * 
 * @author tkall
 *@version 1.0
 *this refers to the current object
 * **Practicing Merge**
 */
public class This {
// Ensure that defined variables are made private 	
	private String h;
	private String a;
	private String y;
	private String d;
	private String s; 
   
	public This(String a, String b, String c, String d, String e) {
		this.h=a; 
		this.a=b;
		this.y=c;
		this.d=d;
		this.s=e;
	}
    
	public static void main( String[] b) {
		This hai = new This("How", "are", "you", "Doing?", " ");
		This hai1 = new This("How1", "are11", "you1", "Doing1?", "-");
		//System.out.println(HowAmI.h.concat(HowAmI.a).concat(hai.t).concat(s).concat(y).concat(s).concat(d));
		//HowAmI yes = new HowAmI();
		System.out.println(hai.returnH() + hai.returnS() + hai.returnA() + hai.returnS() + hai.returnY() + hai.returnS() + hai.returnD());
		System.out.println(hai1.returnH() + hai1.returnS() + hai1.returnA() + hai1.returnS() + hai1.returnY() + hai1.returnS() + hai1.returnD());
	
	}

	public String returnH() {
		return this.h; // this is how to create methods (as well as return the string var)
	}
	public String returnA() {
		return this.a;
	}
	public String returnY() {
		return this.y;
	}
	public String returnD() {
		return this.d;
	}
	public String returnS() {
		return this.s;
	}
	
	
}