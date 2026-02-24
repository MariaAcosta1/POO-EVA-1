/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_tv;

public class TVA {
    private boolean estado;
    private int volumen;
    private int canal;
    
    public TVA(){
        estado = false;
        volumen = 0;
        canal = 0;
    }
    
    public void apagar(){
       /*if(estado == false)
        estado = true;
       else
        estado = false;*/
       estado = !estado;
    }
    public void estadoTV(){
        if(estado)
        System.out.println("La TV esta encendida");
       else
        System.out.println("La TV esta apagada.");   
    }
    public void volumenMinus(){
        if(!estado) {
            System.out.println("TV esta apagada.");
            return;
        }
        if(volumen > 0) {
        volumen--;
        }
        System.out.println("Volumen actual: " + volumen);
    }
    public void volumenPlus(){
        if(!estado) {
            System.out.println("La TV esta apagada.");
            return;
        }
        if(volumen < 100) {
        volumen++;
        }
        System.out.println("Volumen actual: " + volumen);
    }
    public void Volumen(int volumen){
        if(!estado) {
            System.out.println("TV esta apagada. No puedes cambiar el volumen");
            return;
        }
        if(volumen >= 0 && volumen <=100) {
        this.volumen = volumen;
        System.out.println("Volumen actual: " + this.volumen);
        }else{
            System.out.println("Has llegado al limite");
        }
    }
    
    public void canalMinus(){
        if(!estado){
            System.out.println("TV esta apagada.");
            return;
        }
        if (canal == 0)
            canal = 100;
        else 
            canal--;
        System.out.println("Canal actual: " + canal);
    }
    public void canalPlus(){
        if(!estado){
            System.out.println("TV esta apagada.");
            return;
        }
        if (canal == 100)
            canal = 0;
        else 
            canal++;
        System.out.println("Canal actual: " + canal);
    }
    public void Canal(int canal){
        if(!estado){
            System.out.println("TV esta apagada. No se puede cambiar el canal");
            return;
        }
        if (canal >= 0 && canal <=100){
            this.canal = canal;
            System.out.println("Canal actual: " + this.canal);
        }else{
           System.out.println("Canal fuera de rango (0-100)"); 
        }
    }
}
