/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

import java.util.Arrays;
import java.util.Scanner;
import static e1.apoyaIncercion.Insercion;

/**
 *
 * @author Phill
 */
public class paresEimpares_Ej11 {
  
    public static void main(String[] args) {
        int n = 0;
        apoyoBurbuja bj = new apoyoBurbuja();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("numero a ingresar mayor a 10 ");
            n = sc.nextInt();

        } while (n < 10);
       
        int arre[] = new int[n];
        int f = 0, g = 0;
        int q = 1;
        for (int i = 0; i < n; i++, q++) {
            System.out.println("ingresa el valor " + q);
            arre[i] = sc.nextInt();
            if (arre[i] % 2 == 0) {

                f++;

            } if(arre[i] % 2 != 0) {

                g++;
            }

        }
       
        int c[] = new int[f];
        int x[] = new int[g];
        int k = 0;
        int m = 0;
        
        for (int i = 0; i < n; i++) {
            if (arre[i] % 2 == 0) {

                c[k] = arre[i];
                k++;
            }
        }
        for (int j = 0; j < n; j++) {
          if(arre[j] % 2 != 0) {

               x[m] = arre[j];
               m++;
            }        
            }
        
        c = bj.burbuja(c);
        Insercion(x);
        System.out.print("arreglo de impares: ");
        System.out.print("[");
        for (int i = 0; i < x.length; i++) {

            System.out.print(x[i]+", ");

        }
         System.out.print("]");
        System.out.print(" arreglo de pares: ");
        System.out.print(Arrays.toString(c));
      
    }

}
