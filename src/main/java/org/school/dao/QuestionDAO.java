package org.school.dao;

import org.school.domain.Question;

public interface QuestionDAO {
	
	public void insert(Question question);
	
	public Question findById(long id);
		

}
