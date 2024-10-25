/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Excepcion de retiro de saldo
 * @author Jorge
 */
public class RetiroDeSaldoException extends Exception {
    
    /**
     * Constructor vacio
     */
    public RetiroDeSaldoException() {
    }
    
    /**
     * Constructor lleno
     * @param message 
     */
    public RetiroDeSaldoException(String message) {
        super(message);
    }
}

