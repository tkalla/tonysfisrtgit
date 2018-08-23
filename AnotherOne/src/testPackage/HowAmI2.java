package testPackage;

public class HowAmI2 {
// Ensure that defined variables are made private 	
	private String h = "How";
	private String a = "are";
	private String y = "you";
	private String d = "Doing?";
	private String s = " "; 
   
    
	public static void main( String[] b) {
		 HowAmI2 hai = new HowAmI2();
		//System.out.println(HowAmI.h.concat(HowAmI.a).concat(hai.t).concat(s).concat(y).concat(s).concat(d));
		//HowAmI yes = new HowAmI();
		System.out.println(hai.returnH() + hai.returnS() + hai.returnA() + hai.returnS() + hai.returnY() + hai.returnS() + hai.returnD());
	
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