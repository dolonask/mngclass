package kg.infoservice.mngclass.service;

import kg.infoservice.mngclass.model.User;

public interface UserService {

    User findUserByEmail(String email);

    void saveUser(User user);
}
