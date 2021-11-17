package sample.pkg;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] niz = unesi();
        stampaj(niz);
    }

    public static int[] unesi(){
        System.out.print("Enter size of array, please: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter number: ");
            boolean provera = scanner.hasNextInt();
            if(provera){
                niz[i]=scanner.nextInt();
            }
            else{
                System.err.println("You didn't enter number!");
                scanner.next();
            }
        }
        System.out.println();
        scanner.close();
        return niz;
    }

    public static void stampaj(int[] niz){
        for(int i=0;i<niz.length;i++)
            System.out.print(niz[i] + " ");
        System.out.println();
    }

}
