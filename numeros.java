package e1;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class numeros {

    int p = 1, t = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        numeros num = new numeros();
        num.mostrar2(x);

    }

    private void mostrar2(int x) {
        int y = x;

        if (p <= x) {
            site3(p, y, x);
            System.out.println(" ");
            p = p + 1;
            t = 0;
            mostrar2(x);
        }
    }

    private void site3(int p, int y, int x) {
        if (y > p) {
            System.out.print(0 + "  ");
            y -= 1;
            site3(p, y, x);
        }
        if (t < x && t < p) {

            t += 1;
            System.out.print(t + "  ");

            site3(p, y, x);
        }

    }

}
