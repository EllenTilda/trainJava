package org.example;

import java.util.SplittableRandom;

public class TrimM {
    public static void main(String[] args) {
        String myStr = "     Hej på dig ";
        System.out.println(myStr);
        System.out.println(myStr.trim());

        System.out.println("Min slumpade sträng: " + generateRandomStringOfLength(10));

    }

    static String generateRandomStringOfLength(int generateStringOfThisLenght) {
        SplittableRandom randomGenerator = new SplittableRandom(System.currentTimeMillis()); // Slumptalsgenerator
        StringBuilder stringBuilder = new StringBuilder(); // En bra klass för att bygga strängar effektivt
        String valueSpace = "ABCDEFGHIJKLMNOPQRSTUVXYZ"; // Värderymden, dvs de bokstäver som är möjliga att slumpa en i taget ur

        for (int i = 0; i < generateStringOfThisLenght; i++) {
            int randomStringIndex = randomGenerator.nextInt(0, valueSpace.length()); // Slumpa index för bokstav i värderymdssträngen
            stringBuilder.append(
                " => man kan lägga till grejer här för att bygga en sträng <= " // <= ta bort
                //  ???; // <= ersätt ??? med en sats som plockar ut rätt bokstav ur värderymddssträngen (tips: du har använt den redan)
            );
        }

        return stringBuilder.toString();
    }
}
//klarar inte av mellanrum, bara i början och slutet <= Korrekt! ;)
/**
 * Utforska String-klassens metoder (undersök = gör utskrift av):
 * 1) Vad ger "myStr.trim().charAt(0)"? Varför? Kan du gissa vad "myStr.trim().charAt(myStr.length() - 1)" ger?
 * 2) Undersök metoderna toUpperCase() och toLowerCase()
 * 3) Undersök vilket värde "A".compareTo("B") ger. Kasta om - vilket värde? Jämför "A" med "A" - värde?
 * 4) Jämför lite olika strängar och se om du kan lista ut hur lexikografisk jämförelse funkar.
 * 5) Läs på: https://www.w3schools.com/java/ref_string_compareto.asp
 * 6) Undersök metoderna "equals(..)" och "equalsIgnoreCase(..)"
 * 7) Man kan jämföra heltal med 6 == 6 t.ex. Googla och fundera på varför "apa" == "apa" inte är en bra idé (för där ska man använda equals(..))
 * 8) Komplettera metoden "generateRandomStringOfLength" med en sats så att den blir fungerande.
 */
