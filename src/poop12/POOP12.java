/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu29
 */
/**
 * Clase principal POOP12 que contiene el método main para ejecutar ejercicios de hilos.
 */
public class POOP12 {

    /**
     * Método principal que ejecuta los ejercicios de hilos.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        /* Ejercicio 1: Creación de varios hilos y ejecución concurrente. */
        /*
        HiloT hilo1 = new HiloT("Primer hilo");
        hilo1.start();
        new HiloT("Segundo Hilo").start();
        new Thread(new HiloR(), "Tercer Hilo").start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion " + i + " del main.");
        }
        System.out.println("Termina el main");
        */

        /* Ejercicio 2: Ejecución de hilos que imprimen secuencias específicas. */
        /*
        new Thread(new HiloCeros(), "Hilo Ceros").start();
        new Thread(new HiloUnos(), "Hilo Unos").start();
        new Thread(new HiloRuido(), "Hilo ruido").start();
        */

        /* Ejercicio Cuenta: Simulación de acceso, depósito y retiro en una cuenta. */
        /*
        new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        System.out.println("Termina el hilo principal");
        */

        /* Ejercicio extra: Ejecución de hilos que imprimen números pares e impares. */
        new Thread(new HilosPares(), "Hilo Pares").start();
        new Thread(new HiloNones(), "Hilo Nones").start();

    }
}
