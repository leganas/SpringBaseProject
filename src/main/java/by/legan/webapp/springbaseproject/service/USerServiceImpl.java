package by.legan.webapp.springbaseproject.service;

import by.legan.webapp.springbaseproject.dao.UserDAO;
import by.legan.webapp.springbaseproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class USerServiceImpl implements UserService {

    @Autowired
    public UserDAO userDAO;

    public List<User> findall() {
        return userDAO.findAll();
    }

    public void save(User user) {
        userDAO.save(user);
    }

    public User getById(int id) {
        return userDAO.getById(id);
    }

    public void update(User user) {
        userDAO.update(user);
    }

    public void delete(int id) {
        userDAO.delete(id);
    }
}
