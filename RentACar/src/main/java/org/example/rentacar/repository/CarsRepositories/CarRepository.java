package org.example.rentacar.repository.CarsRepositories;

import org.example.rentacar.entites.CarsEntites.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,String> {
}
