package com.nm.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class EventRepository {

    private final List<Event> events = List.of(
            new Event(401, "TeamBuilding",
                    new Organizer(101, "CT", "Comtrade"),
                    new Venue(201, "Hotel Kragujevac", "Lepenicki bulevar", "Kragujevac", "Serbia"),
                    LocalDate.of(2023, 10, 2), LocalDate.of(2023, 10, 4)),

            new Event(402, "Global Warning Conference",
                    new Organizer(102, "Endava", "leading next-generation technology services provider"),
                    new Venue(202, "Hotel Sumarice", "Kralja Aleksandra 1", "Kragujevac", "Serbia"),
                    LocalDate.of(2024, 1, 22), LocalDate.of(2024, 1, 23)),

            new Event(403, "New Year celebration",
                    new Organizer(103, "TransPerfect", "Full range of language and business services"),
                    new Venue(203, "Biblioteka kod Milutina", "Beogradska bb", "Kragujevac", "Serbia"),
                    LocalDate.of(2023, 12, 31), LocalDate.of(2024, 1, 1))
    );

    public List<Event> findAll() { return this.events; }

    public Event findById(int id) {
        return this.events.stream()
                .filter(event -> event.id() == id)
                .findFirst().get();
    }
    public List<Event> findByOrganizerId(int orgId) {
        return this.events.stream()
                .filter(event -> event.organizer().id() == orgId)
                .toList();
    }

}
