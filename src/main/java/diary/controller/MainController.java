package diary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){return "Hello";}

    @GetMapping
    public String helloTemplate(){return "index.html";}
}
