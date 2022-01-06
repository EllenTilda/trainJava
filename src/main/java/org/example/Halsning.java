package org.example;

import java.util.HashMap;

public class Halsning {

    public static void main(String[]args){
        System.out.println("Hej, hur mår du?");

        HashMap <String, String> svarsAlternativ= new HashMap<>();
        svarsAlternativ.put("Bra", "Härligt!");
        svarsAlternativ.put("Inte bra", "Bajs då!");


        String myAnswer = "Bra";
        String svar = svarsAlternativ.get(myAnswer);
        System.out.println(svar);




    }

}
