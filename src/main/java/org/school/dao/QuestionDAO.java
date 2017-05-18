package org.school.dao;

import java.util.List;

import org.school.domain.Question;

public interface QuestionDAO {

	public void insertQuestion(Question question);

	public Question findById(long id);

	public List<Question> getAllQuestion();

	public void setMaxRate(double maxRate);

}
