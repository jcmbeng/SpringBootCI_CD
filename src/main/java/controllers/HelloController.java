package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome/{name}")
    public String index(@PathVariable String name) {
        return "Hello "  +  name    ;
    }
}
