package com.nm.springboot.tickets.events;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class EventController {

    private final OrganizerRepository organizerRepository;
    private final EventRepository eventRepository;
    private final ProductRepository productRepository;

    public EventController(OrganizerRepository organizerRepository, EventRepository eventRepository, ProductRepository productRepository) {
        this.organizerRepository = organizerRepository;
        this.eventRepository = eventRepository;
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/organizers")
    public List<Organizer> getOrganizers() {
       return this.organizerRepository.findAll();
    }

    @GetMapping(path = "/events")
    public List<Event> getOrganizerEvents(@RequestParam("orgId") int orgId) {
        return this.eventRepository.findByOrganizerId(orgId);
    }

    @GetMapping(path = "/events/{id}")
    public Event getEventById(@PathVariable("id") int eventId) {
        var event = this.eventRepository.findById(eventId);
        if (event == null) throw new NoSuchElementException("Event with id " + eventId + " not found");

        return event;
    }

    @GetMapping(path = "/products")
    public List<Product> getProductsByEvent(@RequestParam("eventId") int eventId) {
        return this.productRepository.findByEventId(eventId);
    }
}
