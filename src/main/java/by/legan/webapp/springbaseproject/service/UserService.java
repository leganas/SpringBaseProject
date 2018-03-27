package by.legan.webapp.springbaseproject.service;

import by.legan.webapp.springbaseproject.entity.User;

import java.util.List;

public interface UserService {

    List<User> findall();

    void save(User user);

    User getById(int id);

    void update(User user);

    void delete(int id);

}
