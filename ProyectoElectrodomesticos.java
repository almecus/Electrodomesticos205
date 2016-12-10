
package proyectoelectrodomesticos;
import java.util.Scanner;
public class ProyectoElectrodomesticos {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
   
        Televisor tv1 = new Televisor (70, 45, "Sony", "120VAC");
        System.out.println( tv1 + "Las pulgadas del TV son: " + tv1.calcularDiagonal()+"\"" );
        System.out.println("");
         int encender;
         do {
        System.out.println("Digite 1 para encender el televisor");
        encender = read.nextInt();
        tv1.encender(encender);
            System.out.println("");
        } while (encender!=1);
        System.out.println(tv1);
        
   
        int opcion=0;
        do {
            System.out.println("Ingrese la opción de su preferencia");
            System.out.println("------------------------------------");
            System.out.println("1. Encender/Apagar");
            System.out.println("2. Subir volumen");
            System.out.println("2. Bajar volumen");
            System.out.println("3. Subir canal");
            System.out.println("4. Bajar canal");
            System.out.println("5. Silenciar");
            System.out.println("7. Cambiar Canal");            
            System.out.println("------------------------------------");
            opcion = read.nextInt();
            read.nextLine();
            
            if (opcion == 2) {
                tv1.subirVol();
                System.out.println(tv1);
            }
            if (opcion == 3) {
                tv1.bajarVol();
                System.out.println(tv1);
            }
            if (opcion == 4) {
                tv1.subirCanal();
                System.out.println(tv1);
            }
            if (opcion == 5) {
                tv1.bajarCanal();
                System.out.println(tv1);
            }
            if (opcion == 6) {
                System.out.println(tv1.silenciar(opcion));
            }
            
            if (opcion == 7) {
                System.out.println("Ingrese el número del canal");
                int numerocanal = read.nextInt();
                tv1.cambiarCanal(numerocanal);
                System.out.println(tv1);                
            }
            
        } while (opcion != 1);
        if (opcion == 1) {
            System.out.println("Su televisor está apagado");

        }
        
//        PROYECTO GRABADORA
        
            Grabadora gb1 = new Grabadora ("LG", "120VAC", "KW345CS");
            System.out.println( gb1 + " es marca " + gb1.getMarca() + ", la entrada eléctrica es de " + gb1.getEntradaElectrica());
            int op;
            do {
                System.out.println("Por favor, para encender su grabadora, presione 1");
                op = read.nextInt();
                gb1.encender(op);
                System.out.println(gb1);
            
        } while (op !=1);
            
            System.out.println(gb1.getEmisoras() + " en la frecuencia " + gb1.getFrecuencia());
            
//            for (int i = 0; i < 10; i++) {
//            System.out.println(gb1.subirFrecuencia(1));
//        }
//                        
//            System.out.println("esta bajando la emisora " + gb1.bajarFrecuencia(1));
//            
            
            
            do {
//                System.out.println("Recuerde que el dial cambia de 5 en 5 con valores entre 90,0 y 107,0");
                System.out.println("Ingrese la opción de su preferencia");
                System.out.println("------------------------------------");
                System.out.println("1. Apagar/Encender");
                System.out.println("2. Subir Frecuencia");
                System.out.println("3. Bajar Frecuencia");
                System.out.println("4. Subir volumen");
                System.out.println("5. Bajar volumen");
                System.out.println("6. Silenciar");
                System.out.println("7. Ingresar Frecuencia");                
                System.out.println("------------------------------------");
                opcion = read.nextInt();
                read.nextLine();
                
                if (opcion==2) {
                    System.out.println(gb1.subirFrecuencia(1));                    
                }
                
                if (opcion == 3) {
                    System.out.println(gb1.bajarFrecuencia(1));                                       
                }
                
                if (opcion == 4) {
                    gb1.subirVolumen();
                    System.out.println(gb1);                    
                }
                
                if (opcion == 5) {
                    gb1.bajarVolumen();
                    System.out.println(gb1);                    
                }
                
                if (opcion == 6) {             
                    System.out.println(gb1.silenciar(opcion));
                }
                
                if (opcion == 7) {
                    System.out.println("ingrese el nombre de la emisora");
                    String emisora = read.nextLine();
                    System.out.println(gb1.setFrecuencia(emisora));
              
                }
            
        } while (opcion != 1);
            if (opcion == 1) {
            System.out.println("Su grabadora está apagada");

        }         
    }
    
}

