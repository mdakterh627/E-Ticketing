
package com.flight;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="flight")
@SessionScoped
public class CoachSearch {
    private String origination;
    private String destination;
    private Date departDate;
    private String departTime;
    private Date returnDate;
    private String returnTime;
    private String tripTypes;
    
   
ArrayList<Coach> matchingFlight = new ArrayList<>();
    public CoachSearch() {
        matchingFlight.add(new Coach());
        matchingFlight.add(new Coach());
        
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

    public String getTripTypes() {
        return tripTypes;
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

    public void setTripTypes(String tripTypes) {
        this.tripTypes = tripTypes;
    }
    public String add(){
        
    
        return "ResultSearch";
    }

   
    
    public String submit(){
     Coach f1 = matchingFlight.get(0);
        f1.setDepartDate(departDate);
        f1.setDepartTime(departTime);
        f1.setDestination(destination);
        f1.setFlightNum("001");
        f1.setReturnDate(returnDate);
        f1.setReturnTime(returnTime);
        
        Coach f2 = matchingFlight.get(1);
        f2.setDepartDate(departDate);
        f2.setDepartTime(departTime);
        f2.setDestination(destination);
        f2.setFlightNum("002");
        f2.setReturnDate(returnDate);
        f2.setReturnTime(returnTime);
       
    
    return "MatchingCoach";
    }

    public ArrayList<Coach> getMatchingFlight() {
        return matchingFlight;
    }

    public void setMatchingFlight(ArrayList<Coach> matchingFlight) {
        this.matchingFlight = matchingFlight;
    }

   
    
    

   
}
