package boots.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello World";
		
	}
	/*
	@GetMapping("/all-tasks")
	public String allTasks(){
		
		
		return taskService.findAll().toString();
		
	}
	
	@GetMapping("/save")
	public String save(@RequestParam String name,@RequestParam String desc){
		Task task = new Task(name, desc, new Date(), false);
		taskService.save(task);
		
		
		return "Task saved!";
		
	}
	@GetMapping("/delete")
	public String delete(@RequestParam int id){
		taskService.delete(id);
		
		
		return "Task deleted!";
		
	}
	*/
}
