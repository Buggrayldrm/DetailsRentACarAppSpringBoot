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
public class CorporateCustomer {
    @Id
    public Long companyId;

    public String companyName;

    public long companyNumber;
}

