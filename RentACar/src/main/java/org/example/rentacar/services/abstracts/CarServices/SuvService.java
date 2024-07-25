package org.example.rentacar.services.abstracts.CarServices;


import org.example.rentacar.entites.CarsEntites.Car;
import org.example.rentacar.entites.CarsEntites.SuvCar;

import java.util.List;


public interface SuvService {

    List<SuvCar> getAllSuvCars();
    SuvCar GetByIdSuvCar(Long id);
    void deleteByIdSuvCar(Long id);

    SuvCar createSuvCar(SuvCar newCar);
    SuvCar updateSuvCar(Long id,SuvCar newCar);


    void rentSuv(Long id, SuvCar suvCar) throws Exception;
}
