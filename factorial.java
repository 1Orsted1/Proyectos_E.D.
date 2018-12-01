package e1;

import java.util.Scanner;

public class factorial {

    static int x = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fin = sc.nextInt();

        factorial fa = new factorial();
        fa.operacion(fin);
        System.out.println(x);

    }

    public void operacion(int fin) {
        x *= fin;
        if (fin == 0) {
            x = 1;
        }
        if (fin > 1) {
            operacion(fin - 1);

        }
    }

}
