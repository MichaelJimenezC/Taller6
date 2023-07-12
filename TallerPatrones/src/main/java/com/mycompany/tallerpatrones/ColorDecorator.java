/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class ColorDecorator extends InformeDecorator{
    public ColorDecorator(Informe informeDecorado) {
        super(informeDecorado);
        
    }

    @Override
    public String personalizarInforme() {
        System.out.println("No se subió este archivo al repo ayuda");
        return informeDecorado.personalizarInforme() + " con color";
        //auxilio
    }
}
