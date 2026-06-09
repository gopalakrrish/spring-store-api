package com.github.gopalakrrish.springstore.api.payments;

import com.github.gopalakrrish.springstore.api.orders.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentResult {
    private Long orderId;
    private PaymentStatus paymentStatus;
}
