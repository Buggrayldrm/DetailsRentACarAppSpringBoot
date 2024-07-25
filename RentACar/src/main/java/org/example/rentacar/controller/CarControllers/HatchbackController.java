package org.example.rentacar.controller.CarControllers;


import org.example.rentacar.entites.CarsEntites.HatchbackCar;
import org.example.rentacar.services.concretes.CarsBusiness.HatchbackBusiness;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hatchbackApi")
public class HatchbackController {
    private HatchbackBusiness hatchbackBusiness;
    @GetMapping("/getAllHatcbackCars")
    public List<HatchbackCar> getAllHatcbackCars(){
        return hatchbackBusiness.getAllHatcbackCars();
    }

    @GetMapping("7getByIdHatcbackCar")
    public HatchbackCar getByIdHatcbackCar(Long id){
        return hatchbackBusiness.getByIdHatcbackCar(id);
    }

    @DeleteMapping("/deleteByIdHatchbackCar")
    public void deleteByIdHatcbackCar(Long id){

         hatchbackBusiness.deleteByIdHatcbackCar(id);
    }

    @PostMapping("/createHatcbackCar")
    public HatchbackCar createHatcbackCar(HatchbackCar newCar){
        return hatchbackBusiness.createHatcbackCar(newCar);
    }

    @PutMapping("/updateHatchbackCar")
    public HatchbackCar updateHatcbackCar(Long id, HatchbackCar newCar){
        return hatchbackBusiness.updateHatcbackCar(id,newCar);
    }
    @GetMapping("/rentHatchback")
    public void rentHatcback(Long id, HatchbackCar hatchbackCar) throws Exception{
        hatchbackBusiness.rentHatcback(id, hatchbackCar);
    }

}
