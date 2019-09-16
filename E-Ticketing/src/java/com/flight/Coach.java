
package com.flight;

import java.util.Date;


public class Coach {
    String flightNum;
     String origination;
     String destination;
     Date departDate;
     String departTime;
     Date returnDate;
     String returnTime;

    public String getFlightNum() {
        return flightNum;
    }

    public String getOrigination() {
        return origination;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public String getDepartTime() {
        return departTime;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public void setOrigination(String origination) {
        this.origination = origination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return " Flight  " + flightNum + " departing " + origination + " at " + departTime + " arriving " + destination + "  1 hours later ";
    }
     
}
