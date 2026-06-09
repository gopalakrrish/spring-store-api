package com.github.gopalakrrish.springstore.api.payments;

import com.github.gopalakrrish.springstore.api.orders.Order;

import java.util.Optional;

public interface PaymentGateway {
    CheckoutSession createCheckoutSession(Order order);

    Optional<PaymentResult> parseWebhookRequest(WebhookRequest request);
}
