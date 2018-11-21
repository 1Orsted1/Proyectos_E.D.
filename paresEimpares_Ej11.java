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


//       System.out.println("Cuantos numeros deseas ingresar? ");
//        int a = sc.nextInt();
       
        
        int arreglo[] = new int[a];
        int x[] = new int[a];
        int c[] = new int[a];
        int q = 0, w = 0;
        //unico for de asignacion
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt();

            if (arreglo[i] % 2 == 0) {
                c[q] = arreglo[i];
                q++;
            } else if (arreglo[i] % 2 != 0) {
                x[w] = arreglo[i];
                w++;
            }
        //ordenamientos
          x=in.Insercion2(x);
          c=bj.burbuja(c);  
        }
        //impreciones de arreglos
        System.out.println("Arreglo original: ");
        for (int i = 0; i < arreglo.length; i++) {

            System.out.print(arreglo[i] + ",");

        }
        System.out.println("");
        System.out.println("Pares ordenados: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (c[i]>0) {
                System.out.print(c[i] + ",");
            }
        }
        System.out.println("");
        System.out.println("Impares ordenados: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (x[i] > 0) {
                System.out.print(x[i] + ",");
            }
        }
        System.out.println("");
        
        //otra forma de hacerlo
        //System.out.print(Arrays.toString(x));
        //System.out.print(Arrays.toString(c));
    }
}
