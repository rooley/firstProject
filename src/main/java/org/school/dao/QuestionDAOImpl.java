package org.school.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.school.domain.ConnectDB;
import org.school.domain.Question;
import org.school.domain.QuestionMapper;

@org.springframework.stereotype.Repository("questionRespitory")
public class QuestionDAOImpl implements QuestionDAO {

	@Override
	public void insertQuestion(Question question) {
		SqlSession session = ConnectDB.getSqlSessionFactory().openSession();
		QuestionMapper mapper = session.getMapper(QuestionMapper.class);
		mapper.insertQuestion(question);
		session.commit();
		session.close();

	}

	@Override
	public Question findById(long id) {
		SqlSession session = ConnectDB.getSqlSessionFactory().openSession();
		QuestionMapper mapper = session.getMapper(QuestionMapper.class);
		Question question = mapper.findByIdQuestion(id);
		session.close();
		return question;
	}

	@Override
	public List<Question> getAllQuestion() {
		SqlSession session = ConnectDB.getSqlSessionFactory().openSession();
		QuestionMapper mapper = session.getMapper(QuestionMapper.class);
		List<Question> question = mapper.getAllQuestion();
		session.close();
		return question;
	}

}
