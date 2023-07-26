import java.util.*;

import static java.lang.System.exit;

public class Hedgehog {

    String name;
    Scanner scanner = new Scanner(System.in);

    public Hedgehog(String name) {
        this.name = name;
        System.out.println("Hi, my name is " + name);
    }

    public static boolean isInteger(String scanner) {
        try {
            Integer.parseInt(scanner);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public void speakM1() {

        System.out.println("What should the hedgehog say? ");
        String speaks = scanner.nextLine();

        while (true) {

            if (isInteger(speaks)) {
                System.out.println("I am a hedgehog. I do not understand numbers.");
            }
            else if (speaks.equalsIgnoreCase("exit")) {
                break;
            }
            else {
                System.out.println(this.name + ": " + speaks);
            }
        }
    }


    public static void speakM2 (String a) {

    }

    public static void speakM3 (int b) {

    }


}
