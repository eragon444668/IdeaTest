package cn.eragon.controller;

import cn.eragon.dao.PersonMapper;
import cn.eragon.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class PersonController {


    public PersonController() {
        System.out.println("PersonController is init");
    }

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("get")
    public String getById(@RequestParam(required = false,defaultValue = "1") int id) {
        return personMapper.findById(id).getName();
    }
}
