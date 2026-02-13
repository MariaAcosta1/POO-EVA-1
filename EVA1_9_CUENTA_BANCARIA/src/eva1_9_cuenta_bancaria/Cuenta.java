/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_9_cuenta_bancaria;

public class Cuenta {
    private String titular;
    private double monto;
    
    public Cuenta(String titular, double monto){
        this.titular = titular;
        this.monto = monto;
    }
    public void retirar(double monto){
       if(this.monto >= monto)
        this.monto -= monto;
       else
        System.out.println("Monto insuficiente para realizar el retiro");
    }
    public void depositar(double monto){
        if(monto > 0)
        this.monto += monto;
       else
        System.out.println("No se puede realizar el deposito!");
    }
    public void imprimirSaldo(){
        System.out.println("Tu saldo es: " + monto);
    }
}
