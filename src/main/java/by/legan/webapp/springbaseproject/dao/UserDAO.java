package by.legan.webapp.springbaseproject.dao;

import by.legan.webapp.springbaseproject.entity.User;

import java.util.List;

public interface UserDAO {

    void save(User user);

    User getById(int id);

    void update(User user);

    List<User> findAll();

    void delete(int id);

}
