package de.neuefische;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Aufgabe

        int[] zahlen = new int[] {9,1,8,2,7,3,6,4,5};



        //Zahlen sortieren
        System.out.println("Sorted: ");
        System.out.println (Arrays.stream(zahlen).sorted());

        //Summe aller Zahlen berechnen
        System.out.println("Summe:");
        System.out.println(Arrays.stream(zahlen).sum());

        // Multipliziere alle Zahlen
        System.out.println("Produkt:");
        System.out.println(Arrays.stream(zahlen).sum());
        }




        /*
        System.out.println("Words");
        words.stream().forEach(word -> System.out.println(word));

        System.out.println("Word lengths");
        words.stream().forEach(word -> System.out.println(word.length()));
*/



    }
