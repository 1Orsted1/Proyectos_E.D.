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
public class apoyoBurbuja {

    public int[] burbuja(int c[]) {

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] < c[j + 1]) {
                    int aux = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = aux;
                }
            }
        }
        return c;
    }

}
