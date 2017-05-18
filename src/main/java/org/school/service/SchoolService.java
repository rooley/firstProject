package org.school.service;

import org.school.domain.Answer;
import org.school.domain.Question;

public interface SchoolService {
	
	public void addQuestion(Question question);

	public void checkAnswer(long id, double rate);

	public void addAnswer(Answer answer);
	
	public Answer findAnswer(long id);
	
	public Question findQuestion(long id);
	
	public double showResults();

	

}
