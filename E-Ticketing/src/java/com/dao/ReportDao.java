/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Report;
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
public class ReportDao implements Serializable {
    
    SessionFactory factory = HibernateUtil.getSessionFactory();
    
    public void addReport(Report r) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.save(r);
        tran.commit();
        sess.close();
    }
    public List<Report> getAllReports() {
        List<Report> reports = new ArrayList<>();
        Session sess = factory.openSession();
        Query q = sess.createQuery("From Report");
        reports = q.list();
        return reports;
    }
    public void delete(Report r) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.delete(r);
        tran.commit();
        sess.close();
    }
    public void update(Report r) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.update(r);
        tran.commit();
        sess.close();
    }
    
}
