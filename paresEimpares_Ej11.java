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
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantos numeros deseas ingresar? ");
        int a = sc.nextInt();
        int arreglo[] =  new int[a];
        int x[] = new int[a];
        int c[] = new int [a];
        int q=0, w =0;
        for (int i = 0; i < arreglo.length; i++) {
           arreglo[i]= sc.nextInt();
           
           if(arreglo[i]%2==0){
           c[q]=arreglo[i];
           q++;
           }else if(arreglo[i]%2!=0){
            x[w] = arreglo[i];
            w++;
        }
            
    }
       System.out.print(Arrays.toString(x));
        System.out.print(Arrays.toString(c));
    }
}
