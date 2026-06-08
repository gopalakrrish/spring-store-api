package com.github.gopalakrrish.springstore.api.services;

import com.github.gopalakrrish.springstore.api.entities.Order;

import java.util.Optional;

public interface PaymentGateway {
    CheckoutSession createCheckoutSession(Order order);

    Optional<PaymentResult> parseWebhookRequest(WebhookRequest request);
}
