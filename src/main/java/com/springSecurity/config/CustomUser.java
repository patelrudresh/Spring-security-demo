package com.springSecurity.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springSecurity.entity.Student;

public class CustomUser implements UserDetails {
	   public CustomUser(Student student) {
	        this.student = student;
	  
	   }
	  
	 private Student student;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities()  {
		 SimpleGrantedAuthority authority=new SimpleGrantedAuthority(student.getRole());
		return Arrays.asList(authority );
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return student.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return student.getEmail();
	}

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
