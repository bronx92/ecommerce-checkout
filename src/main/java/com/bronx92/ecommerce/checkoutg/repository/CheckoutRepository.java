package com.bronx92.ecommerce.checkoutg.repository;

import com.bronx92.ecommerce.checkoutg.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
    Optional<Checkout> findByCode(String code);
}
