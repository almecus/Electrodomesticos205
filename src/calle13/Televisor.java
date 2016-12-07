/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calle13;

/**
 *
 * @author SergioIván
 */
public class Televisor extends Electrodomestico {

    private double alto;  //cm
    private double ancho; //cm
    private int diagonal; //inches

    private byte volumen = 0;
    private byte numerocanal = 2;//[];
    //String nombrecanal[];

    boolean mute;
    boolean encendido = false;
     byte voltemp;
    @Override
    void enceder() {
        if (encendido != true) {
            encendido = true;
        } else {
            encendido = false;
        }

    }

    public void calcularDiagonal() {
               
        diagonal=(int)Math.pow(((alto*alto)+(ancho*ancho)),0.5);
        diagonal=(int)(diagonal/2.54); // diagonal = (byte) 47;//Es ejemplo..No sea perezoso, calcules
    }

    public void subirVol() {
        if (mute == false) {
            if (volumen == 100) {
                volumen = 100;
            } else {
                volumen++;
            }
        }
        else{
            mute=false;
            if(voltemp==100)
            {
                volumen=100;
            }
            else{
                volumen=(byte)voltemp++;
            }
        }
    }

    public void bajarVolumen() {
        if(mute==false)
        {
            if(volumen==0)
               volumen=0;
            else{
                volumen--;}
        }
        else{
            mute=false;
      
            if (voltemp == 0) {
                volumen = 0;
            } else {
            volumen=voltemp--;
            }
        }

    }

    public void subirCanal() {
        if (numerocanal == 120) {
            numerocanal = 2;
        } else {
            numerocanal++;
        }

    }

    public void bajarCanal() {
        if (numerocanal == 2) {
            numerocanal = 120;
        } else {
            numerocanal--;
        }
    }
   

    public void silenciar() {

        if (mute == false) {
            mute = true;
            voltemp = volumen;
            volumen = 0;
        } else {
            mute = false;
            volumen = voltemp;
            voltemp = 0;
        }
    }

    public void cambiarCanal(int siguientecanal) 
    {
        if (siguientecanal<2) {
            numerocanal=numerocanal;
        }
        
        else   {
            
        if (siguientecanal>120) {
            numerocanal=numerocanal;
        }
        
        else{
        numerocanal= (byte) siguientecanal;
        }
        
        }
        

    }

    public Televisor(double alto, double ancho, String marca, String entradaelectrica) {
        super(marca, entradaelectrica);
        this.alto = alto;
        this.ancho = ancho;
       // System.out.println("Punse 1 para encender");
        calcularDiagonal();
    }

    @Override
    public String toString() {
        return "------------------\n"
                + "Estado: " + encendido + "\n"
                + "Vol: " + "" + volumen
                + "\n" + "Can: " + numerocanal
                + "\n"+ mute;
    }

    public void mostrarMenu()
    {
        
        if(encendido==true){
        System.out.println("-------------------"
                         +"\n 2- Para Subir Volumen "
                         + "\n 3- Para Bajar Volumen"
                         + "\n 4- Para Subir Canal"
                         + "\n 5- Para Bajar Canal"
                         + "\n 6- Para Mute"
                         + "\n 7- Para Ingresar Canal"
                         + "\n 1- Para Apagar");
        
        }
    }
    
}
