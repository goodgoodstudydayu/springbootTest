package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.Map;

public interface UserMapper {

    User getUserByUsername(String username);

    User checkLogin(String username,String password);

    User checkLoginByMap(Map<String,Object> map);

    void insertUser(User user);

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
}
