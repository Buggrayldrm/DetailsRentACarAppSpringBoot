package org.example.rentacar.services.concretes.CustomerBusiness;


import org.example.rentacar.entites.CustomersEntites.CorporateCustomer;
import org.example.rentacar.repository.CustomersRepositories.CorporateCustomerRepository;
import org.example.rentacar.services.abstracts.CustomerServices.CorporateCustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CorporateCustomerBusiness implements CorporateCustomerService {

    CorporateCustomerRepository corporateCustomerRepository;
    @Override
    public List<CorporateCustomer> getAllCorporateCustomers() {
        return corporateCustomerRepository.findAll();
    }

    @Override
    public CorporateCustomer getByIdCorporateCustomer(Long Id) {
        return corporateCustomerRepository.findById(Id).orElse(null);
    }


    @Override
    public void deleteByIdCorporateCustomer(Long Id) {
    corporateCustomerRepository.deleteById(Id);
    }

    @Override
    public CorporateCustomer createCorporateCustomer(CorporateCustomer newCorporateCustomer) {
        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setCompanyId(newCorporateCustomer.getCompanyId());
        corporateCustomer.setCompanyName(newCorporateCustomer.getCompanyName());
        corporateCustomer.setCompanyNumber(newCorporateCustomer.getCompanyNumber());
        return corporateCustomer;

    }

    @Override
    public CorporateCustomer updateCorporateCustomer(Long Id,CorporateCustomer newCorporateCustomer) {
        Optional<CorporateCustomer> corporateCustomer =corporateCustomerRepository.findById(Id);
        if (corporateCustomer.isPresent()){
            CorporateCustomer corporateCustomer1=new CorporateCustomer();
            corporateCustomer1.setCompanyNumber(newCorporateCustomer.getCompanyNumber());
            corporateCustomer1.setCompanyName(newCorporateCustomer.getCompanyName());
            corporateCustomer1.setCompanyNumber(newCorporateCustomer.getCompanyNumber());
            return corporateCustomer1;
        }
        else {
            return null;
        }
    }
}
