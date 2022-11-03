import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.Map;

public class testMapper {
    @Test
    public void testgetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User res = mapper.getUserByUsername("admin");
        System.out.println(res);
        sqlSession.close();
    }
    @Test
    public void testcheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User res = mapper.checkLogin("admin","12345");
        System.out.println(res);
        sqlSession.close();
    }

    @Test
    public void testcheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("username","admin");
        map.put("password","12345");
        User res = mapper.checkLoginByMap(map);
        System.out.println(res);
        sqlSession.close();
    }

    @Test
    public void testinsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("username","admin");
        map.put("password","12345");
        User res = new User(null,"root1","123456",33,"女","123@qq.com");
        mapper.insertUser(res);
        sqlSession.close();
    }

    @Test
    public void testcheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root1 = mapper.checkLoginByParam("root1", "123456");
        System.out.println(root1);
        sqlSession.close();
    }
}
