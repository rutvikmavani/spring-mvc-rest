package rutvik.springframework.springmvcrest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rutvik.springframework.springmvcrest.domain.Customer;
import rutvik.springframework.springmvcrest.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public final static String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    Customer getCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

}
