package com.bronx92.ecommerce.checkoutg.service;

import com.bronx92.ecommerce.checkoutg.entity.Checkout;
import com.bronx92.ecommerce.checkoutg.resource.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Override
    public Optional<Checkout> create(CheckoutRequest checkoutRequest) {
        return Optional.empty();
    }
}
