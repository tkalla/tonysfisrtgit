package testPackage;
/**
 * 
 * 
 * @author tkall
 * @version 1.0 
 * written on 8/22/2018 
 */
public class replace {
	
	/**
	 * 
	 * @param srcString
	 * @param searchToken
	 * @param replaceToken
	 * @return String after replacing
	 */
	public String replaceUtils(String srcString, String searchToken, String replaceToken) {
		return ireplaceUtils(srcString, searchToken, replaceToken);	
			}
	/**
	 * 
	 * @param srcString
	 * @param searchToken
	 * @param replaceToken
	 * @return String after replacing
	 */
	private String ireplaceUtils(String srcString, String searchToken, String replaceToken) {
		return srcString.replace(searchToken, replaceToken); 
	}
}
