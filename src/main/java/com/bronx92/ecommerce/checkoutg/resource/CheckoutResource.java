package com.bronx92.ecommerce.checkoutg.resource;

import com.bronx92.ecommerce.checkout.event.CheckoutCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bronx92.ecommerce.checkoutg.stream.CheckoutCreated;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutCreated checkoutCreated;

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {
        /*
        final CheckoutCreatedEvent checkoutCreatedEvent = CheckoutCreatedEvent.newBuilder()
                .setCheckoutCode("123")
                .build();
        checkoutCreated.output().send(MessageBuilder.withPayload(checkoutCreatedEvent).build());
        */
        return ResponseEntity.ok().build();
}

}
