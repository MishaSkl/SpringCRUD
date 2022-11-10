package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getUserList();

    public User getUser(int id);

    public void save(User user);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
