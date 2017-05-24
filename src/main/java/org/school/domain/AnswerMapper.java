package org.school.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AnswerMapper {
	@Results(id = "answermap", value = { @Result(property = "id", column = "ID"),
			@Result(property = "message", column = "ANSWER"), @Result(property = "rate", column = "RATE"),
			@Result(property = "questionId", column = "QUESTION_ID"), })
	@Select("SELECT * from ANSWERS WHERE ID = #{id}")
	Answer findByIdAnswer(@Param("id") long id);

	@ResultMap("answermap")
	@Select("SELECT * from ANSWERS WHERE QUESTION_ID = #{questionId}")
	Answer findByIdQuestionInAnswer(@Param("questionId") long questionId);

	@ResultMap("answermap")
	@Select("SELECT * FROM ANSWERS")
	List<Answer> getAllAnswer();

	@Insert("INSERT INTO ANSWERS(ANSWER,QUESTION_ID) VALUES(#{message}, #{questionId})")
	void insertAnswer(Answer answer);

	@Update("UPDATE ANSWERS SET RATE=#{rate}, WHERE ID =#{id}")
	void setRate(long id, double rate);
}
