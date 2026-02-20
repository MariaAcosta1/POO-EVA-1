
package eva1_12_temp;

public class EVA1_12_TEMP {

    public static void main(String[] args) {
        //Temperatura temp = new Temperatura();
        System.out.println("50°C = " + Temperatura.centAFahr(50) + "°F");
        System.out.println("50°C = " + Temperatura.FahrACel(50) + "°C");
        System.out.println("50°C = " + Temperatura.CelaKelv(50) + "°C");
        System.out.println("50°C = " + Temperatura.KelvaCel(50) + "°C");
        System.out.println("50°C = " + Temperatura.FahraKelv(50) + "K");
        System.out.println("50°C = " + Temperatura.KelvaFahr(50) + "°F");
    }
    
}

class Temperatura{
    public static double centAFahr(double centigrados){
        double resultado;
        resultado = (centigrados * (9.0/5.0)) + 32;
        return resultado;
    }
    public static double FahrACel(double fahrenheit){
        double resultado;
        resultado = ((9.0/5.0) * (fahrenheit + 32));
        return resultado;
    }
    public static double CelaKelv(double centigrados){
        double resultado;
        resultado = (centigrados + 273.15);
        return resultado;
    }
    public static double KelvaCel(double Kelvin){
        double resultado;
        resultado = (Kelvin - 273.15);
        return resultado;
    }
    public static double FahraKelv(double fahrenheit){
        double resultado;
        resultado = ((9.0/5.0) * (fahrenheit - 32) + 273.15);
        return resultado;
    }
    public static double KelvaFahr(double Kelvin){
        double resultado;
        resultado = ((9.0/5.0) * (Kelvin - 273.15) + 32);
        return resultado;
    }
}