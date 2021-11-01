package com.bronx92.ecommerce.checkoutg.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Entity
@Data
public class Checkout {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;
}
