package org.example;

public class DelaUppIMetoder {

    public static void main(String[] args) {
        testaCharTillSträng();
        testaContains();
        testaslutarMed();
        testaIndex();
        testaEquals();
        testaLikamed();
        testaSistaIndex();
        testaSmåStora();



    }

    public static void testaCharTillSträng() {
        char myChar = '2';
        System.out.println(myChar + "");
    }

    public static void testaContains() {
        String m = "envis";
        System.out.println(m.contains("vis"));
    }

    public static void testaslutarMed(){
        String myStr = "abcde";
        System.out.println(myStr.endsWith("e"));
    }

    public static void testaIndex(){
        String myStr = "Hej planet Jorden, du är en bra planet";
        System.out.println(myStr.indexOf("planet"));
    }
    public static void testaEquals(){
        String myStr1 = "abcde";
        String myStr2 = "abcde";
        String myStr3 = "fitta";

        System.out.println(myStr1.equals(myStr2));
        System.out.println(myStr1.equals(myStr3));
    }
   public static void testaLikamed(){
       String myStr1 = "hejsan";
       String myStr2 = "HEJSAN";
       String myStr3 = "HejSan";
       System.out.println(myStr1.equalsIgnoreCase(myStr2));
       System.out.println(myStr1.equalsIgnoreCase(myStr3));


    }
    public static void testaSistaIndex(){
        String myStr = "Hej fina pappa, du är en bra pappa";
        System.out.println(myStr.lastIndexOf("pappa"));
    }

    public static void testaSmåStora(){
        String myStr = "Hej Pappa";
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());
    }

}
