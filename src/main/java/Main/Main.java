package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ".");
        }

        Scanner scanner = new Scanner(System.in);
        String nev = scanner.nextLine();
        System.out.println("Add meg a neved:");
        System.out.println("Hello " + nev);

        for (int x = 1;x<10;x++){
            if (x%2==0){
                System.out.println("Páros szám: "+x);
            }
        }
    }
}
