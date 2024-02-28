package com.nm.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VenueRepository {

    private final List<Venue> venues = List.of(
            new Venue(201, "Hotel Kragujevac", "Lepenicki bulevar", "Kragujevac", "Serbia"),
            new Venue(202, "Hotel Sumarice", "Kralja Aleksandra 1", "Kragujevac", "Serbia"),
            new Venue(203, "Biblioteka kod Milutina", "Beogradska bb", "Kragujevac", "Serbia")
    );

    public Venue findById(int index) {
        return this.venues.stream()
                .filter(venue -> venue.id() == index)
                .findAny()
                .get();
    }
}
