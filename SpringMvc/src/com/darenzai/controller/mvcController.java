package com.darenzai.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class mvcController {

    @RequestMapping("/index")
    public ModelAndView hello() throws  Exception{

        ModelAndView mav=new ModelAndView("index");
        mav.addObject("message","Hello Spring");
        return mav;
    }
    @RequestMapping("/ss")
    public void ss(){
        System.out.println("sss");

    }


}
