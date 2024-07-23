package org.example.rentacar.services.abstracts;

import org.example.rentacar.entites.CustomersEntites.CorporateCustomer;

import java.util.List;

public interface CorporateCustomerService {

    List<CorporateCustomer> getAllCorporateCustomers();
    CorporateCustomer getByIdCorporateCustomer(Long Id);

    void deleteByIdCorporateCustomer(Long Id);

    CorporateCustomer createCorporateCustomer(CorporateCustomer newCorporateCustomer);

    CorporateCustomer updateCorporateCustomer(Long Id,CorporateCustomer newCorporateCustomer);



}
