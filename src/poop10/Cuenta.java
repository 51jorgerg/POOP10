/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase cuenta
 * @author poo03alu06
 */
public class Cuenta {
    //Atributos
    private double saldo;
    private int retiros;
    
    /**
     * Constructor vacio
     */
    public Cuenta() {
    }

    /**
     * Constructor lleno
     * @param saldo 
     */
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Función que devuelve el saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Función que establece el saldo
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     /**
     * Función que devuelve el numero de retiros
     * @return saldo
     */
    public int getRetiros() {
        return retiros;
    }

    /**
     * Función que establece el numero de retiros
     * @param retiros
     */
    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }
    
    /**
     * Función que deposita saldo en la cuenta
     * @param monto 
     * @throws IngresoDeSaldoException
     */
    public void depositar(double monto) throws IngresoDeSaldoException {
        if (monto > 20000)
            throw new IngresoDeSaldoException("Se ha superado el limite de deposito de saldo ($ 20,000)");
        else
            saldo += monto;
    }
    
    /**
     * Función que retira saldo de la cuenta
     * @param monto
     * @throws SaldoInsuficienteException 
     * @throws poop10.RetiroDeSaldoException 
     */
    public void retirar(double monto) throws SaldoInsuficienteException, RetiroDeSaldoException {
        if(monto > saldo)
            // System.out.println("No tienes ese dinero.");
            throw new SaldoInsuficienteException("Saldo insuficiente para retiro");
        else if (retiros >= 3)
            throw new RetiroDeSaldoException("Se ha superado el limite de retiros (3) ");
        else
            saldo -= monto;
            retiros += 1;
    }
    
    /**
     * Función que consulta el saldo de la cuenta
     * @return saldo
     */
    public double consultarSaldo() {
        return getSaldo();
    }

    /**
     * Función que parsea la cuenta en una cadena
     * @return String
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}
