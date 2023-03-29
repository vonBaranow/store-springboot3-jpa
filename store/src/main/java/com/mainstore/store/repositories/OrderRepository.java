package com.mainstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mainstore.store.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
