package io.maddennis.grpcscuffhold.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime ordertimestamp;
}
