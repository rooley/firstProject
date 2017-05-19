package org.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);

		// QuestionDAO questionDAO = new QuestionDAOImpl();
		// // insert
		// Question question = new Question();
		// question.setQuestion("kjadkjahsd?");
		// question.setMaxRate(0.5);
		// questionDAO.insertQuestion(question);
		//
		// // select
		//
		// question = questionDAO.findById(2);
		//
		// System.out.println(question.getMaxRate());

	}
}