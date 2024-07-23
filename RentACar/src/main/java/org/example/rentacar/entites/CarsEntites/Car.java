package org.example.rentacar.entites.CarsEntites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
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
    private String plaka;

    private String brand;

    private String model;

    private String color;

    private String carAge;

    private int OneDayPrice;

    private int rentalDaysNumber;
}
