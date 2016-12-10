
package proyectoelectrodomesticos;

public class Televisor extends Electrodomestico{
    double alto; // cm
    double ancho; // cm
    int diagonal; // inches
    byte volumen=0;
    byte volumen1;
    byte numerocanal=2;
    //String nombrecanal;
    boolean mute;
    boolean encendido;
    int inicio;
    
    public Televisor(double alto, double ancho, String marca, String entradaelectrica){
        super(marca, entradaelectrica);
        this.alto = alto;
        this.ancho = ancho;
        calcularDiagonal();
    }
    
    @Override
   public String toString(){
       return  encender(inicio) +  "\nLa entrada eléctica es: 120VAC"  + "\nEl volumen es: " + volumen + "\nEl canal es: " + numerocanal +"\n" ;
   }
    
    @Override
             // String msg = encendido? "encendido" : "apagado";
    String encender (int encendido) {
        inicio = encendido;
        if (inicio==1) {            
           return "Estado: encendido";
        }
        else if (inicio==6) {       
            return "Estado: apagado";           
        }
        return "Estado: apagado";
    }     
    
    public int calcularDiagonal(){
        // REALIZAR MÉTODO PARA CALCULAR LAS PULGADAS DEL TELEVISOR
        diagonal = (int) (Math.sqrt((Math.pow(alto, 2) + Math.pow(ancho, 2)))/2.56);
        return diagonal;
    }
    
    public void subirVol(){
        if (volumen==100) {
            volumen=100;     
           mute = false;
        }
        else{
            volumen++;
            mute = false;           
        }
    }
    
    public void bajarVol(){
        if (volumen==0) {
            volumen=0; 
            mute = false;
        }
        else{
            volumen--;
            mute = false;
        }
        
    }
    
    public void subirCanal(){
          if (numerocanal==120) {
            numerocanal=2;
        }
        else{
            numerocanal++;
        }
    }
    
    public void bajarCanal(){
        if (numerocanal==2) {
            numerocanal=120;
        }
        else{
            numerocanal--;
        }
    }
    
    public String silenciar(int mute){
        
        if (this.mute==true && mute==5) {
            System.out.println("El televisor ha salido del modo silencio en volumen " + volumen);
            this.mute = false;
        }        
        else if (mute==5) {
            this.mute = true;
            volumen1 = 0;
            System.out.println("El televisor está en silencio y en volumen " + volumen1);         
            this.mute = true;
        }        
        return "";        
    }
    
    public void cambiarCanal(int siguientecanal){
        if (siguientecanal==0) {
            siguientecanal = numerocanal;
        }
        else if (siguientecanal>=120) {
            siguientecanal = numerocanal;
        }
        
        else if (siguientecanal<2) {
            siguientecanal = numerocanal;
        }
        else{
        numerocanal = (byte)siguientecanal;
        }
    }
           
}


