package org.school.dao;

import java.util.List;

import org.school.domain.Answer;

public interface AnswerDAO {

	public Answer findByIdAnswer(long id);

	public Answer findByIdQuestionInAnswer(long questionId);

	public List<Answer> getAllAnswer();

	public void insertAnswer(Answer answer);

	public void setRate(long id, double rate);

	// public double getSumRate();

}
