package org.example.rentacar.controller.CarControllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.rentacar.entites.CarsEntites.SuvCar;
import org.example.rentacar.services.concretes.CarsBusiness.SuvBusiness;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping(value = "/suvApi")
public class SuvController {
    private SuvBusiness suvBusiness;

    @GetMapping(value = "/getAllSuvCar")
    public List<SuvCar> getAllSuvCars(){
        return suvBusiness.getAllSuvCars();
    }
    @GetMapping(value = "/getByIdSuv")
    public SuvCar GetByIdSuvCar(Long id){
        return suvBusiness.GetByIdSuvCar(id);
    }
    @DeleteMapping(value = "/deleteByIdSuv")
    public void deleteByIdSuvCar(Long id){
         suvBusiness.deleteByIdSuvCar(id);
    }

    @PostMapping(value = "/createSuvCar")
    public SuvCar createSuvCar(SuvCar newCar){
        return  suvBusiness.createSuvCar(newCar);
    }

    @PutMapping(value = "/updateSuvCar")
    public SuvCar updateSuvCar(Long id, SuvCar newCar){
        return suvBusiness.updateSuvCar(id,newCar);
    }
    @GetMapping("/rentSuvCar")
    public void rentSuv(Long id, SuvCar suvCar) throws Exception {
        suvBusiness.rentSuv(id,suvCar);
    }



}
