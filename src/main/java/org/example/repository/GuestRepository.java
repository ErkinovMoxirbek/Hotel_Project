package org.example.repository;

import org.example.dto.Guest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GuestRepository {
    @Autowired
    private SessionFactory sessionFactory;
    public void save (Guest guest){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(guest);
        transaction.commit();
        session.close();
    }
    public Guest getGuestByPhone(String phone){
        Session session = sessionFactory.openSession();
        Guest guest = session.find(Guest.class,phone);
        session.close();
        return guest;
    }
    public Guest getGuestById(Integer id){
        Session session = sessionFactory.openSession();
        Guest guest = session.find(Guest.class,id);
        session.close();
        return guest;
    }
    public void update(String id, Guest guest){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(id,guest);
        transaction.commit();
        session.close();
    }
    public List<Guest> getAll() {
        Session session = sessionFactory.openSession();
        Query<Guest> query = session.createQuery("SELECT Guest FROM Guest ", Guest.class);
        List<Guest> list = query.getResultList();
        session.close();
        return list;
    }
}
