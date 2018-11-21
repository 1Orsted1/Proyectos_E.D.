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
public class potencia {
    static int x=1;
    static int y=1,z;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    int n = sc.nextInt();
    int t = sc.nextInt();
    
    potencia po = new potencia();
    po.operaciones(n,t);
        System.out.println(x);
    }

    private void operaciones(int n,int t) {
        x=x*n;
        if(y<t){
        y++;
            System.out.println("1");
        operaciones(n,t);
        
        }
    }
    
}
