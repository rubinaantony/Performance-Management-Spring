package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message,Integer>{
	 @Query("select c from Message c where c.m_reviewing = :m_reviewing")
	List<Message> findByM_reviewing(String m_reviewing);
}
