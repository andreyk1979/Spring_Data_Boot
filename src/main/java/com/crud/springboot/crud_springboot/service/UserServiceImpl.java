package com.crud.springboot.crud_springboot.service;

import com.crud.springboot.crud_springboot.models.User;
import com.crud.springboot.crud_springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import web.models.User;
//import web.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
//@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> showAllUsersList() {
        //TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        // return query.getResultList();

        return userRepository.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void update(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(long id) {
        //entityManager.remove(entityManager.find(User.class, id));
        userRepository.deleteById(id);
    }
}
