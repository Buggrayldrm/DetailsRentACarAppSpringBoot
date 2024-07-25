package org.example.rentacar.services.abstracts.CarServices;

import org.example.rentacar.entites.CarsEntites.Car;
import org.example.rentacar.entites.CarsEntites.SedanCar;
import org.example.rentacar.entites.CarsEntites.SuvCar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SedanService {
    List<SedanCar> getAllSedanCars();
    SedanCar getByIdSedanCar(Long id);
    void deleteByIdSedanCar(Long id);

    SedanCar createSedanCar(SedanCar newCar);
    SedanCar updateSedanCar(Long id, SedanCar newCar);

    void rentSedan(Long id, SedanCar sedanCar) throws Exception;
}
