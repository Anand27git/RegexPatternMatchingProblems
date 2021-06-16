package com.BridgeLabz.regexpatterns;

import static org.junit.Assert.*;

import org.junit.Test;
/***
 * 
 * @author ANAND
 * UC-1 Test case to check the PinCode 400088 is valid or not
 * UC-2 Test case to check the Alphabet at starting PinCode A400088 is valid or not
 */
public class PincodeTestCase {
   
	
	//UC-1 Test case for  validating pin code 400088
	@Test
	public void passThePinCodeValidationItShouldReturnValidOrNot() {
		Pincode code = new Pincode();
		assertTrue(code.validPinCode("400088"));   //valid pin code   
		assertFalse(code.validPinCode("5AA637"));   //invalid
		assertFalse(code.validPinCode("A78985"));   //invalid
		//test case passed
	}
	
	//UC-2 Test case for  validating alphabet at starting of pincode 400088
		@Test
		public void passThePinCodeValidationItShouldReturnValidOrNotatAlphabet() {
			Pincode code = new Pincode();
			assertFalse(code.validPinCode("A400088"));   //invalid
			//test case passed
		}
}
