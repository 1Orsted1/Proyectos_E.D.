package e1;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class EncontrarNumero {
   static int y=0,w=0,g=0;
   boolean aqui = false;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n[] = new int[x];
        EncontrarNumero en = new EncontrarNumero();
        en.registrar(x,n);
        int z=sc.nextInt();
        
        en.buscar(x,n,z);
        
    }

    private void registrar(int x,int n[]) {
    Scanner sc2 = new Scanner(System.in);
        
    n[y]=sc2.nextInt();
    y+=1;
        if(y<x){
        
        registrar(x,n);
        }

    }
     private void buscar(int x, int[] n, int z) {
        if(aqui == false){
            System.out.println("no se encuentra 0");
        }
        if(n[w]==z){
            g=w+1;
            System.out.println("posicion "+g);
            aqui=true;
        } else if(n[w]<x){
        w+=1;
        buscar(x,n,z);
        }
      
    }
    
    
}
