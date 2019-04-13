package kg.infoservice.mngclass.service.impl;

import kg.infoservice.mngclass.model.Role;
import kg.infoservice.mngclass.model.User;
import kg.infoservice.mngclass.repository.RoleRepository;
import kg.infoservice.mngclass.repository.UserRepository;
import kg.infoservice.mngclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role role = roleRepository.findRoleByName("ADMIN");
        user.setRole(role);
        userRepository.save(user);
    }
}
