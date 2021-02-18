package nikunj.madean.springapp.controller;

import nikunj.madean.springapp.data.Student;
import org.dom4j.rule.Mode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;

@Controller

@RequestMapping("student")

public class Studentcontroller {

    @Autowired
    Session session;

    @GetMapping("signup")
    public String signup(Model model){

     //   Student student = new Student();

        return "student";


    }

    @RequestMapping("save")
    public String name(HttpServletRequest httpServletRequest , Model model){

        String name = httpServletRequest.getParameter("nam");
        String age = httpServletRequest.getParameter("num");

        Student student = new Student(name , Integer.parseInt(age));
try{
    session.beginTransaction();
    session.save(student);
    session.getTransaction().commit();
    //System.out.println(student.getFirstname()+" "+student.getLastname());
    model.addAttribute("firstname",name);


}
catch (Exception e){
    e.printStackTrace();
}
        return "name";

    }


}
