/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.User;
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
public class UserDao implements Serializable {
    
    SessionFactory factory = HibernateUtil.getSessionFactory();
    
    public void addUser(User u) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.save(u);
        tran.commit();
        sess.close();
    }
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Session sess = factory.openSession();
        Query q = sess.createQuery("From User");
        users = q.list();
        return users;
    }
    public void delete(User u) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.delete(u);
        tran.commit();
        sess.close();
    }
    public void update(User u) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.update(u);
        tran.commit();
        sess.close();
    }
    
}
