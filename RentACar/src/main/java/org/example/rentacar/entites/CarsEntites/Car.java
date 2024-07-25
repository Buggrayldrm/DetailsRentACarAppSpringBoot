package org.example.rentacar.entites.CarsEntites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public  class Car {
    @Id
    private Long id;

    private String brand;

    private String model;

    private String color;

    private String carAge;

    private int OneDayPrice;

    private int rentalDaysNumber;

    private boolean isCompany;
}
