package rutvik.springframework.springmvcrest.services;

import rutvik.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);

}
