package org.school.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.school.domain.ConnectDB;
import org.school.domain.Question;
import org.school.domain.QuestionMapper;

public class QuestionDAOImpl implements QuestionDAO {

	@Override
	public void insertQuestion(Question question) {
<<<<<<< HEAD
		SqlSession session = ConnectDB.createSqlSession().openSession();
=======
		
		//Слетает, т.к. не создан ConnectDB.sqlSessionFactory = null -> NullPointerException;
		//
		//Даже если создать sqlSessionFactory через createSqlSession(), то вылетает ошибка:
		//org.apache.ibatis.builder.IncompleteElementException: Could not find result map org.school.domain.QuestionMapper.answermap
		//
		
		SqlSession session = ConnectDB.getSqlSessionFactory().openSession();
>>>>>>> branch 'working' of https://github.com/rooley/firstProject.git
		QuestionMapper mapper = session.getMapper(QuestionMapper.class);
		mapper.insertQuestion(question);
		session.commit();
		session.close();

	}

	@Override
	public Question findById(long id) {
		SqlSession session = ConnectDB.createSqlSession().openSession();
		QuestionMapper mapper = session.getMapper(QuestionMapper.class);
		Question question = mapper.findByIdQuestion(id);
		session.close();
		return question;
	}

	@Override
	public List<Question> getAllQuestion() {
		SqlSession session = ConnectDB.createSqlSession().openSession();
		QuestionMapper mapper = session.getMapper(QuestionMapper.class);
		List<Question> question = mapper.getAllQuestion();
		session.close();
		return question;
	}

}
