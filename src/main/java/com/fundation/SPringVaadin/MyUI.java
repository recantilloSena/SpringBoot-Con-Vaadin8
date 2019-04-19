package com.fundation.SPringVaadin;


import com.fundation.SPringVaadin.Usuarios;
import com.fundation.SPringVaadin.UsuariosRepository;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
@SpringUI()
@Theme("valo")
public class MyUI extends UI {

    @Autowired
    UsuariosRepository repo;
    
    @Override
    protected void init(VaadinRequest request) {
        
        VerticalLayout vl = new VerticalLayout();
        
        Grid<Usuarios> grid = new Grid(Usuarios.class); 
 
        grid.setItems(repo.findAll());
        
        vl.addComponents(new Label("Spring UI"), grid);
        
        setContent(vl);
        
        
        
    }
    
}
