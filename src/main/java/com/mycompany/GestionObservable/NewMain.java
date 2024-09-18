/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.GestionObservable;

/**
 *
 * @author Enrique
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Observable observable=new Observable();
        Observador1 obs1=new Observador1();
        Observador2 obs2=new Observador2();

        //suscribo a obs1 a la lista de observadores
        observable.gesOb.addObserver(obs1);
        observable.gesOb.addObserver(obs2);

        observable.inicio();
        
        
    }
    
}
