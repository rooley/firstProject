package org.school.web;

import org.school.domain.Question;
import org.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShcoolController {
	
	Long currentIndex = 1L;
	
	@Autowired
	@Qualifier("schoolService")
	private SchoolService schoolService;
	
    @RequestMapping(value = "/enterQuestion", method = RequestMethod.GET)
    public String showQuestion(Model model) {
    	//проверка, если на enterQuestion вышли просто набрав строку в браузере, а не из index
    	if(!model.containsAttribute("question") && !model.containsAttribute("currentIndex")) {
    		model.addAttribute("question", new Question());
    		model.addAttribute("currentIndex", currentIndex);
    	}
    	return "enterQuestion";
    }
	
    //из этого метода сохраняем в базу
    @RequestMapping(value = "/enterQuestion", method = RequestMethod.POST)
    public String addQuestion(@ModelAttribute Question question, Model model) {
    	
    	//schoolService.addQuestion(question);
    	
    	//костыль с currentIndex
    	question.setId(currentIndex);
    	model.addAttribute("question", question);
    	model.addAttribute("currentIndex", currentIndex);
    	currentIndex++;
    	return "result";
    }
    
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String home() {
        return "index";
    }
    
    @RequestMapping(value ="/teacher", method = RequestMethod.GET)
    public String goTeacher(Model model) {
    	try{
    		//Если в базе уже есть записи, то идем на проверку
    		schoolService.findQuestion(1);
    		return "checking";
    	}catch(Exception e) {
    		//База пустая - подсовываем в модель пустой объект, который будет заполняться
    		model.addAttribute("question", new Question());
    		model.addAttribute("currentIndex", currentIndex);
    		return "enterQuestion";
    	}
    }
    
    @RequestMapping(value ="/student", method = RequestMethod.GET)
    public String goStudent() {
    	return "enterAnswer";
    }
}

