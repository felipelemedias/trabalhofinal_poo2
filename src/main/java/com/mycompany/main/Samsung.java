/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author fleme
 */
public class Samsung implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("galaxy8")){
            return new Galaxy8(6999.99);
        }
        return null;
    }
    
}
