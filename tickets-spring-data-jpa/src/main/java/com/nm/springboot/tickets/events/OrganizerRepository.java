package com.nm.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {

    private final List<Organizer> organizers = List.of(
            new Organizer(101, "CT", "Seljacka drzavna firma"),
            new Organizer(102, "Endava", "leading next-generation technology services provider"),
            new Organizer(103, "TransPerfect", "Full range of language and business services")
    );

    public List<Organizer> findAll() {
        return this.organizers;
    }
}
