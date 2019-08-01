package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class mvcController {

    @RequestMapping("/index")
    public ModelAndView hello() throws  Exception{
        System.out.println("wwwwwwwws");
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("message","Hello Spring");
        return mav;
    }

}
