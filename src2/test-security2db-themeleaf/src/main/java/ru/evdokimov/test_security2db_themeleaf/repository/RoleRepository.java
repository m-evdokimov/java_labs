package ru.evdokimov.test_security2db_themeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.evdokimov.test_security2db_themeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}