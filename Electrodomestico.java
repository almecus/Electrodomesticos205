package proyectoelectrodomesticos;

public abstract class Electrodomestico {
    private String marca;
    private String modelo;
    private String serial;
    private String entradaelectrica;
    
    public Electrodomestico (String marca, String entradaelectrica){
        this.marca = marca;
        this.entradaelectrica = entradaelectrica;
    }

abstract String encender(int encender);

public String getMarca(){
    return marca;
}

public String getEntradaElectrica(){
    return entradaelectrica;
}  
    
}


