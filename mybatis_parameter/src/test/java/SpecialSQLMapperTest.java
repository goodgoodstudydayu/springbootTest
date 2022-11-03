import mapper.SelectMapper;
import mapper.SpecialSQLMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.SqlSessionUtil;

import java.util.List;
import java.util.Map;

public class SpecialSQLMapperTest {
    @Test
    public void testgetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> res = mapper.getUserByLike("r");
        res.forEach(System.out::println);

        sqlSession.close();
    }
}
