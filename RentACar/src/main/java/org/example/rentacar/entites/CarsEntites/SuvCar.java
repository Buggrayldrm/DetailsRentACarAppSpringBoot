package org.example.rentacar.entites.CarsEntites;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.rentacar.entites.CarsEntites.Car;
import org.example.rentacar.entites.CustomersEntites.IndividualCustomer;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "suvCar")
public class SuvCar extends Car {
    private boolean fourWheelDrive;


}
