package hu.nye.progtech.helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nev;
        String nyelv;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a neved: ");
        nev = scanner.nextLine();

        System.out.println("Add meg a nyelvet: (hun,eng,haw,ger)");
        nyelv = scanner.nextLine();

        if (nyelv.equals("hun")) System.out.println("Szia "+nev+"!");
        else if (nyelv.equals("eng")) System.out.println("Hello, "+nev+"!");
        else if (nyelv.equals("haw")) System.out.println("Aloha, "+nev+"!");
        else if (nyelv.equals("ger")) System.out.println("Hallo, "+nev+"!");
        else{
            System.out.println("Ismeretlen nyelv.\nMagyarul: Szia "+nev+"!");
        }
    }
}
