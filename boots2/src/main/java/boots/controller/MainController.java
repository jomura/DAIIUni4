package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/task")
	public String task(HttpServletRequest request){
		 request.setAttribute("mode", "MODE_TASK");
		return "task";
	}
	
	@GetMapping("/pokemon")
	public String pokemon(HttpServletRequest request){
		 request.setAttribute("mode", "MODE_POKEMON");
		return "pokemon";
	}
	
	@GetMapping("/convict")
	public String convict(HttpServletRequest request){
		 request.setAttribute("mode", "MODE_CONVICT");
		return "convict";
	}

	
	
}
