import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.SqlSessionUtil;

import java.util.List;

public class testMapper {
    @Test
    public void testgetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User res = mapper.getUserByUsername("admin");
        System.out.println(res);
        sqlSession.close();
    }
}
