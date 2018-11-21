package e1;

import java.util.Scanner;



public class Ejercicio1 {
   
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int ini = sc.nextInt();
    int fin = sc.nextInt();
      Ejercicio1 obj = new Ejercicio1();
      obj.imprimir(ini,fin);
   
   }
   
   public void imprimir(int x,int fin)
   {
       System.out.println(x);
       if(x<fin){
       imprimir(x+1,fin);
       }
       }
}
