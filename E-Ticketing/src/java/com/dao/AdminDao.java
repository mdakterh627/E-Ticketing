/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Admin;
import com.util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author user
 */
public class AdminDao {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public boolean login(String userName, String password) {
        boolean result = false;
        Session sess = sessionFactory.openSession();
        Query query = sess.createQuery("From Admin a where a.userName=:userName AND a.password=:password");
        query.setParameter("userName", userName);
        query.setParameter("password", password);
        List<Admin> admins = query.list();
        for(Admin a: admins) {
            result = true;
        }
        sess.close();
        return result;
    }
    
}
