package com.nm.springboot.tickets.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Registration {
    @Id
    @GeneratedValue
    private Long id;
    private @NotNull(message = "Product id is required") Integer productId;
    private String ticketCode;
    private @NotBlank(message = "Attendee name is required") String attendeeName;

        public Registration() {}

        public Registration(Long id, Integer productId, String ticketCode, String attendeeName) {
                this.id = id;
                this.productId = productId;
                this.ticketCode = ticketCode;
                this.attendeeName = attendeeName;
        }

}



