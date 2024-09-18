/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.GestionObservable;

/**
 *
 * @author Enrique
 */
public class Observador1 implements IObserver{

    @Override
    public void update(Object o, Object arg) {
        
            int n=(int)arg;
        
            System.out.println(n);
        

    }
    
    
    
}
