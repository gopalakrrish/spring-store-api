package com.github.gopalakrrish.springstore.api.services;

import com.github.gopalakrrish.springstore.api.entities.User;
import com.github.gopalakrrish.springstore.api.repositories.UserRepository;
import io.jsonwebtoken.impl.security.EdwardsCurve;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AuthService {
    private final UserRepository userRepository;

    public User getCurrentUser() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        var userId = (Long) authentication.getPrincipal();

        return userRepository.findById(userId).orElse(null);

    }

}
