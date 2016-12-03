
package calle13;

public class Lavadora extends Electrodomestico {
    private String ciclocarga [];
    private String ciclovelocidad [] = new String [3];
    private String ciclolavado [] = new String [3];
    private String temperaturaagua;
    private int carga;
    private byte capacidadtanque;
    int inicio;
    boolean encendido = false;
    boolean tanqueagua = false;
    
   
    public String establecerCicloLavado(int ciclo){
        
        if (carga <= 10){
            tanqueagua = true;
            if (tanqueagua==true) {
                System.out.println("El tanque se llenó de agua");
                return ciclovelocidad[0] = "Iniciando ciclo Normal con duracion 4 min";
                
            }
             
        }
        else if (ciclo <= 20) {
            tanqueagua = true;
            if (tanqueagua==true) {
                System.out.println("El tanque se llenó de agua");
                return ciclovelocidad[1] = "Iniciando ciclo Medium con duracion 7 min";
            }
             
        }
        
        else if (ciclo <= 30) {
            tanqueagua = true;
            if (tanqueagua==true) {
                System.out.println("El tanque se llenó de agua");
                return ciclovelocidad[2] = "Iniciando ciclo Heavy con duracion 10 min";
            }
             
        }
        return "";
    } // OK
       
    public Lavadora (String marca, String entradaelectrica){
        super(marca, entradaelectrica);
        
    } 
    
    public int establecerCarga(int carga ){
        this.carga = carga;            
         return this.carga;        
    } //OK
    
    public void remojar(){
        
        
        
    }

    @Override
    void enceder() {
      if (encendido != true) {
            encendido = true;
//            System.out.println("Lavadora encendida");
        } else {
            encendido = false;
//            System.out.println("Lavadora apagada");
        }
    }
       
    @Override
    public String toString(){
        if (encendido==true) {
            return "Encendida";
        }
        else{
            System.out.println("Apagada");
        }
        return "Apagada";
        
    }
    

}
