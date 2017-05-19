package org.school.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface QuestionMapper {
	@Results(id = "qustionmap", value = { @Result(property = "id", column = "ID"),
			@Result(property = "question", column = "QUESTION"), @Result(property = "maxRate", column = "MAXRATE") })
	@Select("SELECT * from QUESTIONS WHERE ID = #{id}")
	Question findByIdQuestion(@Param("id") long id);

	@ResultMap("qustionmap")
	@Select("SELECT * from QUESTIONS")
	List<Question> getAllQuestion();

	@Insert("INSERT INTO QUESTIONS(QUESTION,MAXRATE) VALUES(#{question}, #{maxRate})")
	void insertQuestion(Question question);

}
