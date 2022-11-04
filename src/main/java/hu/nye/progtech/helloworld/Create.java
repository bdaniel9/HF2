package hu.nye.progtech.helloworld;

import java.util.Scanner;

public class Create {
    String nev;
    String nyelv;
    public void bekeres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a neved: ");
        nev = scanner.nextLine();

        System.out.println("Add meg a nyelvet: (hun,eng,haw,ger)");
        nyelv = scanner.nextLine();
    }
    public void kiiratas(){
        switch (nyelv){
            case "hun":
                System.out.println("Szia "+nev+"!");
            case "eng":
                System.out.println("Hello "+nev+"!");
            case "haw":
                System.out.println("Aloha "+nev+"!");
            case "ger":
                System.out.println("Hallo "+nev+"!");
            case "":
                throw new RuntimeException("Nem kaptam nyelvet.\nMagyarul: Szia "+nev+"!");
            default:
                throw new RuntimeException("Ismeretlen nyelv.");
        }
    }
}
