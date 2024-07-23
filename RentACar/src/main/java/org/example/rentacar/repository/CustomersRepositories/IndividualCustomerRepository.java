package org.example.rentacar.repository.CustomersRepositories;

import org.example.rentacar.entites.CustomersEntites.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer,Long> {


}
