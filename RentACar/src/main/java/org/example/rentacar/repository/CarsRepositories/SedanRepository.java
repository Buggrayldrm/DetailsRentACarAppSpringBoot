package org.example.rentacar.repository.CarsRepositories;

import org.example.rentacar.entites.CarsEntites.SedanCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SedanRepository extends JpaRepository<SedanCar,String> {
}
