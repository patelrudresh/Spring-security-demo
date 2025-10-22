package com.springSecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springSecurity.entity.Student;
import com.springSecurity.repository.StudentRepo;

@Service
public class CustomUserService implements UserDetailsService {
	
	@Autowired
	  private StudentRepo stuRepo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	     Student stu= stuRepo.findByEmail(email);
	     if(stu==null) {
	    	 throw new UsernameNotFoundException("user name not found");
	     }else {
	    	 return new CustomUser(stu);
	     }
		
	}

}
