package kosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosa.service.HelloService;

//컨트롤러 클래스가 되었다.
@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

	// @RequestMapping("/hello.do")
	@GetMapping({ "/", "/hello" })
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", helloService.getMessage());
		mav.setViewName("hello");

		return mav;
	}

}
