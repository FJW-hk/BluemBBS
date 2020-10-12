package BluemForum.dao;

import BluemForum.entity.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends TestCase {
    @Autowired
    private UserDao userDao;
    @Test
    public void testInsertUser() {
        User user=new User();
        user.setEmail("tttt@tt.com");
        user.setNickname("tt");
        user.setPassword("123456");
        user.setUsername("ttl");
        user.setPhoneNumber("ttt");
        int tt=userDao.insertUser(user);
        assertEquals(1,tt);;
    }
}