package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Parašyti metodą kurio parametras būtų sveikų skaičių masyvas. Metodas turi
        //grąžinti mažiausią masyvo skaičių.
        Main objektas= new Main();
        System.out.println("Nurodykite masyvo dydį");
        Scanner sc =new Scanner(System.in);
        int dydis = sc.nextInt();
        int [] mas= new int [dydis];
        for (int i=0;i<mas.length;i++){
            try{
                System.out.println("Iveskite sveikaji" + i + "masyvo skaiciu");
                mas[i]=sc.nextInt();
            }catch (Exception klaida){
                System.out.println("Ivedete ne sveikaji skaiciu");

            }

        }System.out.println("Maziausias skaicius: " + maziausiasSkaicius(mas));
    }
    public static int maziausiasSkaicius(int mas[]){
        int maziausias =0;
        for(int i =0; i<mas.length; i++){
            if(maziausias>mas[i]);
            maziausias=mas[i];
        }return maziausias;


    }
}
