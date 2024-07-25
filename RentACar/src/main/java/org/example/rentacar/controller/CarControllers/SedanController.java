package org.example.rentacar.controller.CarControllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.rentacar.entites.CarsEntites.SedanCar;
import org.example.rentacar.services.concretes.CarsBusiness.SedanBusiness;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/sedanApi")
public class SedanController {

    private SedanBusiness sedanBusiness;
    @GetMapping("/getAllSedanCars")
    public List<SedanCar> getAllSedanCars(){
        return sedanBusiness.getAllSedanCars();
    }
    @GetMapping("/getByIdSedanCar")
    public SedanCar getByIdSedanCar(Long id){
        return sedanBusiness.getByIdSedanCar(id);
    }

    @DeleteMapping("/deleteByIdSedanCar")
    public void deleteByIdSedanCar(Long id){
        sedanBusiness.deleteByIdSedanCar(id);
    }
    @PostMapping("/createSedanCar")
    public SedanCar createSedanCar(SedanCar newCar){
        return  sedanBusiness.createSedanCar(newCar);
    }
    @PutMapping(("/updateSedanCar"))
    public SedanCar updateSedanCar(Long id, SedanCar newCar){
        return  sedanBusiness.updateSedanCar(id,newCar);
    }
    @GetMapping("/rentSedanCar")
    public void rentSedan(Long id, SedanCar sedanCar) throws Exception{
        sedanBusiness.rentSedan(id, sedanCar);
    }
}
