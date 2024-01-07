package org.gfg.JBDL64SpringBootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

    @GetMapping("/test")
    @ResponseBody
    public String getTest(@RequestParam("name") String name){
        return name;
    }

    @GetMapping("/test2")
//    @ResponseBody
    public String getTest2(){
        return "test2";
    }

    @GetMapping("/dynamic-content")
    public ModelAndView getData(){
        ModelAndView modelAndView = new ModelAndView("dynamicData.html");
        modelAndView.getModelMap().addAttribute("name", "john");
        return modelAndView;
    }


}
