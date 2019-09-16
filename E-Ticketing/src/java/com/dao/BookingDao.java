/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Booking;
import com.util.HibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class BookingDao implements Serializable {
    
    SessionFactory factory = HibernateUtil.getSessionFactory();
    
    public void addBooking(Booking b) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.save(b);
        tran.commit();
        sess.close();
    }
    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        Session sess = factory.openSession();
        Query q = sess.createQuery("From Booking");
        bookings = q.list();
        return bookings;
    }
    public void delete(Booking b) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.delete(b);
        tran.commit();
        sess.close();
    }
    
    public void update(Booking b) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.update(b);
        tran.commit();
        sess.close();
    }
    
}
