
package e1;

import java.util.Scanner;

public class fibonacci {
   static int res =0;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int fin = sc.nextInt();
        fibonacci fib = new fibonacci();
        fib.imprimir(fin);
        System.out.println(res);
    }
    
    public void  imprimir(int fin){
        res+=fin;
        if(fin>0){
           imprimir(fin-1);
        }
        
    }
}
