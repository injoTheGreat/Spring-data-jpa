package com.nm.springboot.tickets.events;

public record Venue(
        int id,
        String name,
        String street,
        String city,
        String country) {
}
