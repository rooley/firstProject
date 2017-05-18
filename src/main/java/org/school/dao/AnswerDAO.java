package org.school.dao;

import org.school.domain.Answer;

public interface AnswerDAO {
	
	public void insert(Answer answer);
	
	public Answer findById(long id);
	
	public void setRate(long id, double rate);
	
	public double getSumRate();
	
}
