package kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//��Ʈ�ѷ� Ŭ������ �Ǿ���.
@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello Spring!!");
		mav.setViewName("hello");

		return mav;
	}

}
