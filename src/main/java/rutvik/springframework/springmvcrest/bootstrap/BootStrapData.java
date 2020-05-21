package rutvik.springframework.springmvcrest.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rutvik.springframework.springmvcrest.domain.Customer;
import rutvik.springframework.springmvcrest.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading customer data");

        Customer customer1 = new Customer();
        customer1.setFirstname("Rutvik");
        customer1.setLastname("Mavani");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstname("Nirav");
        customer2.setLastname("Dobariya");
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setFirstname("Darshan");
        customer3.setLastname("Patel");
        customerRepository.save(customer3);

        System.out.println("Customers saved : " + customerRepository.count());
    }
}
