package me.henrydev;
import java.util.Scanner;


public class Rechner {

        public static void main (String [] args){


            System.out.println("Geben sie die erste Zahl ein");


            Scanner zahl1_1 = new Scanner(System.in);

            double zahl1 = zahl1_1.nextDouble();

            System.out.println ("Zahl 1 = " + zahl1);


            System.out.println("");

            System.out.println("Geben sie die Zweite Zahl ein");


            Scanner zahl2_2  = new Scanner(System.in);

            double zahl2 = zahl2_2.nextDouble();

            System.out.println("Zahl 2 = " + zahl2);


            double erg1 = zahl1 + zahl2;

            double erg2 = zahl1 - zahl2;

            double erg3 = zahl1 * zahl2;

            double erg4 = zahl1 / zahl2;


            System.out.println("");

            System.out.println("Addiren? = 1 ");

            System.out.println("Subtrairen? = 2 ");

            System.out.println("Multipliziren? = 3 ");

            System.out.println("Dividiren? = 4 ");


            Scanner zahl3_3 = new Scanner(System.in);

            int zahl3= zahl3_3.nextInt();

            switch (zahl3)

            {

                case 1: System.out.println(zahl1 + " + " + zahl2 + "=" + erg1);break;

                case 2: System.out.println(zahl1 + " - " + zahl2 + "=" + erg2);break;

                case 3: System.out.println(zahl1 + " * " + zahl2 + "=" + erg3);break;

                case 4: System.out.println(zahl1 + " / " + zahl2 + "=" + erg4);break;



            }


        }

    }





