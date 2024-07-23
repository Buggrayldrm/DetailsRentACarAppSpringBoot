package org.example.rentacar.entites.CarsEntites;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.rentacar.entites.CarsEntites.Car;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SuvCar extends Car {
    private boolean fourWheelDrive;
}
