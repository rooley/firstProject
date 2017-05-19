package org.school.service;

import org.school.dao.AnswerDAO;
import org.school.dao.QuestionDAO;
import org.school.domain.Answer;
import org.school.domain.Question;
import org.springframework.stereotype.Service;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {

	private AnswerDAO answerDAO;

	private QuestionDAO questionDAO;

	@Override
	public void addQuestion(Question question) {
		questionDAO.insertQuestion(question);
		;
	}

	@Override
	public void checkAnswer(long id, double rate) {
		answerDAO.setRate(id, rate);
	}

	@Override
	public void addAnswer(Answer answer) {
		answerDAO.insertAnswer(answer);
	}

	@Override
	public Answer findAnswer(long id) {
		return answerDAO.findByIdAnswer(id);
	}

	@Override
	public Question findQuestion(long id) {
		return questionDAO.findById(id);
	}

	// @Override
	// public double showResults() {
	// return answerDAO.getSumRate();
	// }

}
