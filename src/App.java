import java.util.List;

import org.hibernate.Session;

import entity.CustomerEntity;
import repository.CustomerRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository = new CustomerRepository();
        List<CustomerEntity> customerEntities = customerRepository.getAllCustomers();
        //customerEntities.forEach(e->{
        //    System.out.println(e.toString());
        //});

        customerEntities.forEach(System.out::println);
    }
}
