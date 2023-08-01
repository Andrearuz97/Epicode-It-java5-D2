package andrearuzittu.EpicodeItjava5D2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
	@GetMapping("/index")
	public String index() {
		return "pagina principale";
	}

	@GetMapping("/user")
	public String index2() {
		return "pagina user";

	}

	@PutMapping("/index")
	public String indexPut() {
		return "hello i'm a put!";
	}

	@PostMapping("/index")
	public String indexPost() {
		return "ciao sono una post!";
	}

	@DeleteMapping("/index")
	public String indexDelete() {
		return "ciao sono una delete!!!!!";
	}

	@GetMapping("/queryParamsExample")
	public String queryParams(@RequestParam String name, @RequestParam String surname) {
		return "hello " + name + " " + surname;
	}

}
