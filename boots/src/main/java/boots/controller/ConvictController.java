package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.service.ConvictService;


import boots.model.Convict;

@Controller
public class ConvictController {

	@Autowired
	private ConvictService convictService;
	
	@GetMapping("/all-convicts")
	public String allConvicts(HttpServletRequest request){
		request.setAttribute("convicts", convictService.findAll());
		request.setAttribute("mode", "MODE_CONVICTS");
		return "convict";
	}
	
	@GetMapping("/new-convict")
	public String newConvict(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW_CONVICT");
		return "convict";
	}
	
	@GetMapping("/update-convict")
	public String updateConvict(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("convict", convictService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE_CONVICT");
		return "convict";
	}
	
	@GetMapping("/delete-convict")
	public String deleteConvict(@RequestParam int id,HttpServletRequest request){
		convictService.delete(id);
		request.setAttribute("convicts", convictService.findAll());
		request.setAttribute("mode", "MODE_CONVICTS");
		return "convict";
	}
	
	@PostMapping("/save-convict")
	public String saveConvict(@ModelAttribute Convict convict,
			BindingResult bindingResult,HttpServletRequest request){
		convictService.save(convict);
		request.setAttribute("convicts", convictService.findAll());
		request.setAttribute("mode", "MODE_CONVICTS");
		return "convict";
		
	}

	
	
}
