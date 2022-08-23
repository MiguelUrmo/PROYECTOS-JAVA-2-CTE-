
package proyectohotel;

import javax.swing.JOptionPane;


public class DatosTitular {
    String NombreTi;
    String CC;
    public DatosTitular(String NombreTi,String CC){
            this.NombreTi=NombreTi;
            this.CC=CC;
    }
     public void Name(String NombreTi){
        NombreTi=JOptionPane.showInputDialog("Digite el nombre del titular de la reserva: ");
        this.NombreTi=NombreTi;
        }
     public String FName(String NombreTi){
        return NombreTi;
    }
     public void Cedula (String CC){
        CC=JOptionPane.showInputDialog("Digite el numero del documento del titular");
        this.CC=CC;
        }
    public String FCedula (String CC){
        return CC;
    }
    public void DatosPersonales(){
        System.out.println("Nombre del titular de la reserva: "+ NombreTi);
        System.out.println("Número de documento del titular: "+ CC);
        
    }
}