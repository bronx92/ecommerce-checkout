package com.bronx92.ecommerce.checkoutg.service;

import com.bronx92.ecommerce.checkoutg.entity.Checkout;
import com.bronx92.ecommerce.checkoutg.repository.CheckoutRepository;
import com.bronx92.ecommerce.checkoutg.resource.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor // poderia ser substituído pelo comando abaixo, mesma finalidade
//@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<Checkout> create(CheckoutRequest checkoutRequest) {
        final Checkout checkout = Checkout.builder()
                .code(UUID.randomUUID().toString())
                .build();
        return Optional.of(checkoutRepository.save(checkout));
    }
}
