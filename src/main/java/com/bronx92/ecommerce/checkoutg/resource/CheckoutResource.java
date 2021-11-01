package com.bronx92.ecommerce.checkoutg.resource;

import com.bronx92.ecommerce.checkoutg.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor // poderia ser substituído pelo comando abaixo, mesma finalidade
//@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<Void> create(@RequestBody CheckoutRequest checkoutRequest) {
        checkoutService.create(checkoutRequest);
        return ResponseEntity.ok().build();
    }

}
