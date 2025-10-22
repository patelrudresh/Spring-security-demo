package com.springSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//	        String rawPassword = "anshul"; // tumhara login password
//	        String encodedPassword = encoder.encode(rawPassword);
//	        System.out.println(encodedPassword);
//	        
	        String plaintext = "1234";
	        String bcryptHash = "$2a$10$ilW0okVB/pMNMBmaRrqC6.gcjRedvF//ArhDCbLrx1We2MiQFCGIG";

	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	        boolean matches = encoder.matches(plaintext, bcryptHash);

	        System.out.println("Password matches? " + matches);
	    }
	}


