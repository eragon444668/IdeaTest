package cn.eragon.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class PersonService {
    public PersonService() {
        System.out.println("PersonService is init");
    }
}
