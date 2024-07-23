package org.example.rentacar.entites.CustomersEntites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "individualCustomer")
public class IndividualCustomer {
    @Id
    private Long tc;

    private String name;

    private long phoneNumber;

    private boolean criminalRecord;

}
