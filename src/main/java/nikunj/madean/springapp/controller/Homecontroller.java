package nikunj.madean.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("start")
public class Homecontroller {

    @GetMapping("hello")
    public String hello(){
        return "render";
    }

    @GetMapping("showform")
    public String showform(){

        return "render";

    }

    @GetMapping("processform")
    public String process(HttpServletRequest servletRequest , Model model){

         String name = servletRequest.getParameter("person");

         model.addAttribute("nam",name);
        return "name";
    }


}
