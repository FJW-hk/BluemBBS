package BluemForum.dao;

import BluemForum.entity.User;

public interface UserDao {
    /**
     *新增用户
     * @param user
     * @return
     */
    int insertUser(User user);

    User loginUser(User user);

    int updateUser(User user);
}
