package com.bronx92.ecommerce.checkoutg.service;

import com.bronx92.ecommerce.checkoutg.entity.Checkout;
import com.bronx92.ecommerce.checkoutg.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<Checkout> create(CheckoutRequest checkoutRequest);
}
