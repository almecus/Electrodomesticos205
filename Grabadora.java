package proyectoelectrodomesticos;

public class Grabadora extends Electrodomestico{
    
    double numerodial = 90.0;
    byte volumen = 0;
    byte volumen1;
    boolean mute;
    boolean encendido;
    int validaencendido;
    String modelo;    
     String emisoras [] = new String [20];
    String  frecuencia [] = new String [20];
    int i;
    int j;
    
    //METODOS
    public String  getEmisoras(){       
            emisoras[0] = "Radio 1"; //88,9
            emisoras[1] = "Blu Radio"; //89,9
            emisoras[2] = "Javeriana Stereo"; //91,9
            emisoras[3] = "Radio Policía Nacional"; //92,9
            emisoras[4] = "RCN Radio"; // 93,9
            emisoras[5] = "La FM"; //94,9
            emisoras[6] = "Radio Nacional de Colombia"; //95,9
            emisoras[7] = "Los 40 Principales"; // 97,4
            emisoras[8] = "RadioActiva"; //97,9
            emisoras[9] = "UN Radio"; //98,5
            emisoras[10] = "W Radio"; //99,9
            emisoras[11] = "Caracol Radio"; //100,9
            emisoras[12]= "Candela Stereo"; //101,9
            emisoras[13] = "Tropicana"; //102,9
            emisoras[14] = "La X"; //103,9
            emisoras[15] = "Amor Stereo"; //104,4
            emisoras[16] = "Vibra"; //104,9
            emisoras[17] = "Rumba Stereo"; //105,4
            emisoras[18] = "Olimpica Stereo"; //105,9
            emisoras[19] = "Uni Tadeo Lozano"; //106,9
            
            for (int i = 0; i < emisoras.length; i++) {
                return emisoras[i];
        }
            return "";
    }            
     
    public String getFrecuencia(){
            frecuencia[0] = "88.9";
            frecuencia[1] = "89.9";
            frecuencia[2] = "91.9";
            frecuencia[3] = "92.9";
            frecuencia[4] = "93.9";
            frecuencia[5] = "94.9";
            frecuencia[6] = "95.9";
            frecuencia [7] =  "97.4";
            frecuencia[8] = "97.9";
            frecuencia[9] = "98.5";
            frecuencia[10] = "99.9";
            frecuencia[11] = "100.9";
            frecuencia[12]= "101.9";
            frecuencia[13] = "102.9";
            frecuencia[14] = "103.9";
            frecuencia[15] = "104.4";
            frecuencia[16] = "104.9";
            frecuencia[17] = "105.4";
            frecuencia[18] = "105.9";
            frecuencia[19] = "106.9";
            
            for (int i = 0; i < frecuencia.length; i++) {
                return frecuencia[i];
            }
            return frecuencia[i];
    }    
    
    public String subirFrecuencia(int numero){
           j++;
        if (j>19) {
            j=0;
            frecuencia[j]=frecuencia[0];
            return emisoras[j] + " en la frecuencia " + frecuencia[j] + " y con volumen " + volumen;       
        }
           return emisoras[j] + " en la frecuencia " + frecuencia[j] + " y con volumen " + volumen;  
    }
    
    public String bajarFrecuencia(int numero){
        j--;
        if (j<0) {
            j=19;
            frecuencia[j]=frecuencia[19];
            return emisoras[j] + " en la frecuencia " + frecuencia[j] + " y con volumen " + volumen;       
        }
           return emisoras[j] + " en la frecuencia " + frecuencia[j] + " y con volumen " + volumen;  
    }
    
    public Grabadora (String marca, String entradaelectrica, String modelo){
        super(marca, entradaelectrica);
        this.modelo = modelo;    
}
    
    @Override
     String encender (int encendido) {
        validaencendido = encendido;
        if (validaencendido==1) {            
           return "Su grabadora está encendida";
        }
        else if (validaencendido==7) {       
            return "Su grabadora está apagada";           
        }
        return "Su grabadora está apagada";
    }
    
    @Override
    public String toString(){
        return encender(validaencendido) + " y tiene volumen " + volumen;
    }
    
    public String setFrecuencia(String emisora){

            for (int i = 0; i < emisoras.length; i++) {
                
                if (emisoras[i].equalsIgnoreCase(emisora)){
                   
                    return emisoras[i] + " en la frecuencia " + frecuencia[i] + " y con volumen" + volumen ;                    
                }
                    
                     
            }
            
            return "Emisora no encontrada";
    }
     
    public String silenciar(int mute){
        
                if (this.mute==true && mute==6) {
            System.out.println("La grabadora ha salido del modo silencio en volumen " + volumen);
            this.mute = false;
        }
        
        else if (mute==6) {
            this.mute = true;
            volumen1 = 0;
            System.out.println("La grabadora está en silencio y en volumen " + volumen1);         
            this.mute = true;
        }
        
        return "";
        
    }
    
    public void subirVolumen(){
        if (volumen == 20) {
            volumen = 20;
            mute = false;
        }
        else{
            volumen++;
            mute = false;
        }
    }
    
    public void bajarVolumen(){
        if (volumen == 0) {
            volumen = 0;     
            mute = false;
        }
        else{
            volumen--;
            mute = false;
        }
    }
        
}

