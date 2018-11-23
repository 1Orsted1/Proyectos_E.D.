/*
Version final del programa(podria ser peor)
 */
package e1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Orsted
 */
public class paresEimpares_Ej11 {

    public static void main(String[] args) {
        //Importacion de metodos
        apoyoBurbuja bj =new apoyoBurbuja();
        apoyaIncercion in = new apoyaIncercion();
        Scanner sc = new Scanner(System.in);
       //Pide la variable de la dimencion del arreglo mayor a 10
        int a;
        do {
            System.out.println("numero a ingresar mayor a 10 ");
            a = sc.nextInt();

        } while (a < 10);
       
        int arreglo[] = new int[a];
      
        int q = 0, w = 0;
        //for de asignacion del arreglo original
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt();

            if (arreglo[i] % 2 == 0) {
                
                q++;
            } else if (arreglo[i] % 2 != 0) {
                
                w++;
            }
          
        }
        int x[] = new int[w];
        int c[] = new int[q];
        int h=0,s=0;
        //for de asignacion de sub arreglos pares e impares
        for (int i = 0; i < arreglo.length; i++) {
               
            if (arreglo[i] % 2 == 0) {
                c[h] = arreglo[i];
                h++;
            } 
             if (arreglo[i] % 2 != 0) {
                x[s] = arreglo[i];
                s++;
            }
        
        }
          //ordenamientos
          arreglo=in.Insercion2(arreglo);
          x=in.Insercion2(x);
          c=bj.burbuja(c);

        
        //impresion de arreglos
        System.out.println("\nArreglo original ordenado: ");
        System.out.print(Arrays.toString(arreglo)+" \n");
        System.out.println("Arreglo de pares: ");
        System.out.print(Arrays.toString(c)+" \n");
        System.out.println("Arreglo de impres:");
        System.out.print(Arrays.toString(x)+" \n");
        
    }
}
