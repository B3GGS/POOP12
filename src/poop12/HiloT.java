/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu29
 * La clase HiloT extiende la clase Thread y representa un hilo
 * que realiza una serie de iteraciones y muestra información sobre el hilo.
 */
public class HiloT extends Thread {

    /**
     * Constructor de la clase HiloT.
     *
     * @param name El nombre del hilo, que se utiliza para identificar el hilo en la salida.
     */
    public HiloT(String name) {
        super(name);
    }

    /**
     * Método run que se ejecuta cuando se inicia el hilo.
     * Realiza 10 iteraciones e imprime información sobre la iteración y el hilo.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i + " de " + getName());
        }
        System.out.println("Termina el hilo " + getName());
    }
}

