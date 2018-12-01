/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

//import static e1.apoyoBurbuja.burbuja;
//import static e1.apoyoBurbuja.mostrar;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class Burbuja {

    public static void main(String args[]) {
        apoyoBurbuja bj = new apoyoBurbuja();
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos numeros se van a ingresar");
        int x = sc.nextInt();
        int c[] = new int[x];
        for (int a = 0; a < x; a++) {
            c[a] = sc.nextInt();
        }

        c = bj.burbuja(c);

        System.out.println(Arrays.toString(c));
//int b[] = {21,28,36,15,2,95,7,1};

        //burbuja(c);
        //mostrar(c);
    }
    /*public static void burbuja(int c[]){

		for (int i=0; i<c.length ; i++) {
			for (int j=0;j<c.length-1;j++ ) {
				if(c[j]<c[j+1]){
					int aux =c[j];
					c[j] = c[j+1];
					c[j+1]= aux;
				}				
			}
		}

}
public static void mostrar(int c[]){
	for (int i=0;i<c.length ;i++ ) {
		System.out.print(c[i]+" ");
	}System.out.print(" ");


}

}*/
}
