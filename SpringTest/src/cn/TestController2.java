package cn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController2 {
    @RequestMapping("test2")
    public String test(){
        return "hello";
    }
}
