package com.srini.springhello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHelloWorldController {

    @RequestMapping("/")
    public String springHelloWorld() {
        return "Hello from Spring Boot";
    }

    @RequestMapping("/greetings")
    public String sayHello(@RequestParam(name="username") String uName) {
        return "Hello " + uName;
    }

}
