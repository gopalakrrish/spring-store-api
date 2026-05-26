package com.github.gopalakrrish.springstore.api.services;

import com.github.gopalakrrish.springstore.api.dtos.CheckoutRequest;
import com.github.gopalakrrish.springstore.api.dtos.CheckoutResponse;
import com.github.gopalakrrish.springstore.api.dtos.ErrorDto;
import com.github.gopalakrrish.springstore.api.entities.Order;
import com.github.gopalakrrish.springstore.api.exceptions.CartEmptyException;
import com.github.gopalakrrish.springstore.api.exceptions.CartNotFoundException;
import com.github.gopalakrrish.springstore.api.repositories.CartRepository;
import com.github.gopalakrrish.springstore.api.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CheckoutService {
    private final CartRepository cartRepository;
    private final OrderRepository orderRepository;
    private final AuthService authService;
    private final CartService cartService;

    public CheckoutResponse checkout(CheckoutRequest request) {
        var cart = cartRepository.getCartWithItems(request.getCartId()).orElse(null);
        if (cart == null) {
            throw new CartNotFoundException();
        }

        if (cart.isEmpty()) {
            throw new CartEmptyException();
        }

        var order = Order.fromCart(cart, authService.getCurrentUser());

        orderRepository.save(order);

        cartService.clearCart(cart.getId());

        return new CheckoutResponse(order.getId());
    }
}
