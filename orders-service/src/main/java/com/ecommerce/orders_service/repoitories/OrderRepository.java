package com.ecommerce.orders_service.repoitories;

import com.ecommerce.orders_service.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
