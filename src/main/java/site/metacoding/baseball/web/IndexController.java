package site.metacoding.baseball.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/list")
	public String sample() {
		return "stadium/list";
	}
	
	@GetMapping("/saveForm")
	public String sample2() {
		return "stadium/saveForm";
	}
}
