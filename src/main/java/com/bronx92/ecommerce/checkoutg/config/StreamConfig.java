package com.bronx92.ecommerce.checkoutg.config;

import com.bronx92.ecommerce.checkoutg.stream.CheckoutCreatedSource;
import com.bronx92.ecommerce.checkoutg.stream.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamConfig {
}
