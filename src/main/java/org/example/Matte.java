package org.example;

public class Matte {

    public static void main(String[]args){
        char tal = '3';
        int num_int = Integer.parseInt("" + tal);
        System.out.println (num_int * 4 );

        System.out.println(String.format("B-E says %d + %d = %d", 2, 7, plus(2, 7)));
    }

    private static int plus(int a, int b){
        return a + b;
    }
}

/**
 * Övningsförslag (som bara är om man vill!)
 * 1) Gör en metod minus(int a, int b) som subtraherar b från a och returnerar resultatet. Anropa den och skriv ut resultatet i main-metoden
 * 2) Gör en metod enligt samma mall för multiplikation
 * 3) Använd ovanstående metod i en metod kub(int a) som ger "a upphöjt i tre) - metoden ska använda befintlig multiplikationsmetod och returnera resultatet. (a * a * a är fusk - använd inte!)
 * 4) Gör en metod dela(int a, int b) som kastar ett IllegalStateException (googla "java throw Exception") om nämnaren b är 0 och i annat fall resultatet (som måste vara av typen double eftersom 1 / 2 = 0.5)
 * 5) Gör en metod resultat(int a, int b, int resultat) som returnerar en stäng = "Resultatet av a + b = resultat). Använd String.format för att tillverka strängen. Testa den för alla metoder du gjprt ovan. Funkar den för metoden dela()? Varför / varför inte?
 * 6) Om ovanst. metod inte funkar: kan du göra en variant som funkar? Den kan heta likadant men behöver vara lite annorlunda
 */
