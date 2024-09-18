/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.GestionObservable;

import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class GestionObservable {

    private ArrayList<IObserver> observadores = new ArrayList<>();

    public GestionObservable() {

    }

    public void addObserver(IObserver o) {
        observadores.add(o);
    }

    public void removeObserver(IObserver o) {

        observadores.remove(o);

    }

    public void notifyObservers(Object o, Object arg) {
    //Object o: El objeto que está siendo observado (el Observable).
    //Object arg: La información adicional relacionada con el cambio (en este caso, numero).

        for (IObserver obs : observadores) {

            obs.update(o, arg);

        }
    }

}
/*
EXPLICACION
 1. El observable cambia de estado: En tu clase Observable, el estado cambia 
 cada vez que se incrementa el valor de numero.

 2. Se notifica a los observadores: Cuando el número es par, el método 
 notifyObservers se invoca, lo que provoca que todos los observadores reciban 
 la actualización.

 3. El método update se ejecuta en cada observador: Dentro de notifyObservers,
 cada observador en la lista de observadores es notificado, y el método update
 de cada uno es llamado.

 4. El observador reacciona al cambio: Cada observador implementa su propio 
 comportamiento en el método update.
*/