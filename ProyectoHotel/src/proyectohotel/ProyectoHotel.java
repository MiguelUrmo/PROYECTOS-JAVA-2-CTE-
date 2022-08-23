
package proyectohotel;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProyectoHotel {
    static void reinicio(){
    }
   
    public static void main(String[] args) {
         Scanner alter = new Scanner(System.in);
        int alternativa,cant_noches=0,numero_adultos=0,numero_ninos=0,numero_Hab=0,precio=0;
        String NombreTi="",CC="",Tipo_Hab="";
        boolean cancelar=false;
       Datos persona1=new Datos (cant_noches,numero_adultos,numero_ninos,Tipo_Hab,numero_Hab,precio);
       DatosTitular propio=new DatosTitular(NombreTi,CC);
    while (!cancelar){
        System.out.println("Buenas tardes usuario,bienvenido a nuestra pagina de reservas");
        propio.Name(NombreTi);
        propio.Cedula(CC);
        System.out.println("Nos da mucho gusto que nos hayas elegido para hacer su reserva ");
        System.out.println("Digite el numero de adultos que viajan: ");
        numero_adultos=alter.nextInt();
        System.out.println("Digite el numero de ninos que viajaran: ");
        numero_ninos=alter.nextInt();
        System.out.println("Seleccione el tipo de habitacion que desea: ");
        System.out.println("1.Sencilla 2.Doble 3.Cuadruple 4.Cancelar");
        System.out.println ("");
        System.out.println("Digite la alternativa que desea:");
        alternativa=alter.nextInt();
            switch (alternativa){
            case 1:
                System.out.print("Usted ha seleccionado la habitacion sencilla");
                System.out.println(" Esta consta de una cama sencilla, television y baño con agua caliente");
                precio=25000;
                System.out.println("El precio por noche de esta habitacion es de: "+ precio+" (Cada persona)");
                System.out.println("");
                System.out.println("¿Cuantas habitaciones de este tipo quiere reservar?");
                numero_Hab=alter.nextInt();
                System.out.println("");
                System.out.println ("¿Durante cuanto tiempo se hospedará?");
                cant_noches=alter.nextInt();
                int diaent,mesent,diasal,messal;
                System.out.println("Digite dia de llegada");
                diaent=alter.nextInt();
                System.out.println("Escriba mes de llegada");
                mesent=alter.nextInt();
                System.out.println("Digite dia de salida");
                diasal=alter.nextInt();
                System.out.println("Escriba mes de salida");
                messal=alter.nextInt();
                System.out.println("");
                propio.DatosPersonales();
                if (numero_ninos>0){
                    int PTotal=((numero_adultos+numero_ninos))*(numero_Hab)*(cant_noches)*(precio);
                    System.out.println("EL precio por persona para la habitacion es de "+precio 
                        +"\nPor lo que el precio de "+numero_Hab+" es de: "+(precio*numero_Hab)
                +"\nEl Precio total de las "+(cant_noches)+" noches es de: "+ (PTotal));
               System.out.println("La reserva se hizó del dia "+diaent+"/"+mesent+" hasta el dia "+diasal+"/"+messal);
                }else{
                    int PTotal=(numero_adultos)*(numero_Hab)*(cant_noches)*(precio);
                System.out.println("EL precio por persona para la habitacion es de "+precio 
                        +"\nPor lo que el precio de "+numero_Hab+" es de: "+(precio*numero_Hab)
                +"\nEl Precio total de las "+(cant_noches)+" noches es de: "+ (PTotal));
                System.out.println("La reserva se hizó del dia "+diaent+"/"+mesent+" hasta el dia "+diasal+"/"+messal);
                System.out.println("Gracias por su reservación");
                break;      
            
                }
            }
            switch (alternativa){
                case 2:
                System.out.print("Usted ha seleccionado la habitacion doble");
                System.out.println(" Esta consta de una cama doble, television y baño con agua caliente. Aunque si usted lo prefiere, puede obtar por un camarote en lugar de la cama");
                precio=32000;
                System.out.println("El precio por noche de esta habitacion es de: "+ precio+" (Cada persona)");
                System.out.println("");
                System.out.println("¿Cuantas habitaciones de este tipo quiere reservar?");
                numero_Hab=alter.nextInt();
                System.out.println("");
                System.out.println ("¿Durante cuanto tiempo se hospedará?");
                cant_noches=alter.nextInt();
                int diaent,mesent,diasal,messal;
                System.out.println("Digite dia de llegada");
                diaent=alter.nextInt();
                System.out.println("Escriba mes de llegada");
                mesent=alter.nextInt();
                System.out.println("Digite dia de salida");
                diasal=alter.nextInt();
                System.out.println("Escriba mes de salida");
                messal=alter.nextInt();
                System.out.println("");
                propio.DatosPersonales();
                if (numero_ninos>0){
                    int PTotal=((numero_adultos+numero_ninos))*(numero_Hab)*(cant_noches)*(precio);
                    System.out.println("EL precio por persona para la habitacion es de "+precio 
                        +"\nPor lo que el precio de "+numero_Hab+" habitacion/es es de: "+(precio*numero_Hab)
                +"\nEl Precio total de las "+(cant_noches)+" noches es de: "+ (PTotal));
               System.out.println("La reserva se hizó del dia "+diaent+"/"+mesent+" hasta el dia "+diasal+"/"+messal);
               System.out.println("Gracias por realizar su reservación, esperamos no defraudarte y que vuelvas a apoyarte en nosotros para esto");
                }else{
                    int PTotal=(numero_adultos)*(numero_Hab)*(cant_noches)*(precio);
                System.out.println("EL precio por persona para la habitacion es de "+precio 
                        +"\nPor lo que el precio de "+numero_Hab+" habitacion/es es de: "+(precio*numero_Hab)
                +"\nEl Precio total de las "+(cant_noches)+" noches es de: "+ (PTotal));
                System.out.println("La reserva se hizó del dia "+diaent+"/"+mesent+" hasta el dia "+diasal+"/"+messal);
                System.out.println("Gracias por realizar su reservación, esperamos no defraudarte y que vuelvas a apoyarte en nosotros para esto"); 
                break;      
                }
            }
            switch (alternativa){
                case 3:
                System.out.print("Usted ha seleccionado la habitacion triple");
                System.out.println(" Esta consta de dos camas en su interior, una estilo matrimonial y la otra tipo individiual,como todas las habitaciones, cuenta con television y baño con agua caliente.");
                precio=35500;
                System.out.println("El precio por noche de esta habitacion es de: "+ precio+" (Cada persona");
                System.out.println("");
                System.out.println("¿Cuantas habitaciones de este tipo quiere reservar?");
                numero_Hab=alter.nextInt();
                System.out.println("");
                System.out.println ("¿Durante cuanto tiempo se hospedará?");
                cant_noches=alter.nextInt();
                int diaent,mesent,diasal,messal;
                System.out.println("Digite dia de llegada");
                diaent=alter.nextInt();
                System.out.println("Escriba mes de llegada");
                mesent=alter.nextInt();
                System.out.println("Digite dia de salida");
                diasal=alter.nextInt();
                System.out.println("Escriba mes de salida");
                messal=alter.nextInt();
                System.out.println("");
                propio.DatosPersonales();
                if (numero_ninos>0){
                    int PTotal=((numero_adultos+numero_ninos))*(numero_Hab)*(cant_noches)*(precio);
                    System.out.println("EL precio por persona para la habitacion es de "+precio 
                        +"\nPor lo que el precio de "+numero_Hab+" habitacion/es es de: "+(precio*numero_Hab)
                +"\nEl Precio total de las "+(cant_noches)+" noches es de: "+ (PTotal));
               System.out.println("La reserva se hizó del dia "+diaent+"/"+mesent+" hasta el dia "+diasal+"/"+messal);
               System.out.println("Gracias por realizar su reservación, esperamos no defraudarte y que vuelvas a apoyarte en nosotros para esto");
                }else{
                    int PTotal=(numero_adultos)*(numero_Hab)*(cant_noches)*(precio);
                System.out.println("EL precio por persona para la habitacion es de "+precio 
                        +"\nPor lo que el precio de "+numero_Hab+" habitacion/es es de: "+(precio*numero_Hab)
                +"\nEl Precio total de las "+(cant_noches)+" noches es de: "+ (PTotal));
                System.out.println("La reserva se hizó del dia "+diaent+"/"+mesent+" hasta el dia "+diasal+"/"+messal);
                System.out.println("Gracias por realizar su reservación, esperamos no defraudarte y que vuelvas a apoyarte en nosotros para esto"); 
                break;
                }  
            }
            
            char continuar = 's';
        
            while (continuar=='s'){
            reinicio();
            continuar=JOptionPane.showInputDialog(null,"Desea continuar s/n").charAt(0);
            }   
        }
    }
}


        
         
    

