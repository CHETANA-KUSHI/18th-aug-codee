package com.ola.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ola.entity.OrderEntity;

@Repository
public interface OrderRepo extends  JpaRepository<OrderEntity, Integer>{

}
