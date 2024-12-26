package ru.evdokimov.test_security2db_themeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.evdokimov.test_security2db_themeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}