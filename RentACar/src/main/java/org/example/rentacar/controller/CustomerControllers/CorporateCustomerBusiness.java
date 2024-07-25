package org.example.rentacar.controller.CustomerControllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.rentacar.entites.CustomersEntites.CorporateCustomer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/companyApi")
@NoArgsConstructor
@AllArgsConstructor
public class CorporateCustomerBusiness {
    private CorporateCustomerBusiness corporateCustomerBusiness;

    @GetMapping("/getAllCompanys")
    public List<CorporateCustomer> getAllCorporateCustomers(){
        return corporateCustomerBusiness.getAllCorporateCustomers();
    }
    @GetMapping("/getByIdCompany")
    public CorporateCustomer getByIdCorporateCustomer(Long Id){
        return corporateCustomerBusiness.getByIdCorporateCustomer(Id);
    }

    @DeleteMapping("/deleteCompany")
    public void deleteByIdCorporateCustomer(Long Id){
        corporateCustomerBusiness.deleteByIdCorporateCustomer(Id);
    }
    @PostMapping("/createCompany")
    public CorporateCustomer createCorporateCustomer(CorporateCustomer newCorporateCustomer){
        return corporateCustomerBusiness.createCorporateCustomer(newCorporateCustomer);
    }

    @PutMapping("/updateCompany")
    public CorporateCustomer updateCorporateCustomer(Long Id,CorporateCustomer newCorporateCustomer){
        return corporateCustomerBusiness.updateCorporateCustomer(Id,newCorporateCustomer);
    }
}
