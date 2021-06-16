package com.BridgeLabz.regexpatterns;

import java.util.regex.*;

/***********************
 * 
 * @author ANAND 
 * purpose: Validate the Pin code using Regular expression pattern Matching 
 * UC-1 Create regexpattern to validate Pin code 400088
 * UC-2 Check the Alphabet at starting PinCode A400088 is valid or not
 * UC-3 Check the special character end of PinCode 400088B- is valid or not
 * UC-4 Check the space between  PinCode 400 088 is valid or not
 * 
 *********************/
public class Pincode {
/*****
 * 
 * @param pincode
 * @return
 */
	public boolean validPinCode(String pincode) {
		return Pattern.matches("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$", pincode);
	}
}
