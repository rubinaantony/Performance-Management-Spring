package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_REVIEWMESSAGE")
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MSG_SEQ")
	@SequenceGenerator(sequenceName="TBL_MESSAGE_SEQ",allocationSize=1,name="MSG_SEQ")
	
	private int m_id;
	private String m_reviewed;
	private String m_reviewing;
	private String m_message;
	private String m_feedback;
	
	//-------------------------Constructor----------------------//
	public Message() {
		super();
	}
	public Message(int m_id, String m_reviewed, String m_reviewing, String m_message, String m_feedback) {
		super();
		this.m_id = m_id;
		this.m_reviewed = m_reviewed;
		this.m_reviewing = m_reviewing;
		this.m_message = m_message;
		this.m_feedback = m_feedback;
	}
	
	//-----------------------------------------------------------//
	
	//-------------------------Getters and Setters----------------------//
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_reviewed() {
		return m_reviewed;
	}
	public void setM_reviewed(String m_reviewed) {
		this.m_reviewed = m_reviewed;
	}
	public String getM_reviewing() {
		return m_reviewing;
	}
	public void setM_reviewing(String m_reviewing) {
		this.m_reviewing = m_reviewing;
	}
	public String getM_message() {
		return m_message;
	}
	public void setM_message(String m_message) {
		this.m_message = m_message;
	}
	public String getM_feedback() {
		return m_feedback;
	}
	public void setM_feedback(String m_feedback) {
		this.m_feedback = m_feedback;
	}
	//---------------------------END---------------------------//

}
