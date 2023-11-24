/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu29
 * La clase HiloNones implementa la interfaz Runnable y representa un hilo
 * que imprime números impares hasta el número 500.
 */
public class HiloNones implements Runnable {

    /**
     * Método run que se ejecuta cuando se inicia el hilo.
     * Imprime números impares hasta el número 500.
     */
    @Override
    public void run() {
        for (int i = 1; i <= 500; i += 2) {
            System.out.println(i);
        }
    }
}
