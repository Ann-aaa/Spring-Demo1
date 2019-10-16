package org.niit.controller;

import org.niit.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	@Autowired
	InfoService infoProxy;
	
	@ResponseBody
	@RequestMapping("/index")
	public String index() {
		infoProxy.showMsg();
		return "SUCCESS";
	}
}
