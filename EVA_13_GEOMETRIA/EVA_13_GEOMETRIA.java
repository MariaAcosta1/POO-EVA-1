
package eva_13_geometria;

public class EVA_13_GEOMETRIA {

    public static void main(String[] args) {
        System.out.println("Area Cuadrado = " + AreayP.CuadradoA(5) + " Perimetro = " + AreayP.CuadradoP(5));
        System.out.println("Area Rectangulo = " + AreayP.RectanguloA(5, 8) + " Perimetro = " + AreayP.RectanguloP(5, 8));
        System.out.println("Area Triangulo = " + AreayP.TrianguloA(5, 7) + " Perimetro = " + AreayP.TrianguloP(3, 2, 1));
        System.out.println("Area Circulo = " + AreayP.CirculoA(5.8) + " Circurferencia = " + AreayP.CirculoP(7.7));
        System.out.println("Area Rombo = " + AreayP.Rombo(2, 7));
        System.out.println("Area Trapecio = " + AreayP.Trapecio(3, 2));
    }
    
}

class AreayP{
    public static double CuadradoA(double lado){
        double Area;
        Area = (lado * lado);
        return Area;
    }
    public static double CuadradoP(double lado){
        double Perimetro;
        Perimetro = 4 * lado;
        return Perimetro;
    }
    public static double RectanguloA(double base, double altura){
        double Area;
        Area = (base * altura);
        return Area;
    }
    public static double RectanguloP(double base, double altura){
        double Perimetro;
        Perimetro = (2 * base) * (2 * altura);
        return Perimetro;
    }
    public static double TrianguloA(double base, double altura){
        double Area;
        Area = base * altura / 2;
        return Area;
    }
    public static double TrianguloP(double l1, double l2, double l3){
        double Perimetro;
        Perimetro = l1 + l2 + l3;
        return Perimetro;
    }
    public static double CirculoA(double radio){
        double Area;
        Area = Math.PI * (radio * radio);
        return Area;
    }
    public static double CirculoP(double radio){
        double Perimetro;
        Perimetro = 2 * Math.PI * radio;
        return Perimetro;
    }
    public static double Rombo(double diagonalMa, double diagonalMe){
        double Area;
        Area = diagonalMa * diagonalMe / 2;
        return Area;
    }
    public static double Trapecio(double perimetro, double apotema){
        double Area;
        Area = perimetro * apotema / 2;
        return Area;
    }

}