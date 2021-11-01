package com.bronx92.ecommerce.checkoutg.resource;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CheckoutResponse implements Serializable {
    private String code;
}
