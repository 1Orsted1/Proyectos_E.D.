package e1;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class EncontrarNumero {

    static int y = 0, w = 0, g = 0;
    boolean aqui = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //ingresar el numero de la dimencion del arrelglo
        System.out.println("INGRESAR LA DIMENCION DEL ARREGLO ");
        int x = sc.nextInt();
        int n[] = new int[x];
        EncontrarNumero en = new EncontrarNumero();
        //metodo para registrar
        en.registrar(x, n);
        //ingresar el numero a buscar en el arreglo
        System.out.println("\nINGRESAR EL NUMERO QUE SE DESEA BUSCAR");
        int z = sc.nextInt();
        //metodo para buscar
        en.buscar(x, n, z);

    }

    private void registrar(int x, int n[]) {
        Scanner sc2 = new Scanner(System.in);

        n[y] = sc2.nextInt();
        y += 1;
        if (y < x) {

            registrar(x, n);
        }

    }

    private void buscar(int x, int[] n, int z) {
       
        if (n[w] == z) {
            g = w + 1;
            System.out.println("posicion " + g);
            aqui = true;
        } 
        if (w < x-1) {
            w += 1;
            buscar(x, n, z);
        }else if (aqui == false&&w==x-1) {
            System.out.println("no se encuentra 0");

        }
    }

}
