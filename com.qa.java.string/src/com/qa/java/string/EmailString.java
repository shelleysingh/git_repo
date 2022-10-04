//package com.qa.java.string;
//
//public class EmailString {
//
//	// METHOD for returning valid emails
//	
//	static int validEmails(String[] emails) {
//		String regEx = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
//		int count = 0;
//		
//		for (String Email : emails) {
//			if (Email.matches(regEx))
//				count++;
//		}
//		return count;
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
//
//// ^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$