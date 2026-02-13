
package eva1_9_cuenta_bancaria;

public class EVA1_9_CUENTA_BANCARIA {

    public static void main(String[] args) {
            Cuenta cuenta = new Cuenta("Señor Raúl", 0);
        cuenta.imprimirSaldo();
        cuenta.depositar(500);
        cuenta.imprimirSaldo();
        cuenta.depositar(200);
        cuenta.imprimirSaldo();
        cuenta.depositar(300);
        cuenta.imprimirSaldo();
        cuenta.retirar(2000);
        cuenta.imprimirSaldo();
        cuenta.depositar(50);
        cuenta.imprimirSaldo();
    }
    
}
