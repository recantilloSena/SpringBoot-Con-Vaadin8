/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fundation.SPringVaadin;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricardo
 */
public interface UsuariosRepository extends JpaRepository <Usuarios,Long> {
    //Todos mís métodos CRUD
    
}
