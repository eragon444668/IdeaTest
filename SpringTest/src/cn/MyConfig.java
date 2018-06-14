package cn;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("myConfig")
public class MyConfig {
    MyConfig(){
        System.out.println("这是MyConfig的构造函数");
    }
    @PostConstruct
    public void setMyConfig(){
        System.out.println("开始设置自定义配置");
        System.out.println("自定义配置设置结束");
    }
}
