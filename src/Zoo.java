import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Hedgehog> hedgehogs = new ArrayList<>();

    public void addAnimal() {
        System.out.println("Give a name to the hedgehog:");
        String name = scanner.nextLine();

        Hedgehog hedgehog = new Hedgehog(name);
        hedgehogs.add(hedgehog);
    }

    public void listAnimals() {
        for (Hedgehog hedgehog : hedgehogs) {
            System.out.println(hedgehog.getName());
        }
    }

    public void speakM1() {
        System.out.println("What should the hedgehogs say?");

            String speaks = scanner.nextLine();

            if (isInteger(speaks)) {
                System.out.println("I am a hedgehog. I do not understand numbers.");
            }
            else {
                for (Hedgehog hedgehog : hedgehogs) {
                    System.out.println(hedgehog.getName() + ": " + speaks);
                }
            }
        }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
