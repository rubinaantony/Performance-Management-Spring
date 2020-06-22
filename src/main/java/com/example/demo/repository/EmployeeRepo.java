package com.example.demo.repository;

import com.example.demo.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

    @Query("select c from Employee c where c.e_username = :e_username")
    Employee findByE_Username(@Param("e_username") String e_username);


}
