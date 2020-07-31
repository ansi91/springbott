package controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class TestController {

@Autowired
public TestLogic testLogic = null;
	
@GetMapping("home")	
public String home() {
	
	 return "views/index";
}

@GetMapping("current_time")
public String current_time(Model model) {
	String time = testLogic.current_time();
	model.addAttribute("time",time);
	return "views/index";
}

}
