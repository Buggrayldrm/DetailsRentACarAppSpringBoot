package org.example.rentacar.services.abstracts;

import org.example.rentacar.dto.RentalRequestDto;
import org.example.rentacar.entites.CarsEntites.Car;
import org.example.rentacar.entites.CarsEntites.SuvCar;

import java.util.List;


public interface SuvService {

    List<SuvCar> getAllCars();
    SuvCar GetByIdCar(String plaka);
    void deleteByIdCar(String plaka);

    SuvCar createSuvCar(SuvCar newCar);
    SuvCar updateSuvCar(String plaka,Car newCar);


    void rentSuv(String plaka, SuvCar suvCar) throws Exception;
}
