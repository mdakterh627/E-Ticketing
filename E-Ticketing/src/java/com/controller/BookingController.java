/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.BookingDao;
import com.entity.Booking;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author user
 */
@ManagedBean (name = "booking")
@RequestScoped
public class BookingController {
    List<Booking> bookings = new ArrayList<>();
    
    Integer id;
    String name;
    String address;
    String leavingFrom;
    String goingTo;
    Date bookingDate;
    Date travelDate;
    String seat;
    Double price;
    Double totalPrice;
    String comment;
    
    BookingDao bDao = new BookingDao();

    
    public BookingController() {
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLeavingFrom() {
        return leavingFrom;
    }

    public void setLeavingFrom(String leavingFrom) {
        this.leavingFrom = leavingFrom;
    }

    public String getGoingTo() {
        return goingTo;
    }

    public void setGoingTo(String goingTo) {
        this.goingTo = goingTo;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BookingDao getbDao() {
        return bDao;
    }

    public void setbDao(BookingDao bDao) {
        this.bDao = bDao;
    }
    
    @PostConstruct
    public void init(){
        setBookings(bDao.getAllBookings());
    
    
    }
    
    public String addBooking(){
        bDao.addBooking(new Booking(name, address, leavingFrom, goingTo, bookingDate, travelDate, seat, price, totalPrice, comment));
        setBookings(bDao.getAllBookings());
    
    return "BookingTable";
    }
    public String delete(Booking b){
        bDao.delete(b);
        setBookings(bDao.getAllBookings());
    
    return "BookingTable";
    }
    
    public String update(){
        Booking b = new Booking();
        b.setId(id);
        b.setName(name);
        b.setAddress(address);
        b.setLeavingFrom(leavingFrom);
        b.setGoingTo(goingTo);
        b.setBookingDate(bookingDate);
        b.setTravelDate(travelDate);
        b.setSeat(seat);
        b.setPrice(price);
        b.setTotalPrice(totalPrice);
        b.setComment(comment);
       
        setBookings(bDao.getAllBookings());
        
        
    
    return "";
    }
    
    public String edit(Booking b){
        setId(b.getId());
        setName(b.getName());
        setAddress(b.getAddress());
        setLeavingFrom(b.getLeavingFrom());
        setGoingTo(b.getGoingTo());
        setBookingDate(b.getBookingDate());
        setTravelDate(b.getTravelDate());
        setSeat(b.getSeat());
        setPrice(b.getPrice());
        setTotalPrice(b.getTotalPrice());
        setComment(b.getComment());
        
    
    return "EditBooking";
    }

    
    
    
    
}
