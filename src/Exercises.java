import java.util.ArrayList;

public class Exercises {
    // Dette er filen med opgaverne. I skal ikke arbejde i andre filer.

    // Variablen herunder bestemmer om du ser testværdierne.
    // Der er mange testværdier til hver opgave, så den er sat til false for at holde outputtet kompakt.
    // Hvis I gerne vil se hvilke værdier jeres metoder får som input, kan I sætte den til true (på eget ansvar).

    public boolean showTestValues = false;

    // Opgaverne starter herunder.

    /**
     * input er en liste af heltal.
     * Returnér listen sorteret i stigende rækkefølge.
     * F.eks.: {4, 1, 7, 5, 9} -> {1, 4, 5, 7, 9}
     * Denne opgave kan løses med Collections.sort(input). Lad være med det.
     */
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        return input;
    }

    /**
     * input er en String.
     * Returnér samme String, men i omvendt rækkefølge
     * F.eks.: UNF SDC -> CDS FNU
     * Denne opgave kan løses med StringBuilder(input).reverse().toString(). Lad være med det.
     */
    public String reverse(String input) {
        return input;
    }

    /**
     * Input er to heltal a og b.
     * Returnér a opløftet i b'te potens.
     * Denne opgave kan løses med Math.pow(a, b). Lad være med det.
     */
    public int power(int a, int b){
        return 0;
    }

    /**
     * Input er et tal x og en liste af heltal y.
     * Returnér true hvis x er summen af præcis to tal fra listen y. Ellers returnér false.
     */
    public boolean sumFromList(ArrayList<Integer> y,  int x){
        return false;
    }

    /**
     * Input er et heltal n.
     * Returnér det n'te Fibonacci-tal.
     * Reminder: det n'te Fibonacci-tal er summen af de to forrige. Talfølgen starter: 1, 1, 2, 3, 5, 8, 13, 21, ...
     * Husk vi altid starter ved 0 - dvs.:
     * fib(0) = 1
     * fib(1) = 1
     * fib(2) = 2
     * fib(3) = 3
     */
    public int fib(int n){
        return n;
    }

    /**
     * input er en streng.
     * Retunér true hvis strengen er et palindrom - dvs. et sætning som staves ens forfra og bagfra. Ellers false.
     * Vi ser bort fra mellemrum, specialtegn samt store og små bogstaver - men de kan indgå i strengen.
     *
     * Tips:
     * x.replace(a, b) kan bruges til at erstatte alle forekomster af en delstreng a med en anden delstreng b.
     * x.toLowerCase() gør hvad man regner med.
     */
    public boolean pal(String x){
        return false;
    }

    // Hvis der er mere tid...

    /**
     * input er en sorteret liste af alle heltal fra 0 til 99, pånær ét.
     * Returnér det manglende tal.
     * F.eks.: {0, 1, 2, ..., 41, 43, ..., 99} -> 42
     */
    public int missing(ArrayList<Integer> input){
        return 0;
    }

    /**
     * input er en streng.
     * Returnér 1 hvis strengen er et pangram, 2 hvis strengen er et perfekt pangram, og ellers returnér 0.
     * Et pangram er en sætning hvor hvert bogstav fra alfabetet indgår.
     * Et perfekt pangram er en sætning hvor hvert bogstav indgår præcis én gang.
     * Vi bruger det danske alfabet, altså inkl. æ, ø, å.
     */
    public int pangram(String input){
        return 0;
    }

    /**
     * input er et heltal.
     * Returnér tallet skrevet i binær.
     * F.eks.: 78 -> "1001110"
     */
    public String toBinary(int i){
        return "";
    }
}