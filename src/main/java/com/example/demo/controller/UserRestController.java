package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.UserBean;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserRestController {
	
	@Autowired
	private UserService service;
	UserRepository repo;
	@PostMapping("/login")
	public UserBean loginUser(@RequestBody UserBean user)throws Exception {
		String tempu_name=user.getUsername();
		String tempu_pswd=user.getPassword();
		String tempu_role=user.getRole();
		UserBean ub=null;
		if(tempu_name!=null && tempu_pswd!=null) {
			ub=service.fetchUserByUsernameAndPassword(tempu_name,tempu_pswd);
		}
		if(ub==null) {
			throw new Exception("User not exist!!!");
		}
		return ub;
	}
}