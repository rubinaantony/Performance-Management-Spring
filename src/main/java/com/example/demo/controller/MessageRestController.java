package com.example.demo.controller;

import java.util.List;
import java.util.Map;

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
import com.example.demo.bean.Message;
import com.example.demo.bean.UserBean;
import com.example.demo.repository.MessageRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MessageRestController {
		
		@Autowired
		MessageRepo repo;
		
		@GetMapping("/review/view")
		public ResponseEntity<List<Message>> view() {
			return ResponseEntity.ok().body(repo.findAll());
		}
		
		@GetMapping("/review/view/{username}")
		public ResponseEntity<List<Message>> view(@PathVariable String username) {
			return ResponseEntity.ok().body(repo.findByM_reviewing(username));
		}

		@PostMapping("/review/insert")
		public Message insert(@RequestBody Message message) {

			return repo.save(message);
		}
		
		@PostMapping("/review/update")
		public Message update(@RequestBody Message message) {

			return repo.save(message);
		}
		
		@DeleteMapping("/review/delete/{id}")
		public List<Message> delete(@PathVariable Integer id) {

			repo.deleteById(id);
			return repo.findAll();
		}
		
	

	}

