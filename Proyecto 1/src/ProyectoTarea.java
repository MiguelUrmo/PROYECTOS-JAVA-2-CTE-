import java.util.Scanner;

public class ProyectoTarea {

    
    public static void main(String[] args) {
        int lista[]= new int [6];
        Scanner Valor1= new Scanner (System.in);
        System.out.println("Ingrese el valor de  primera posicion: ");
        int a= Valor1.nextInt();
        lista[0]= a;
      
        Scanner Valor2= new Scanner (System.in);
        System.out.println("Ingrese el valor de la segunda posicion: ");
        int b= Valor2.nextInt();
        lista[1]= b;
        
        Scanner Valor3= new Scanner (System.in);
        System.out.println("Ingrese el valor de la tercera posicion: ");
        int c= Valor3.nextInt();
        lista[2]= c;
        
        Scanner Valor4= new Scanner (System.in);
        System.out.println("Ingrese el valor de la cuarta posicion: ");
        int d= Valor4.nextInt();
        lista[3]= d;
       
        Scanner Valor5= new Scanner (System.in);
        System.out.println("Ingrese el valor de la quinta posicion: ");
        int e= Valor5.nextInt();
        lista[4]= e;
        
        Scanner Valor6= new Scanner (System.in);
        System.out.println("Ingrese el valor de la ultima posicion: ");
        int f= Valor6.nextInt();
        lista[5]= f;
        System.out.println("\nLos elementos del arreglo son: ");
        for (int i=0;i<lista.length;i++){
        System.out.print(lista[i]+" ");
        }
    } 
}

