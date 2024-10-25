/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Clase principal que ejecuta mediante el método principal la lógica del programa para la práctica diez.
 *
 * @author poo03alu06
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IngresoDeSaldoException, RetiroDeSaldoException, SaldoInsuficienteException {
        
        System.out.println("Hola mundo");
        
        //División de piso (división entera)
        System.out.println(" #### Division de piso ####");
        int a = 5; // <-- sin ; se escribe en la salida el fully qualified name
        int c = a / 5; // División de piso (división entera)
        System.out.println(c);
        
        //Desbordamiento de memoria
        System.out.println(" #### Desbordamiento de memoria ####");
        //Crear un arreglo de tamaño 5
        int[] b = new int[5];
        
        //Llenar el arreglo con valores
        for( int i = 0; i < 5; i++) {
            b[i] = i * 10;
        }
        
        //Provocar un error de desbordamiento de memoria
        try {
            for(int i = 0; i <= 5; i++) { // <= provoca error
                System.out.println( b[i] );
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepcion de desbordamiento de memoria.");
        }
        
        //El programa continua
        System.out.println("Hola, he sobrevivido.");
        
        //Provocar un error de aritmetica (División entre 0)
        try {
            float d = 4 / 0;
            System.out.println(d);
        } catch (ArithmeticException e) {
            System.out.println("Excepcion aritmetica segundo caso.");
        }
        
        //Permear excepciones
        System.out.println(" #### Permear excepciones ####");
        
        //Funcionamiento de nuestro metodo de división
        float n = miMetodoDivision(100, 2);
        System.out.println(n);
        
        //Provocar un error de aritmetica (División entre 0) usando nuestro metodo de división
        try {
            float m = miMetodoDivision(100, 0);
            System.out.println(m);
        } catch (ArithmeticException e) {
            System.out.println("Excepcion aritmetica permeada."); // Se propagó (permeó) porque sucedió en un método (miMetodoDivision), y no en el main (otro lugar de donde se provocó).
            System.out.println( e.getStackTrace() );
            e.printStackTrace();
        }

        //El programa continua
        System.out.println("A pesar de todo seguimos en el programa.");
        float x = miMetodoDivision(20, 5);
        System.out.println(x);
        
        //Operaciones sin soporte
        System.out.println(" #### Operaciones sin soporte ####");
        try {
            int w = suma(3, 7);
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepcion de operacion no soportada.");
            System.out.println("Atributo mensaje.");
            System.out.println( e.getMessage() );
        }
        
        //Creación de excepciones
        System.out.println(" #### Creación de excepciones ####");
        //Provocar nuestra excepcion de saldo insuficiente
        try {
            Cuenta cuenta = new Cuenta(100);
            System.out.println("Saldo actual: " + cuenta.consultarSaldo());
            cuenta.depositar(100);
            System.out.println("Saldo actual: " + cuenta.consultarSaldo());
            cuenta.retirar(300);
            System.out.println("Saldo actual: " + cuenta.consultarSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Excepcion presentada: Saldo insuficiente.");
            System.out.println(e.getMessage() );
        }
        
        //Provocar nuestra excepcion de exceso de monto
        try {
            Cuenta cuenta2 = new Cuenta(200);
            System.out.println("Saldo actual:" + cuenta2.consultarSaldo());
            cuenta2.depositar(30000);
            System.out.println("Saldo actual:" + cuenta2.consultarSaldo());
        } catch (IngresoDeSaldoException e) {
            System.out.println("Excepcion presentada: Deposito excesivo.");
            System.out.println(e.getMessage() );
        }
        
        //Provocar nuestra excepcion de exceso de retiros
        try {
            Cuenta cuenta3 = new Cuenta(300);
            System.out.println("Saldo actual:" + cuenta3.consultarSaldo());
            cuenta3.retirar(50);
            System.out.println("Saldo actual:" + cuenta3.consultarSaldo());
            cuenta3.retirar(50);
            System.out.println("Saldo actual:" + cuenta3.consultarSaldo());
            cuenta3.retirar(50);
            System.out.println("Saldo actual:" + cuenta3.consultarSaldo());
            cuenta3.retirar(50);
            System.out.println("Saldo actual:" + cuenta3.consultarSaldo());
        } catch (RetiroDeSaldoException e) {
            System.out.println("Excepcion presentada: Exceso de retiros.");
            System.out.println(e.getMessage() );
        }
    }

    
    //Función que divide
    private static int miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f / f0; // Al hacer divisiòn entre cero al trabajar con flotantes, da el tipo de dato Infinity, en enteros marca excepción de división sobre cero.
    }

    //Función no implementada de suma
    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Operacion no soportada aun."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
