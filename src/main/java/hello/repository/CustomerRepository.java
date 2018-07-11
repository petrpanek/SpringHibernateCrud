package hello.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    
    List<Customer> findByFirstName(String firstName);
    
    List<Customer> findByFirstNameOrLastName(String firstName, String lastName);
}