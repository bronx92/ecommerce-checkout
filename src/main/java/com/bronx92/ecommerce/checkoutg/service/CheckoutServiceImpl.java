package com.bronx92.ecommerce.checkoutg.service;

import com.bronx92.ecommerce.checkoutg.entity.Checkout;
import com.bronx92.ecommerce.checkoutg.event.CheckoutCreatedEvent;
import com.bronx92.ecommerce.checkoutg.repository.CheckoutRepository;
import com.bronx92.ecommerce.checkoutg.resource.CheckoutRequest;
import com.bronx92.ecommerce.checkoutg.stream.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor // poderia ser substituído pelo comando abaixo, mesma finalidade
//@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedSource checkoutCreatedSource;

    @Override
    public Optional<Checkout> create(CheckoutRequest checkoutRequest) {
        final Checkout checkout = Checkout.builder()
                .code(UUID.randomUUID().toString())
                .status(Checkout.Status.CREATED)
                .build();
        final Checkout entity = checkoutRepository.save(checkout);

        final CheckoutCreatedEvent createdEvent = CheckoutCreatedEvent.newBuilder()
                .setCheckoutCode(entity.getCode())
                .setStatus(entity.getStatus().name())
                .build();

        checkoutCreatedSource.output().send(MessageBuilder.withPayload(createdEvent).build());
        return Optional.of(entity);
    }
}
