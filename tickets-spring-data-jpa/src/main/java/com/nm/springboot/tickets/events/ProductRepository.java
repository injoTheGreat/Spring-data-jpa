package com.nm.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepository {

    List<Product> products = List.of(
            new Product(501, 401, "Regular", "Standard Conference Ticket", new BigDecimal("300.00")),
            new Product(502, 402, "Premium", "Premium Conference Ticket", new BigDecimal("500.00")),
            new Product(503, 403, "Business", "Gold Ticket", new BigDecimal("750.00")),
            new Product(504, 402, "VIP", "Superior Gold Ticket", new BigDecimal("999.00"))
    );

    public List<Product> findByEventId(int eventId) {
        return this.products.stream()
                .filter(product -> product.eventId() == eventId)
                .toList();
    }
}
