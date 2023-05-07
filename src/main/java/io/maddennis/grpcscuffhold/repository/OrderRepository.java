package io.maddennis.grpcscuffhold.repository;

import io.maddennis.grpcscuffhold.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
