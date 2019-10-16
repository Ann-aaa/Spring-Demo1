package com.niit.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
  @RequestMapping("/show")
  public String show(@RequestParam("id")int id,Map<String,String> datas) {
	  datas.put("msg","This is user"+id);
	  return "/user/show"; 
  }
}
