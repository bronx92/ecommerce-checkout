package com.bronx92.ecommerce.checkoutg.listener;

import com.bronx92.ecommerce.checkoutg.entity.Checkout;
import com.bronx92.ecommerce.checkoutg.repository.CheckoutRepository;
import com.bronx92.ecommerce.checkoutg.service.CheckoutService;
import com.bronx92.ecommerce.checkoutg.stream.PaymentPaidSink;
import com.bronx92.ecommerce.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutRepository checkoutRepository;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent event) {
        final Checkout checkout = checkoutRepository.findByCode(event.getCheckoutCode().toString()).orElseThrow();
        checkout.setStatus(Checkout.Status.APPROVED);
        checkoutRepository.save(checkout);
    }
}
