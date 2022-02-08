package com.crud.springboot.crud_springboot.service;

import com.crud.springboot.crud_springboot.models.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {
    public List<User> showAllUsersList();

    public User getById(long id);

    public void save(@Valid User user);

    public void update(User user);

    public void delete(long id);
}
