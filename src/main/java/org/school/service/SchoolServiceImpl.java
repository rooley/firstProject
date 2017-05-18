package org.school.service;

import org.school.dao.AnswerDAO;
import org.school.dao.QuestionDAO;
import org.school.domain.Answer;
import org.school.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService{
	
	@Autowired
	private AnswerDAO answerDAO;
	
	@Autowired
	private QuestionDAO questionDAO;
	
	@Override
	public void addQuestion(Question question) {	
		questionDAO.insert(question);
	}

	@Override
	public void checkAnswer(long id, double rate) {
		answerDAO.setRate(id, rate);
	}

	@Override
	public void addAnswer(Answer answer) {		
		answerDAO.insert(answer);
	}

	@Override
	public Answer findAnswer(long id) {
		return answerDAO.findById(id);
	}

	@Override
	public Question findQuestion(long id) {
		return questionDAO.findById(id);
	}

	@Override
	public double showResults() {		
		return answerDAO.getSumRate();
	}

	
}
