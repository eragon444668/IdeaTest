package cn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("/test")
public class FreemarkerController {
    public static final String USER_PERSON = "user_person";
    @RequestMapping("/test3")
    public ModelAndView testFreemarker(HttpServletRequest request, ModelAndView modelAndView){
        // 在访问受限页面时，要求用户必须登录




        Person p1 = new Person();
        p1.setName("eragon");
        p1.setAge(29);

        Person p2 = new Person();
        p2.setName("yang");
        p2.setAge(24);

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        modelAndView.addObject("nameList", list);
        modelAndView.setViewName("default/test1");
        return modelAndView;
    }
}
