/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu29
 * La clase Cuenta extiende la clase Thread y simula una cuenta bancaria
 * con operaciones de depósito y extracción de dinero.
 */
public class Cuenta extends Thread {

    // Saldo compartido entre todas las instancias de la clase
    private static long saldo = 0;

    /**
     * Constructor de la clase Cuenta.
     *
     * @param name El nombre del hilo, que representa el tipo de operación
     *             que realizará (Deposito 1, Deposito 2 o cualquier otro).
     */
    public Cuenta(String name) {
        super(name);
    }

    /**
     * Método run que se ejecuta cuando se inicia un hilo. Realiza operaciones
     * de depósito o extracción de dinero según el nombre del hilo.
     */
    public void run() {
        if (getName().equals("Deposito 1") || getName().equals("Deposito 2")) {
            this.depositarDinero(100);
        } else {
            this.extraerDinero(50);
        }
        System.out.println("Termina el " + getName());
    }

    /**
     * Método sincronizado para depositar dinero en la cuenta.
     *
     * @param cantidad La cantidad de dinero a depositar.
     */
    public synchronized void depositarDinero(int cantidad) {
        System.out.println("El saldo actual es " + saldo);
        saldo += cantidad;
        System.out.println("Se depositaron " + cantidad + " pesos");
        notifyAll();
    }

    /**
     * Método sincronizado para extraer dinero de la cuenta.
     *
     * @param cantidad La cantidad de dinero a extraer.
     */
    public synchronized void extraerDinero(int cantidad) {
        System.out.println("El saldo actual es " + saldo);
        try {
            if (saldo <= 0) {
                System.out.println(getName() + " espera depósito" + "\nSaldo =" + saldo);
                sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        saldo -= cantidad;
        System.out.println(getName() + " extrajo " + cantidad + " pesos.\nSaldo restante = " + saldo);
        notifyAll();
    }
}
