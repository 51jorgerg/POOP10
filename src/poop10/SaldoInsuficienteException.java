/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Excepcion de saldo insuficiente
 * @author poo03alu06
 */
public class SaldoInsuficienteException extends Exception {
    
    /**
     * Constructor vacio
     */
    public SaldoInsuficienteException() {
    }
    
    /**
     * Funcion que tira el mensaje de error proporcionado
     * @param message 
     */
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
