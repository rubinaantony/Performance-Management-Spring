package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message,Integer>{
}
