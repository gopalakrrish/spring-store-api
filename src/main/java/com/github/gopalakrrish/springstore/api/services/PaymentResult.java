package com.github.gopalakrrish.springstore.api.services;

import com.github.gopalakrrish.springstore.api.entities.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentResult {
    private Long orderId;
    private PaymentStatus paymentStatus;
}
