package com.salwafadillah.TugasAkhirSinauKoding.repository;

import com.salwafadillah.TugasAkhirSinauKoding.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
