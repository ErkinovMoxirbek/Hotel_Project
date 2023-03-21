package org.example.repository;

import org.example.dto.Employee;
import org.example.dto.Guest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private SessionFactory sessionFactory;
    public void save (Employee employee){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
    }
    public Employee getEmployeeByPhone(String phone){
        Session session = sessionFactory.openSession();
        Employee employee = session.find(Employee.class,phone);
        session.close();
        return employee;
    }
    public Employee getEmployeeById(Integer id){
        Session session = sessionFactory.openSession();
        Employee employee = session.find(Employee.class,id);
        session.close();
        return employee;
    }
    public void update(String id, Employee employee){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(id,employee);
        transaction.commit();
        session.close();
    }
    public List<Employee> getAll() {
        Session session = sessionFactory.openSession();
        Query<Employee> query = session.createQuery("SELECT Employee FROM Employee ", Employee.class);
        List<Employee> list = query.getResultList();
        session.close();
        return list;
    }
}
