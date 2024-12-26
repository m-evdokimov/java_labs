package ru.evdokimov.test_security2db_themeleaf.service;

import java.util.List;

import ru.evdokimov.test_security2db_themeleaf.dto.UserDto;
import ru.evdokimov.test_security2db_themeleaf.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}