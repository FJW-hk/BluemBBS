package BluemForum.service;

import BluemForum.entity.User;

public interface UserService {
    public int InsertUser(User user);

    public User LoginUser(User user);
}
