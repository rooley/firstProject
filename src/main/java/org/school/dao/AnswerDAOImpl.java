package org.school.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.school.domain.Answer;
import org.school.domain.AnswerMapper;
import org.school.domain.ConnectDB;

public class AnswerDAOImpl implements AnswerDAO {

	@Override
	public Answer findByIdAnswer(long id) {
		SqlSession session = ConnectDB.createSqlSession().openSession();
		AnswerMapper mapper = session.getMapper(AnswerMapper.class);
		Answer answer = mapper.findByIdAnswer(id);
		session.close();
		return answer;

	}

	@Override
	public Answer findByIdQuestionInAnswer(long questionId) {
		SqlSession session = ConnectDB.createSqlSession().openSession();
		AnswerMapper mapper = session.getMapper(AnswerMapper.class);
		Answer answer = mapper.findByIdQuestionInAnswer(questionId);
		session.close();
		return answer;
	}

	@Override
	public List<Answer> getAllAnswer() {
		SqlSession session = ConnectDB.createSqlSession().openSession();
		AnswerMapper mapper = session.getMapper(AnswerMapper.class);
		List<Answer> answer = mapper.getAllAnswer();
		session.close();
		return answer;
	}

	@Override
	public void insertAnswer(Answer answer) {
		SqlSession session = ConnectDB.createSqlSession().openSession();
		AnswerMapper mapper = session.getMapper(AnswerMapper.class);
		mapper.insertAnswer(answer);
		session.commit();
		session.close();

	}

	@Override
	public void setRate(long id, double rate) {
		SqlSession session = ConnectDB.createSqlSession().openSession();
		AnswerMapper mapper = session.getMapper(AnswerMapper.class);
		mapper.setRate(id, rate);
		session.commit();
		session.close();

	}

}
