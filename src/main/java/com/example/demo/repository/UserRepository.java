package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.bean.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Integer>{

	public UserBean findByUsernameAndPassword(String username,String password);

}