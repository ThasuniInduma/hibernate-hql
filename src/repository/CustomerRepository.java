package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.CustomerEntity;
import util.SessionFactoryConfiguration;

public class CustomerRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public CustomerEntity getCustomer(String id){
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }

    public List<CustomerEntity> getAllCustomers(){

        String hql = "FROM CustomerEntity";
        Query query = session.createQuery(hql);

        List<CustomerEntity> customerEntities = query.list();
        return customerEntities;
    }

    public List<Object[]> getAllCustomerNativeQuery(){
        String sql = "SELECT*FROM customer";
        Query query = session.createSQLQuery(sql);
        List<Object[]> data = query.list();
        return data;
    }

    public List<Object[]> getAllCustomerNameAndDob(){
        String hql = "SELECT c.id, c.name, c.dob FROM CustomerEntity as c";
        Query query = session.createQuery(hql);
        List<Object[]> data = query.list();
        return data;
    }

    public CustomerEntity findCustomerById(String id){
        String hql = "FROM CustomerEntity WHERE id = '" + id + "'";
        Query query = session.createQuery(hql);
        CustomerEntity customerEntity = (CustomerEntity) query.uniqueResult();
        return customerEntity;
    }

    public CustomerEntity findCustomerByIdUsingNamedParameters(String id){
        String hql = "FROM CustomerEntity WHERE id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        CustomerEntity customerEntity = (CustomerEntity) query.uniqueResult();
        return customerEntity;
    }
}
