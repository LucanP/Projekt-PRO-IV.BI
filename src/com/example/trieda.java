package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class trieda {
    public static void main(String[] args) {


        List A = new ArrayList();
        List B = new ArrayList();
        List C = new ArrayList();

        while (true) {

            System.out.println("Zoznam žiakov A triedy: ");
            System.out.println(A);
            System.out.println("Zoznam žiakov B triedy: ");
            System.out.println(B);
            System.out.println("Zoznam žiakov C triedy: ");
            System.out.println(C);

            System.out.println("Na zadanie nového žiaka, zadajte na klávesnici 1");
            System.out.println("Na vymazanie žiaka zo zoznamu, zadajte na klávesnici 2");
            System.out.println("Na ukončenie programu zadajte 0");

            Scanner scan = new Scanner(System.in);
            int klavesa = scan.nextInt();

            if (klavesa == 1) {


                System.out.println("Zadajte triedu");
                Scanner trieda = new Scanner(System.in);
                String trieda1 = trieda.next();

                if (trieda1.equals("A")) {

                    System.out.println("Na zadanie nového žiaka do zoznamu, napíšte jeho meno.");
                    Scanner scan2 = new Scanner(System.in);
                    String meno = scan2.next();
                    A.add(meno);
                    System.out.println(A);
                }
                else if (trieda1.equals("B")) {
                    System.out.println("Na zadanie nového žiaka do zoznamu, napíšte jeho meno.");
                    Scanner scan2 = new Scanner(System.in);
                    String meno = scan2.next();
                    B.add(meno);
                    System.out.println(B);
                }
                else if (trieda1.equals("C")) {
                    System.out.println("Na zadanie nového žiaka do zoznamu, napíšte jeho meno.");
                    Scanner scan2 = new Scanner(System.in);
                    String meno = scan2.next();
                    C.add(meno);
                    System.out.println(C);
                }
                else {

                }

            }
            else if (klavesa == 2) {

                System.out.println("Zadajte triedu");
                Scanner trieda = new Scanner(System.in);
                String trieda1 = trieda.next();

                if (trieda1.equals("A")) {
                    System.out.println("Na vymazanie žiaka zo zoznamu napíšte jeho meno");
                    Scanner scan3 = new Scanner(System.in);
                    String meno = scan3.next();
                    A.remove(meno);
                    System.out.println(A);
                }
                else if (trieda1.equals("B")) {
                    System.out.println("Na vymazanie žiaka zo zoznamu napíšte jeho meno");
                    Scanner scan3 = new Scanner(System.in);
                    String meno = scan3.next();
                    B.remove(meno);
                    System.out.println(B);
                }
                else if (trieda1.equals("C")) {
                    System.out.println("Na vymazanie žiaka zo zoznamu napíšte jeho meno");
                    Scanner scan3 = new Scanner(System.in);
                    String meno = scan3.next();
                    C.remove(meno);
                    System.out.println(C);
                }
                else {

                }
            }

            else if (klavesa == 0) {
                break;
            }

            else {

            }
        }
    }
}
