package mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    List<Map<String,Object>> getAllUserToMap();

    //若查询的数据有多条时，并且将每条数据转为map集合，通过mapkey将查询的某个字段的值作为大map的key
    @MapKey("id")
    Map<String,Object> getAllUserTodaMap();
}
