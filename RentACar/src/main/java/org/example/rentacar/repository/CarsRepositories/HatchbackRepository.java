package org.example.rentacar.repository.CarsRepositories;

import org.example.rentacar.entites.CarsEntites.HatchbackCar;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HatchbackRepository extends JpaRepository<HatchbackCar,Long> {
}
