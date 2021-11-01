package com.bronx92.ecommerce.checkoutg.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface PaymentPaidSink {
    String INPUT = "payment-paid-input";

    @Input(INPUT)
    SubscribableChannel input();
}
