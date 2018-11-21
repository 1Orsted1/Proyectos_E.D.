/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class EjOrdenamiento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quiere imprimir en el primer arreglo?");
        int x = sc.nextInt();
        System.out.println("Cuantos numeros quiere imprimir en el segundo arreglo?");
        int y = sc.nextInt();
        int arrea[] = new int[x];
        int arrea2[] = new int[y];
        System.out.println("\n ");
        for (int i = 0; i < x; i++) {
            if (i < x) {
                System.out.println("Ingresa valor del primer arreglo");
                arrea[i] = sc.nextInt();
            }
        }
        System.out.println("\n ");
        for (int j = 0; j < y; j++) {

            if (j < y) {
                System.out.println("ingresa velor del segundo arreglo");
                arrea2[j] = sc.nextInt();

            }
        }
        System.out.println("\n ");
        ordenamiento(arrea, arrea2, x, y);

        Operaciones(arrea, arrea2, x, y);
    }

    private static void Operaciones(int[] arrea, int[] arrea2, int x, int y) {

        if (x == y) {

            for (int i = 0; i < x; i++) {

                arrea[i] = arrea[i] - arrea2[i];

            }

            System.out.println(Arrays.toString(arrea));
        }

        if (x > y) {
            for (int f = 0; f < y; f++) {
                arrea[f] = arrea[f] - arrea2[f];

            }
            System.out.println(Arrays.toString(arrea));
        }

        if (y > x) {

            for (int i = 0; i < x; i++) {

                arrea2[i] = arrea2[i] - arrea[i];

            }
            System.out.println(Arrays.toString(arrea2));

        }

    }

    private static void ordenamiento(int[] arrea, int[] arrea2, int x, int y) {

        int aux, g, o;
        for (g = 0; g < arrea.length; g++) {

            aux = arrea[g];

            for (o = g - 1; o >= 0 && arrea[o] < aux; o--) {
                arrea[o + 1] = arrea[o];
                arrea[o] = aux;

            }
            arrea[o + 1] = aux;

        }

        int aux2, a, b;
        for (a = 0; a < arrea2.length; a++) {

            aux2 = arrea2[a];

            for (b = a - 1; b >= 0 && arrea2[b] < aux2; b--) {
                arrea2[b + 1] = arrea2[b];
                arrea2[b] = aux2;

            }
            arrea2[b + 1] = aux2;

        }

    }

}
