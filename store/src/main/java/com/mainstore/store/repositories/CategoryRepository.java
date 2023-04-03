package com.mainstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mainstore.store.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
