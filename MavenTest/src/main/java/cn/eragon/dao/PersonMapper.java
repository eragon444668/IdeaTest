package cn.eragon.dao;

import cn.eragon.domain.Person;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
    String ALL_COLUMN = "ID,NAME";

    @Select("SELECT "+ALL_COLUMN+" FROM PERSON WHERE ID = #{ID}")
    Person findById(int id);

    @DeleteProvider(method = "deleteById", type = PersonMapperProvider.class)
    void deleteById(int id);
}
