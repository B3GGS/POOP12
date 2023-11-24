/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu29
 * La clase HiloCeros implementa la interfaz Runnable y representa un hilo
 * que imprime una secuencia de ceros separados por guiones.
 */
public class HiloCeros implements Runnable {

    /**
     * Método run que se ejecuta cuando se inicia el hilo.
     * Imprime una secuencia de ceros separados por guiones.
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("0-");
        }
    }
}

