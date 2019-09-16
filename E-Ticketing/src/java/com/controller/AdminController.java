/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.AdminDao;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author user
 */
@ManagedBean(name = "admin")
@SessionScoped
public class AdminController {

    Integer id;
    String userName;
    String password;
    
    AdminDao aDao = new AdminDao();
    
    public AdminController() {
    }

    public AdminDao getaDao() {
        return aDao;
    }

    public void setaDao(AdminDao aDao) {
        this.aDao = aDao;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     @PostConstruct
    public void init(){
    
    
    }
    
    
    public String login() {
        boolean result = aDao.login(userName, password);
        if(result == false) {
            return "";
        }
        return "welcomePage";
    }
    
    
    
}
