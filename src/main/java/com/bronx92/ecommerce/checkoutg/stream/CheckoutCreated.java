package com.bronx92.ecommerce.checkoutg.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CheckoutCreated {
    String OUTPUT = "checkout-created-output";

    @Output(OUTPUT)
    MessageChannel output();
}
