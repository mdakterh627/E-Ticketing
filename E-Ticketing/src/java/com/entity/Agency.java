package com.entity;
// Generated Sep 7, 2019 8:57:10 PM by Hibernate Tools 4.3.1



/**
 * Agency generated by hbm2java
 */
public class Agency  implements java.io.Serializable {


     private Integer id;
     private String agencyName;
     private String bussesType;
     private String busesNumber;
     private String liecensNo;

    public Agency() {
    }

    public Agency(String agencyName, String bussesType, String busesNumber, String liecensNo) {
       this.agencyName = agencyName;
       this.bussesType = bussesType;
       this.busesNumber = busesNumber;
       this.liecensNo = liecensNo;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAgencyName() {
        return this.agencyName;
    }
    
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    public String getBussesType() {
        return this.bussesType;
    }
    
    public void setBussesType(String bussesType) {
        this.bussesType = bussesType;
    }
    public String getBusesNumber() {
        return this.busesNumber;
    }
    
    public void setBusesNumber(String busesNumber) {
        this.busesNumber = busesNumber;
    }
    public String getLiecensNo() {
        return this.liecensNo;
    }
    
    public void setLiecensNo(String liecensNo) {
        this.liecensNo = liecensNo;
    }




}


