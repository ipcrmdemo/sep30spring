package com.sep30spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class Sep30springController {

    @GetMapping("/hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
