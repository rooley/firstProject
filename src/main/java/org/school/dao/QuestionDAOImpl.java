package org.school.dao;

import org.school.domain.Question;

@org.springframework.stereotype.Repository("questionRespitory")
public class QuestionDAOImpl implements QuestionDAO {

	@Override
	public void insert(Question question) {
		
		
	}

	@Override
	public Question findById(long id) {
		
		return null;
	}

}
