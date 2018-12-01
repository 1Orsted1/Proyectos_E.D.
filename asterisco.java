/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class asterisco {

    static int p = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        asterisco as = new asterisco();

        as.mostrar(x);
    }

    private void mostrar(int x) {
        int y = 0;

        if (p < x) {
            site(p, y);
            System.out.println(" ");
            p = p + 1;
            mostrar(x);
        }
    }

    private void site(int p, int y) {
        if (y <= p) {
            System.out.print((char) 42 + " ");
            y = y + 1;
            site(p, y);
        }
        if (y == p) {
            y = 0;
        }
    }

}
