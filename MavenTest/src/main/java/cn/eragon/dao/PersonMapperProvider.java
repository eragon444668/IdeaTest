package cn.eragon.dao;


import cn.eragon.domain.Person;

public class PersonMapperProvider {

    public String findById(int id){
        return "select * from person where id = "+id;
    }

    public String deleteById(int id){
        return "delete from person where id = "+id;
    }

}
