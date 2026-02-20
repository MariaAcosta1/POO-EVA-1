
package eva1_11_static;

public class EVA1_11_STATIC {
    public int x = 100;
    public static void main(String[] args) {
        System.out.println("+++++MATH+++++");
        //Math math = new Math();
        System.out.println("PI = " + Math.PI);
        System.out.println("Random = " + Math.random());
        System.out.println("Cuadrado(5) = " + Math.pow(5,2));
        System.out.println("*****MATH*****");
        System.out.println("PI = " + Matematicas.PI);
        //Matematicas mate = new Matematicas();//INSTANCIACION
        //System.out.println("PI = " + mate.PI);
        Matematicas mate = new Matematicas();
        System.out.println("Cuadrado de 5 = " + mate.cuadrado(5));
        EVA1_11_STATIC obj = new EVA1_11_STATIC();
        System.out.println("X = " + obj.x);
    }
    
}
//static --> nos sitve para crear utilerias, sin necesidad de crear objetos
class Matematicas{
    public static final double PI = 3.1416;
    public double cuadrado(double valor){
        return valor * valor;
    }
}