package e1;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class Arbol {

    static int p = 0, t = 0, s = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        Arbol ar = new Arbol();

        ar.mostrar1(x);

    }

    private void mostrar1(int x) {
        int y = 0;

        if (t < x) {
            System.out.print(" ");
            t++;
            mostrar1(x);
        }

        if (p < x) {
            site1(p, y);
            System.out.println("");
            p = p + 1;
            t = 0;
            s++;
            t = t + s;
            mostrar1(x);
        }
    }

    private void site1(int p, int y) {

        if (y <= p) {
            System.out.print("*" + " ");
            y = y + 1;
            site1(p, y);
        }
    }

}
