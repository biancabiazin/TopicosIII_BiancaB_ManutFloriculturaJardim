/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.upf.floriculturajardim.controller;

import com.upf.FloriculturaJardim.entity.HomeEntity;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author 198848
 */
@Named(value = "homeController")
@SessionScoped
public class HomeController implements Serializable {

    /**
     * Creates a new instance of HomeController
     */
    public HomeController() {
    }
    
    HomeEntity entity = new HomeEntity();
    
    public HomeEntity getEntity() {
        return entity;
    }
    
}
