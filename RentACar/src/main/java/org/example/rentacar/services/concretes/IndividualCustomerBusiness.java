package org.example.rentacar.services.concretes;

import org.example.rentacar.entites.CustomersEntites.IndividualCustomer;
import org.example.rentacar.repository.CustomersRepositories.IndividualCustomerRepository;
import org.example.rentacar.services.abstracts.IndividualCustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IndividualCustomerBusiness implements IndividualCustomerService {
    IndividualCustomerRepository individualCustomerRepository;

    @Override
    public List<IndividualCustomer> getAllIndividualCustomer() {

        return  individualCustomerRepository.findAll();
    }

    @Override
    public IndividualCustomer getByIdIndividualCustomer(Long id) {
        return individualCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public IndividualCustomer createIndividualCustomer(IndividualCustomer newIndividualCustomer) {
        IndividualCustomer individualCustomer =new IndividualCustomer();
        individualCustomer.setTc(newIndividualCustomer.getTc());
        individualCustomer.setName(newIndividualCustomer.getName());
        individualCustomer.setPhoneNumber(newIndividualCustomer.getPhoneNumber());
        individualCustomer.setCriminalRecord(newIndividualCustomer.isCriminalRecord());
        return individualCustomer;
    }

    @Override
    public IndividualCustomer updateIndividualCustomer(Long id, IndividualCustomer newIndividualCustomer) {
        Optional<IndividualCustomer> individualCustomer=individualCustomerRepository.findById(id);
        if (individualCustomer.isPresent()){
            IndividualCustomer individualCustomer1=new IndividualCustomer();
            individualCustomer1.setTc(newIndividualCustomer.getTc());
            individualCustomer1.setName(newIndividualCustomer.getName());
            individualCustomer1.setCriminalRecord(newIndividualCustomer.isCriminalRecord());
            individualCustomer1.setPhoneNumber(newIndividualCustomer.getPhoneNumber());
            return  individualCustomer1;
        }
        else{
            return null;
        }
    }

    @Override
    public void deleteByIdIndividualCustomer(Long id) {

        individualCustomerRepository.deleteById(id);
    }
}
