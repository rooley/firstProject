package org.school.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Andrey on 16.05.2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index.html";
    }
    
    @RequestMapping(value ="/teacher", method = RequestMethod.GET)
    public String goTeacher() {
    	return "enterQuestion.html";
    }
    
    @RequestMapping(value ="/student", method = RequestMethod.GET)
    public String goStudent() {
    	return "enterAnswer.html";
    }
}
