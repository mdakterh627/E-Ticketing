/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.ReportDao;
import com.entity.Report;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author user
 */
@ManagedBean (name = "report")
@SessionScoped
public class ReportController {
    List<Report> reports = new ArrayList<>();
    
     Integer id;
     String companyName;
     String busNumber;
     String salesTicket;
     Double ticketPrice;
     Double totalPrice;
     Double totalCost;
     Double totalPay;
    ReportDao rDao = new ReportDao();
    
    public ReportController() {
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getSalesTicket() {
        return salesTicket;
    }

    public void setSalesTicket(String salesTicket) {
        this.salesTicket = salesTicket;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Double totalPay) {
        this.totalPay = totalPay;
    }

    public ReportDao getrDao() {
        return rDao;
    }

    public void setrDao(ReportDao rDao) {
        this.rDao = rDao;
    }
    
    
    @PostConstruct
    public void init(){
        setReports(rDao.getAllReports());
    
    
    }
    
    public String addReport(){
        rDao.addReport(new Report(companyName, busNumber, salesTicket, ticketPrice, totalPrice, totalCost, totalPay));
        setReports(rDao.getAllReports());
    
    return "ReportTable";
    }
    public String delete(Report r){
        rDao.delete(r);
        setReports(rDao.getAllReports());
    
    return "Report";
    }
//    public String update(){
//        Report r = new Report();
//        r.setId(id);
//        r.setCompanyName(companyName);
//        r.setBusNumber(busNumber);
//        r.setSalesTicket(salesTicket);
//        r.setTicketPrice(ticketPrice);
//        r.setTotalPrice(totalPrice);
//        r.setTotalCost(totalCost);
//        r.setTotalPay(totalPay);
//        rDao.update(r);
//        setReports(rDao.getAllReports());
//    
//    return "ReportTable";
//    }
//    public String edit(Report r){
//        setId(r.getId());
//        setCompanyName(r.getCompanyName());
//        setBusNumber(r.getBusNumber());
//        setSalesTicket(r.getSalesTicket());
//        setTicketPrice(r.getTicketPrice());
//        setTotalPrice(r.getTotalPrice());
//        setTotalCost(r.getTotalCost());
//        setTotalPay(r.getTotalPay());
//    
//    return "EditReport";
//    }
}
