package org.example.rentacar.repository.CarsRepositories;

import org.example.rentacar.entites.CarsEntites.SuvCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuvRepository extends JpaRepository<SuvCar,Long> {
}
