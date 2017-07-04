import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    // Dette er Main-filen, og den skal du ikke rette i.
    // Du skal heller ikke kigge i den, da den indeholder svarene.
    // Den er ikke tom - koden er længere nede. Lad være med at scrolle ned.
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    // Din snyder! Stop omgående!
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    // Jeg mener det! Det er virkelig ikke sjovt hvis du bare læser svarene.
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    // Måske du bare scroller ned fordi du vil se om der kommer flere sjove beskeder.
    // Det gør der ikke. Dette er den sidste. Hvis du scroller videre, har du officielt snydt.
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    // Fyha! Jeg sladrer til Steffen!


    static Exercises e = new Exercises();

    public static void main(String[] args) {
        printHeader("sort");
        // sort
        boolean assignmentCompleted = true;
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> opg1Input = new ArrayList<Integer>();
            for (int j = 0; j < 10; j++) {
                opg1Input.add((int) (Math.random() * 50));
            }
            ArrayList<Integer> opg1inputClone = (ArrayList<Integer>) opg1Input.clone();
            Collections.sort(opg1inputClone);
            if (!e.sort(opg1Input).equals(opg1inputClone))
                assignmentCompleted = false;
            printResult(opg1Input.toString(), e.sort(opg1Input).toString(), opg1inputClone.toString());

        }
        System.out.println("Opgave \"sort\" fuldført: " + assignmentCompleted);

        printHeader("reverse");
        assignmentCompleted = true;
        String[] strings = {
                "Steffen",
                "UNF Software Development Camp 2017",
                "jeg kan godt lide kage",
                "avaJ i eremmargorp ta tvojs re teD",
                "Dametrold åd lortemad"};
        for (String s : strings) {
            String rev = new StringBuilder(s).reverse().toString();
            printResult(s, e.reverse(s), rev);
            if (!rev.equals(e.reverse(s)))
                assignmentCompleted = false;
        }
        System.out.println("Opgave \"reverse\" fuldført: " + assignmentCompleted);

        printHeader("power");
        assignmentCompleted = true;
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 12);
            int b = (int) (Math.random() * 8);
            int res = e.power(a, b);
            printResult(a + ", " + b, e.power(a, b) + "", ((int) Math.pow(a, b)) + "");
            if (((int) Math.pow(a, b)) != res)
                assignmentCompleted = false;
        }
        System.out.println("Opgave \"power\" fuldført: " + assignmentCompleted);

        printHeader("sumFromList");
        assignmentCompleted = true;
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < 20; j++) {
                list.add((int) (Math.random() * 10000));
            }
            int x;
            if (Math.random() > 0.5) {
                x = (int) (Math.random() * 100000);
            } else {
                x = list.get(0) + list.get(1);
            }
            Collections.shuffle(list);
            boolean res = e.sumFromList(list, x);
            boolean correct = false;
            for (int k = 0; k < (list.size() - 1); k++) {
                for (int l = 0; l < (list.size() - 1); l++) {
                    if (k == l)
                        continue;
                    if ((list.get(k) + list.get(l)) == x) {
                        correct = true;
                    }
                }
            }
            printResult(list.toString(), res + "", correct + "");
            if (res != correct)
                assignmentCompleted = false;
        }

        System.out.println("Opgave \"sumFromList\" fuldført: " + assignmentCompleted);

        printHeader("fib");
        assignmentCompleted = true;
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 30);
            int res = e.fib(x);
            int correct = 1;
            int a = 0;
            int b;
            for (int j = 0; j < x; j++) {
                b = correct;
                correct = correct + a;
                a = b;
            }
            printResult(x + "", res + "", correct + "");
            if (res != correct)
                assignmentCompleted = false;
        }
        System.out.println("Opgave \"fib\" fuldført: " + assignmentCompleted);

        printHeader("pal");
        assignmentCompleted = true;
        String[] strings2 = {
                "System-melding: Gnid lemmet, Søs",
                "Farlig giraf",
                "Karen galede: Fik I pik i fede lagner? Ak!",
                "Ren uld luner!",
                "Amok-igle redder elg i koma",
                "Kaj malkede klam yak",
                "Spar egne penge: Raps!",
                "Nem IT i timen",
                "Mormor, en røv værner om Rom!",
                "Snavset svans"};
        for (String s : strings2) {
            String rev = new StringBuilder(s).reverse().toString();
            String sCopy = s;
            s = s.replace(" ", "").replace("-", "").replace(":", "").replace(",", "").replace("!", "").replace("?", "").toLowerCase();
            rev = rev.replace(" ", "").replace("-", "").replace(":", "").replace(",", "").replace("!", "").replace("?", "").toLowerCase();
            boolean correct = s.equals(rev);
            printResult(sCopy, e.pal(s) + "", correct + "");
            if (correct != e.pal(s))
                assignmentCompleted = false;
        }
        System.out.println("Opgave \"pal\" fuldført: " + assignmentCompleted);

        printHeader("missing");
        assignmentCompleted = true;
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < 100; j++) {
                list.add(j);
            }
            int numberRemoved = (int) (Math.random() * 100);
            list.remove(numberRemoved);
            if (numberRemoved != e.missing(list))
                assignmentCompleted = false;
            printResult(list.toString(), e.missing(list) + "", numberRemoved + "");
        }
        System.out.println("Opgave \"missing\" fuldført: " + assignmentCompleted);

        printHeader("pangram");
        assignmentCompleted = true;
        String[] inputs = {
                "Høj bly gom vandt fræk sexquiz på WC",
                "Quizdeltagerne spiste jordbær med fløde mens cirkusklovnen Walther spillede på xylofon",
                "Kage er godt" // TODO: Hvis tid, tilføj flere testcases
        };
        for (String s : inputs) {
            HashMap<Character, Boolean> alphabet = new HashMap<Character, Boolean>();
            for (int j = 'a'; j <= 'z'; j++) {
                alphabet.put((char) j, false);
            }
            alphabet.put('æ', false);
            alphabet.put('ø', false);
            alphabet.put('å', false);
            boolean perfect = true;
            for (char c : s.toLowerCase().replace(" ", "").toCharArray()) {
                for (char k : alphabet.keySet()) {
                    if (c == k) {
                        if (alphabet.get(k))
                            perfect = false;
                        alphabet.put(k, true);
                    }
                }
            }
            boolean pangram = true;
            for (char c : alphabet.keySet()) {
                if (!alphabet.get(c))
                    pangram = false;
            }
            int res = e.pangram(s);
            int correct = 0;
            if (pangram)
                correct = 1;
            if (perfect && pangram)
                correct = 2;
            printResult(s, res + "", correct + "");
            if (res != correct)
                assignmentCompleted = false;
        }
        System.out.println("Opgave \"pangram\" fuldført: " + assignmentCompleted);

        printHeader("toBinary");
        assignmentCompleted = true;
        for (int i = 0; i < 10; i++) {
            int input = (int) (Math.random() * 100);
            int inputClone = input;
            String res = e.toBinary(input);
            String correct = "";
            while (input > 0) {
                if (input % 2 == 0)
                    correct = "0" + correct;
                else {
                    correct = "1" + correct;
                    input--;
                }
                input /= 2;
            }
            printResult(inputClone + "", res, correct);
            if (!correct.equals(res))
                assignmentCompleted = false;
        }

        System.out.println("Opgave \"toBinary\" fuldført: " + assignmentCompleted);
    }

    private static void printHeader(String s) {
        if (e.showTestValues) {
            System.out.println();
            System.out.println("##############################");
            System.out.println("### " + s);
            System.out.println("##############################");
            System.out.println();
        }
    }

    private static void printResult(String input, String theirAnswer, String correctAnswer) {
        if (!e.showTestValues)
            return;
        System.out.println("Input:        " + input);
        System.out.println("Dit svar:     " + theirAnswer);
        System.out.println("Korrekt svar: " + correctAnswer);
        System.out.println();
    }

}
