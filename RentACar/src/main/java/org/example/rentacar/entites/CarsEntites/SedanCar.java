package org.example.rentacar.entites.CarsEntites;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "sedanCar")
public class SedanCar extends Car {
  private int numberOfDoors;



}
