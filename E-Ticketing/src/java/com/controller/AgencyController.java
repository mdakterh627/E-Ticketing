/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.AgencyDao;
import com.entity.Agency;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author user
 */
@ManagedBean (name = "agency")
@RequestScoped
public class AgencyController {
    
    List<Agency> agencys = new ArrayList<>();
    
     Integer id;
     String agencyName;
     String bussesType;
     String busesNumber;
     String liecensNo;
     
     AgencyDao aDao = new AgencyDao();

    
    public AgencyController() {
    }

    public List<Agency> getAgencys() {
        return agencys;
    }

    public void setAgencys(List<Agency> agencys) {
        this.agencys = agencys;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getBussesType() {
        return bussesType;
    }

    public void setBussesType(String bussesType) {
        this.bussesType = bussesType;
    }

    public String getBusesNumber() {
        return busesNumber;
    }

    public void setBusesNumber(String busesNumber) {
        this.busesNumber = busesNumber;
    }

    public String getLiecensNo() {
        return liecensNo;
    }

    public void setLiecensNo(String liecensNo) {
        this.liecensNo = liecensNo;
    }

    public AgencyDao getaDao() {
        return aDao;
    }

    public void setaDao(AgencyDao aDao) {
        this.aDao = aDao;
    }
    
    @PostConstruct
    public void init(){
        setAgencys(aDao.getAllAgencys());
    }
    public String addAgency(){
        aDao.addAgency(new Agency(agencyName, bussesType, busesNumber, liecensNo));
        setAgencys(aDao.getAllAgencys());
        
        
        
    return "ShowAgent";
  
    }
    
    
    public String delete (Agency a){
        aDao.delete(a);
        setAgencys(aDao.getAllAgencys());
        
    return "ShowAgent";
    }
    
    public String update(){
        Agency a = new Agency();
        a.setId(id);
        a.setAgencyName(agencyName);
        a.setBussesType(bussesType);
        a.setBusesNumber(busesNumber);
        a.setLiecensNo(liecensNo);
       
        setAgencys(aDao.getAllAgencys());
        
        
    
    return "";
    }
    
    public String edit(Agency a){
        setId(a.getId());
        setAgencyName(a.getAgencyName());
        setBussesType(a.getBussesType());
        setBusesNumber(a.getBusesNumber());
        setLiecensNo(a.getLiecensNo());
        
    
    return "EditAgent";
    }
    
    
    
}
