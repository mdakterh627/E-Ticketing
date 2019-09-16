/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.UserDao;
import com.entity.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author user
 */
@ManagedBean(name = "user")
@SessionScoped
public class UserController {
    SelectItem[] genders = new SelectItem[]{
    new SelectItem("Male","Male"),
    new SelectItem("Female","Female"),
    new SelectItem("Others","Others")

    };
    
    List<User> users = new ArrayList<>();
    
      Integer id;
      String name;
      String FName;
      String MName;
      String address;
      Integer mobile;
      String email;
      String gender;
      Date dateOfBirth;
      String nid;
      String religion;
      String occupation;
      String city;
      String country;
      String typeOfUser;
      String userName;
      String password;
      
    UserDao uDao = new UserDao();

    public SelectItem[] getGenders() {
        return genders;
    }

    public void setGenders(SelectItem[] genders) {
        this.genders = genders;
    }
    
    
    
    

    
    public UserController() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
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

    public UserDao getuDao() {
        return uDao;
    }

    public void setuDao(UserDao uDao) {
        this.uDao = uDao;
    }
    public List<String> citys(String city) {
        List<String> cities = new ArrayList<>();
        cities.add("Dhaka");
        cities.add("Chattagram");
        cities.add("Barishal");
        cities.add("Khulna");
        cities.add("Rajshahi");
        cities.add("Maymonshingh");
        cities.add("Sylhet");
        cities.add("Rangpur");
        
        return cities;
    }
    
    @PostConstruct
    public void init(){
        setUsers(uDao.getAllUsers());
    
    
    }
    
    public String addUser() {
        uDao.addUser(new User(name, FName, MName, address, mobile, email, gender, dateOfBirth, nid, religion, occupation, city, country, typeOfUser, userName, password));
        setUsers(uDao.getAllUsers());
        return "ShowUser";
    }
    
    public String delete(User u) {
        uDao.delete(u);
        setUsers(uDao.getAllUsers());
        return "";
    }
    public String update() {
        User p = new User();
        
        setUsers(uDao.getAllUsers());
        return "SignUp";
    }
    public String edit(User u) {
        
        return "Edit";
    }
    
}
