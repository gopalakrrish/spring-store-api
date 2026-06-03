package com.github.gopalakrrish.springstore.api.services;

import com.github.gopalakrrish.springstore.api.entities.Order;

public interface PaymentGateway {
    CheckoutSession createCheckoutSession(Order order);
}
