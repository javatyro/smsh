package org.study.smsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/test")
	public String test() {
		return "index"; // 返回视图名称 web-inf/jsp/index.jsp
	}
}
