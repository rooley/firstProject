package org.school.web;

import org.school.domain.Question;
import org.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShcoolController {
	
    public static final String MSG_ATTRIBUTE = "message";
    public static final String RATE_ATTRIBUTE = "rate";
	
	@Autowired
	@Qualifier("schoolService")
	private SchoolService schoolService;
	
    @RequestMapping(value = "/addQuestion", method = RequestMethod.POST)
    public String addQuestion(@RequestParam String message, @RequestParam String rate) {
    	
    	Question question = new Question();
    	question.setQuestion(message);
    	question.setMaxRate(Double.parseDouble(rate));
    	schoolService.addQuestion(question);
    	
    	return "redirect:/enterQuestion.html";
    }

}
