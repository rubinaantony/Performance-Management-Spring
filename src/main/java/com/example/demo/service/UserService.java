package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.UserBean;
import com.example.demo.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository repo;


	public UserBean fetchUserByUsernameAndPassword(String username,String password) {
		return repo.findByUsernameAndPassword(username,password);

	}
}