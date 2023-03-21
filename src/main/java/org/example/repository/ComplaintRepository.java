package org.example.repository;

import org.example.dto.Complaint;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ComplaintRepository {
    @Autowired
    private SessionFactory sessionFactory;
    public void save (Complaint comlaint){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(comlaint);
        transaction.commit();
        session.close();
    }
    public Complaint getComplaintByPhone(String phone){
        Session session = sessionFactory.openSession();
        Complaint comlaint = session.find(Complaint.class,phone);
        session.close();
        return comlaint;
    }
    public Complaint getComplaintById(Integer id){
        Session session = sessionFactory.openSession();
        Complaint comlaint = session.find(Complaint.class,id);
        session.close();
        return comlaint;
    }
    public void update(String id, Complaint comlaint){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(id,comlaint);
        transaction.commit();
        session.close();
    }
    public List<Complaint> getAll() {
        Session session = sessionFactory.openSession();
        Query<Complaint> query = session.createQuery("SELECT Complaint FROM Complaint ", Complaint.class);
        List<Complaint> list = query.getResultList();
        session.close();
        return list;
    }
}
