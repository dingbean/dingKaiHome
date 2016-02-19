package com.work.controller;

import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import redis.clients.jedis.Jedis;



@Controller
@RequestMapping(value="/page")
public class PageController {
	
	private static final Logger log = Logger.getLogger(PageController.class);
	

	@RequestMapping(value="/pageTest")
	public ModelAndView pageTest(String routeStr,HttpServletRequest request,HttpServletResponse reponse) throws ParseException{
		log.info("------ pageTest coming ------");
		Jedis jedis = new  Jedis("localhost"); 
		 jedis.auth("root123");  
      log.info("Server is running: "+jedis.ping());
      log.info("redis key: "+jedis.get("key"));
			ModelAndView mv = new ModelAndView("/jsp/test/page");
//			mv.addObject("result", userName);
			return mv;
	}
	
}
