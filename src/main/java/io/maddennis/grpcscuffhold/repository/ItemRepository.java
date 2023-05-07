package io.maddennis.grpcscuffhold.repository;

import io.maddennis.grpcscuffhold.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
