package com.example.demo.controller;

import java.util.List;

import com.example.demo.bean.UserBean;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.Employee;
import com.example.demo.repository.EmployeeRepo;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeRestController {
    @Autowired
    EmployeeRepo repo;

    @Autowired
    UserRepository userRepo;
//------------------To View Employee Details------------------
    @GetMapping("/employee/view")
    public ResponseEntity<List<Employee>> view() {
        return ResponseEntity.ok().body(repo.findAll());
    }
//-------------------------------------------------------------
    
  //------------------To Insert Employee Details---------------
    @PostMapping("/employee/insert")
    public Employee insert(@RequestBody Employee employee) {
        if (repo.findByE_Username(employee.getE_username()) == null) {
            userRepo.save(new UserBean(employee.getE_username(), employee.getE_password(), employee.getE_role()));
            return repo.save(employee);
        } else
            return new Employee();
    }
 
//-------------------------------------------------------------
    
    
//------------------To Update Employee Details-----------------
    
    @PostMapping("/employee/update")
	public Employee update(@RequestBody Employee employee) {

		return repo.save(employee);
	}
    
//-------------------------------------------------------------- 
    
//------------------To Delete Employee Details------------------
    
    @DeleteMapping("/employee/delete/{e_id}")
    public List<Employee> delete(@PathVariable Integer e_id) {
        repo.deleteById(e_id);
        return repo.findAll();
    }
//--------------------------------------------------------------
}