package com.demobuild.demojenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String sayHelloWorld(){
        return "Hello World";

    }
}
