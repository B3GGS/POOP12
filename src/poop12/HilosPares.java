/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu29
 * La clase HilosPares implementa la interfaz Runnable y representa un hilo
 * que imprime números pares hasta el valor 500.
 */
public class HilosPares implements Runnable {

    /**
     * Método run que se ejecuta cuando se inicia el hilo.
     * Imprime números pares hasta el valor 500.
     */
    @Override
    public void run() {
        for (int i = 0; i <= 500; i += 2) {
            System.out.println(i);
        }
    }
}

