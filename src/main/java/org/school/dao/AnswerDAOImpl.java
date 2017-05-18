package org.school.dao;

import org.school.domain.Answer;

@org.springframework.stereotype.Repository("answerRespitory")
public class AnswerDAOImpl implements AnswerDAO{

	@Override
	public void insert(Answer answer) {
		
		
	}

	@Override
	public Answer findById(long id) {
		
		return null;
	}

	@Override
	public void setRate(long id, double rate) {
		
		
	}

	@Override
	public double getSumRate() {
		
		return 0;
	}

}
