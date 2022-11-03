package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

public interface SpecialSQLMapper {
    List<User> getUserByLike(@Param("mohu") String mohu);
}
