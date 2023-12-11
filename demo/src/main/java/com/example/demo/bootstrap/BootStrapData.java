package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;




@Component
public class BootStrapData implements CommandLineRunner {

//    private final CartRepository cartRepository;
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
//        this.cartRepository = cartRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Customer jeff = new Customer();
        jeff.setFirstName("Jeff");
        jeff.setLastName("Johnson");
        jeff.setAddress("1234 Johnson Lane");
        jeff.setPhone("555-123-4511");
        jeff.setPostal_code("97225");


        Customer mike = new Customer();
        mike.setFirstName("Mike");
        mike.setLastName("Murphy");
        mike.setAddress("4834 McAdam Lane");
        mike.setPhone("541-123-8411");
        mike.setPostal_code("97223");

        Customer beth = new Customer();
        beth.setFirstName("Beth");
        beth.setLastName("Barker");
        beth.setAddress("14148 Sherman Ct");
        beth.setPhone("847-345-0122");
        beth.setPostal_code("44123");

        Customer rich = new Customer();
        rich.setFirstName("Rich");
        rich.setLastName("Rodriguez");
        rich.setAddress("84 Main St");
        rich.setPhone("123-451-0000");
        rich.setPostal_code("43523");

        Customer nick = new Customer();
        nick.setFirstName("Nick");
        nick.setLastName("Saban");
        nick.setAddress("1124 Alabama St");
        nick.setPhone("548-841-6666");
        nick.setPostal_code("98415");

        boolean firstTimeEverRun = true;
        List<Customer> customerList = (List<Customer>) customerRepository.findAll();

        for(Customer customer:customerList){
            if (customer == jeff) {
                firstTimeEverRun = false;
            }
        }

        if (firstTimeEverRun == true) {
            this.customerRepository.save(jeff);
            this.customerRepository.save(beth);
            this.customerRepository.save(mike);
            this.customerRepository.save(rich);
            this.customerRepository.save(nick);
        }



    }
}
