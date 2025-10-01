package com.ankit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ankit.entity.OrderEvent;

public interface OrderEventRepository extends MongoRepository<OrderEvent,String> {
}
