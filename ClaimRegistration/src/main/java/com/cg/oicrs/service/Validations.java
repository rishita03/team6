package com.cg.oicrs.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

	
	public boolean isValidAccidentZip(int accidentZip) {
		
		String zipPattern = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$"; 

		String accZip = String.valueOf(accidentZip);
		
		
		
		Pattern pattern = Pattern.compile(zipPattern); 
		
		if (accZip == null) {
			
			return false; 
		} 
		
		Matcher matcher = pattern.matcher(accZip); 

		return matcher.matches();
		
		
	}
}