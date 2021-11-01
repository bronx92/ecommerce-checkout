package com.bronx92.ecommerce.checkoutg.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Entity
@Data
public class Checkout {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

    public enum Status {
        CREATED,
        APPROVED
    }
}
