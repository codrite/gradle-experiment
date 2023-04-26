package com.learn.gradleexperiments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public @ResponseBody String hello() {
        return "{\"message\" : \"hello\"}";
    }

}
