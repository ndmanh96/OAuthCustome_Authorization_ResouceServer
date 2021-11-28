package com.manhcode.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.manhcode.entity.User;
import com.manhcode.repository.UserRepository;

@Service
public class UserCustomDetailService implements UserDetailsService{
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Can't find username: "+username);
		}
		System.out.println(user);
		return new UserCustomDetail(user);
	}

}
