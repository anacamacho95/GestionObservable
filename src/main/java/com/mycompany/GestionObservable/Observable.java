/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.GestionObservable;

/**
 *
 * @author Enrique
 */
public class Observable {

    GestionObservable gesOb = new GestionObservable();
    private Integer numero = 0;

    public Observable() {

    }

    public void inicio() {

        while ( numero<=200) {

            numero++;
            if (numero % 2 == 0) {
                gesOb.notifyObservers(this, numero);
                //this: es el objeto Observable que está notificando a sus observadores.
                //numero: es el valor actual que ha cambiado y que los observadores recibirán.
            }
                   
        }
    }


}
