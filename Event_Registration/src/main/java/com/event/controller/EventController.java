package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.event.model.RegisterVO;
import com.event.service.Regservice;

@Controller
public class EventController {
	
    @Autowired
    private Regservice regservice;
    
    
	@RequestMapping("/")
	public ModelAndView home()
	{
		return new ModelAndView("home","key",new RegisterVO());
	}
	
}
