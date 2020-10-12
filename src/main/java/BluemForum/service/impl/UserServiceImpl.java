package BluemForum.service.impl;

import BluemForum.dao.UserDao;
import BluemForum.entity.User;
import BluemForum.service.UserService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    private static Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public int InsertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public User LoginUser(User user) {
        return userDao.loginUser(user);
    }
}
