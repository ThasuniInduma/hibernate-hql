import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

import entity.CustomerEntity;
import repository.CustomerRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository = new CustomerRepository();

        //List<CustomerEntity> customerEntities = customerRepository.getAllCustomers();
        //customerEntities.forEach(System.out::println);

        //List<Object[]> data = customerRepository.getAllCustomerNativeQuery();
        //for (Object[] row : data) {
        //    System.out.println(Arrays.toString(row));
        //}

        //List<Object[]> data = customerRepository.getAllCustomerNameAndDob();
        //for (Object[] row : data) {
        //    System.out.println(Arrays.toString(row));
        //}

        //CustomerEntity customerEntity = customerRepository.findCustomerById("C001");
        //System.out.println(customerEntity.toString());

        CustomerEntity customerEntity = customerRepository.findCustomerByIdUsingNamedParameters("C001");
        System.out.println(customerEntity.toString());
    }
}
