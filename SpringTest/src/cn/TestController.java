package cn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/test")
    public String SayHello() {
        return "hello";
    }
}
