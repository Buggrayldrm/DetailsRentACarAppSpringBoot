package org.example.rentacar.services.abstracts.CustomerServices;

import org.example.rentacar.entites.CustomersEntites.IndividualCustomer;

import java.util.List;

public interface IndividualCustomerService {

        List<IndividualCustomer> getAllIndividualCustomer();
        IndividualCustomer getByIdIndividualCustomer(Long id);

        IndividualCustomer createIndividualCustomer(IndividualCustomer newIndividualCustomer);
        IndividualCustomer updateIndividualCustomer(Long id,IndividualCustomer newIndividualCustomer);

        void deleteByIdIndividualCustomer(Long id);
}
