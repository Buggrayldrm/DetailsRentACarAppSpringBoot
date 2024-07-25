package org.example.rentacar.services.abstracts.CarServices;

import org.example.rentacar.entites.CarsEntites.HatchbackCar;
import org.example.rentacar.entites.CarsEntites.SedanCar;

import java.util.List;

public interface HatchbackService {
    List<HatchbackCar> getAllHatcbackCars();
    HatchbackCar getByIdHatcbackCar(Long id);
    void deleteByIdHatcbackCar(Long id);

    HatchbackCar createHatcbackCar(HatchbackCar newCar);
    HatchbackCar updateHatcbackCar(Long id, HatchbackCar newCar);

    void rentHatcback(Long id, HatchbackCar hatchbackCar) throws Exception;
}
