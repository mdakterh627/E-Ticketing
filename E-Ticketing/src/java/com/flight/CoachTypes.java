/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flight;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Java
 */
@ManagedBean (name="types")
public class CoachTypes {
SelectItem[] tripTypes = new SelectItem[]{
new SelectItem("Ac","Ac"),
new SelectItem("Non Ac","Non Ac")

};

    public  SelectItem[] getTripTypes() {
        return tripTypes;
    }

    public  void setTripTypes(SelectItem[] tripTypes) {
        this.tripTypes = tripTypes;
    }
    
  
}
