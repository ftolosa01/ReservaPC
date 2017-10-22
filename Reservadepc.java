/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadepc;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Reservadepc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro = new Scanner(System.in);
        System.out.println("reserva de pc");
        int n = 11;
        int opcion;
        int i ;
        int reserva [] = new int [n];
        for (i = 1 ; i < n ; i++){
            reserva[i] = 0;
        }
        do{
            
        System.out.println("1 - reserva de pc  2 - liberar pc - 3 - cerrar - 4 - mostrar estados");
        opcion = intro.nextInt();
        if(opcion < 1 && opcion > 4){
                    System.out.println("favor ingresar opcion entre 1 y 4");
                }
                switch(opcion){
                    case 1 :    
                        System.out.println("ingrese el pc que a reservar");
                        i = intro.nextInt();
                        do{
                        if (reserva[i] == 0 ){
                         reserva[i]= 1; 
                         break;
                        }else
                        System.out.println("pc acupado seleccione otro");
                        i = intro.nextInt();
                        }while (reserva[i] == 1 );  
                        break;
                    case 2 :
                        System.out.println("ingrese pc a liberar");
                        i = intro.nextInt();
                        do{
                            if (reserva[i] == 1){
                                reserva[i]= 0;
                                break;
                            }else
                            System.out.println("pc desocupado seleccione otro");
                        i = intro.nextInt();    
                        }while (reserva[i] == 0)  ;                  
                        break;
                    case 3 :
                        opcion = 3;
                        break;
                    case 4 :
                        for (i = 1; i < n; i++) {
                            System.out.println(" estados pc numero " + i + " es " + reserva[i]);
                        }
                        break;              
           }
                
        }while (opcion != 3 || opcion < 1 && opcion > 4);
            
    }
    
}

