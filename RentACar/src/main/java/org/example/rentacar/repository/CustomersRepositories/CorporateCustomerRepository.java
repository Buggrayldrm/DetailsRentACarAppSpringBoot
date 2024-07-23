package org.example.rentacar.repository.CustomersRepositories;

import org.example.rentacar.entites.CustomersEntites.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateCustomerRepository extends JpaRepository<CorporateCustomer,Long> {
}
