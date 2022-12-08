package com.yassine.livres.service;

import com.yassine.livres.entities.Role;
import com.yassine.livres.entities.User;

public interface UserService {
 User saveUser(User user);
 User findUserByUsername (String username);
 Role addRole(Role role);
 User addRoleToUser(String username, String rolename);
}