/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu29
 * La clase HiloRuido implementa la interfaz Runnable y representa un hilo
 * que imprime una secuencia de caracteres "#" un total de 1000 veces.
 */
public class HiloRuido implements Runnable {

    /**
     * Método run que se ejecuta cuando se inicia el hilo.
     * Imprime la secuencia de caracteres "#" 1000 veces.
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("#");
        }
    }
}

