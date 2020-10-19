package BluemForum.dao;

import java.util.Date;
import BluemForum.entity.User;
import BluemForum.BaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void testInsertUser() throws Exception{
        User user=new User();
        user.setEmail("tttt@tt.com");
        user.setNickname("tt");
        user.setPassword("123456");
        user.setUsername("ttl");
        user.setTel("ttt");
        user.setHomepage("/ttt");
        int tt=userDao.insertUser(user);
        assertEquals(1,tt);;
    }
    @Test
    public void testLoginUser()throws Exception{
        User user=new User();
        user.setUserId(1);
        System.out.println(userDao.loginUser(user));
    }
}