/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

/**
 *
 * @author Phill
 */
public class apoyaIncercion {

    public static void Insercion(int x[]) {
        int aux, i, o;
        for (i = 0; i < x.length; i++) {
            aux = x[i];
            for (o = i - 1; o >= 0 && x[o] < aux; o--) {
                x[o + 1] = x[o];
                x[o] = aux;

            }
            x[o + 1] = aux;

        }

    }

    public int[] Insercion2(int x[]) {
        int aux, i, o;
        for (i = 0; i < x.length; i++) {
            aux = x[i];
            for (o = i - 1; o >= 0 && x[o] < aux; o--) {
                x[o + 1] = x[o];
                x[o] = aux;

            }
            x[o + 1] = aux;

        }

        return x;
    }
}
