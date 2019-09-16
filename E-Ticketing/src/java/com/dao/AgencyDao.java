/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.*;
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
public class AgencyDao implements Serializable{
    
    SessionFactory factory = HibernateUtil.getSessionFactory();
    
    public void addAgency(Agency a) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.save(a);
        tran.commit();
        sess.close();
    }
    public List<Agency> getAllAgencys() {
        List<Agency> agencys = new ArrayList<>();
        Session sess = factory.openSession();
        Query q = sess.createQuery("From Agency");
        agencys = q.list();
        return agencys;
    }
    public void delete(Agency a) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.delete(a);
        tran.commit();
        sess.close();
    }
    public void update(Agency a) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.update(a);
        tran.commit();
        sess.close();
    }
}
