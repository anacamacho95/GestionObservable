/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.GestionObservable;

/**
 *
 * @author Enrique
 */
public class Observador2 implements IObserver {

    @Override
    public void update(Object o, Object arg) {
        int n = (int) arg;

        if (n == 100) {
            System.out.println("Se ha llegado al número 100");
        } 

    }

}
