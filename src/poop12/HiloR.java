/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu29
 * La clase HiloR implementa la interfaz Runnable y representa un hilo
 * que realiza una serie de iteraciones y muestra información sobre el hilo actual.
 */
public class HiloR implements Runnable {

    /**
     * Método run que se ejecuta cuando se inicia el hilo.
     * Realiza 10 iteraciones e imprime información sobre la iteración y el hilo actual.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i + " del hilo " + Thread.currentThread().getName());
        }
        System.out.println("Termina el hilo " + Thread.currentThread().getName());
    }
}

