package com.mainstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mainstore.store.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
