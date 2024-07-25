package org.example.rentacar.controller.CustomerControllers;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.rentacar.entites.CustomersEntites.IndividualCustomer;
import org.example.rentacar.services.concretes.CustomerBusiness.IndividualCustomerBusiness;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/individualApi")
@NoArgsConstructor
@AllArgsConstructor
public class IndividualCustomerController {
    private IndividualCustomerBusiness individualCustomerBusiness;
    @GetMapping("/getAllindividualCustomer")
    public List<IndividualCustomer> getAllIndividualCustomer(){
        return individualCustomerBusiness.getAllIndividualCustomer();
    }

    @GetMapping("/getByIdIndividualCustomer")
    public IndividualCustomer getByIdIndividualCustomer(Long id){
        return individualCustomerBusiness.getByIdIndividualCustomer(id);
    }

    @PostMapping("/createIndividualCustomer")
    public IndividualCustomer createIndividualCustomer(IndividualCustomer newIndividualCustomer){
        return individualCustomerBusiness.createIndividualCustomer(newIndividualCustomer);
    }

    @PutMapping("/updateIndividualCustomer")
    public IndividualCustomer updateIndividualCustomer(Long id, IndividualCustomer newIndividualCustomer){
        return individualCustomerBusiness.updateIndividualCustomer(id,newIndividualCustomer);
    }

    @DeleteMapping("/deleteIndividualCustomer")
    public void deleteByIdIndividualCustomer(Long id) {
         individualCustomerBusiness.deleteByIdIndividualCustomer(id);
    }
}
