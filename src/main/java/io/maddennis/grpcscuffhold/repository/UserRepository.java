package io.maddennis.grpcscuffhold.repository;

import io.maddennis.grpcscuffhold.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
