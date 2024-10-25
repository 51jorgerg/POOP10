/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Excepcion de deposito de saldo
 * @author poo03alu06
 */
public class IngresoDeSaldoException extends Exception {
    
    /**
     * Constructor vacio
     */
    public IngresoDeSaldoException() {
    }
    
    /**
     * Constructor lleno
     * @param message 
     */
    public IngresoDeSaldoException(String message) {
        super(message);
    }
}
