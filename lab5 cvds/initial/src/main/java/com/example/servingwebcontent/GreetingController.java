package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@RequestMapping("/user/{id}")
	public String getUser(@PathVariable Integer id,Model model) {
		String uri = "https://jsonplaceholder.typicode.com/todos/" + Integer.toString(id);
		RestTemplate restTemplate = new RestTemplate();

		User user = restTemplate.getForObject(uri, User.class);
		String ID = Integer.toString(user.getId());
		String title = user.getTitle();
		String completed = Boolean.toString(user.getCompleted());

		model.addAttribute("user",user);
		model.addAttribute("ID",ID);
		model.addAttribute("title",title);
		model.addAttribute("completed",completed);
		return "user";
	}

	/*@RequestMapping("/user/{id}")
	public ModelAndView getUser(@PathVariable Integer id,Model model) {
		String uri = "https://jsonplaceholder.typicode.com/todos/" + Integer.toString(id);
		RestTemplate restTemplate = new RestTemplate();

		User user = restTemplate.getForObject(uri, User.class);
		String ID = Integer.toString(user.getId());
		String title = user.getTitle();
		String completed = Boolean.toString(user.getCompleted());

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user",user);
		modelAndView.addObject("ID",ID);
		modelAndView.addObject("title",title);
		modelAndView.addObject("completed",completed);

		return modelAndView;
	}*/
}