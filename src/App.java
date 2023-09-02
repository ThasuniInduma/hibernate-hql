import org.hibernate.Session;

import entity.CustomerEntity;
import repository.CustomerRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerEntity customerEntity = customerRepository.getCustomer("C001");
        System.out.println(customerEntity.toString());
    }
}
