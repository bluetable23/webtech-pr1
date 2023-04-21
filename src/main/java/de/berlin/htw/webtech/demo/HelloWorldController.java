package de.berlin.htw.webtech.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HelloWorldController{


    @GetMapping("/")
    public ModelAndView show(){
        return new ModelAndView("helloworld");
    }}
