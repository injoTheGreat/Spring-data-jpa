package com.nm.springboot.tickets.registration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long>{

    Registration findByTicketCode(String ticketCode);
    void deleteByTicketCode(String ticketCode);

//    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();
//
//    private final Map<String, Registration> registrationsByTicketCode = new ConcurrentHashMap<>();
//
//    public Registration create(@NotNull Registration registration) {
//        int id = ID_GENERATOR.incrementAndGet();
//        String ticket = UUID.randomUUID().toString();
//
//        Registration saved = new Registration(id, registration.productId(), ticket, registration.attendeeName());
//        this.registrationsByTicketCode.put(ticket, saved);
//
//        return saved;
//    }
//
//    public Registration findByTicketCode(String ticketCode) {
//        return registrationsByTicketCode.get(ticketCode);
//    }
//
//    public Map<String, Registration> getMap() {
//        return this.registrationsByTicketCode;
//    }
//
//    // update registration map with provided registration attendee name
//    public Registration update(@NotNull(message = "Registration properties are required") Registration registration) {
//        String ticketCode = registration.ticketCode();
//
//        var existingRegistry = findByTicketCode(ticketCode);
//        if (existingRegistry != null) {
//
//            var saved = new Registration(existingRegistry.id(), existingRegistry.productId(),
//                    existingRegistry.ticketCode(), registration.attendeeName());
//            registrationsByTicketCode.put(ticketCode, saved);
//
//            return saved;
//        } else {
//            throw new NoSuchElementException("Registration with ticket code " + ticketCode + " not found");
//        }
//    }
//
//    public void deleteByTicketCode(String ticketCode) {
//        if (findByTicketCode(ticketCode) != null) registrationsByTicketCode.remove(ticketCode);
//    }
}
