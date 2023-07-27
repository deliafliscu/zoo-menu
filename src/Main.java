import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo myZoo = new Zoo();

        while (true) {
            System.out.println("1) Add a hedgehog, 2) Let them speak, 3) List animals, 0) Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    myZoo.addAnimal();
                    break;

                case 2:
                    myZoo.speakM1();
                    break;

                case 3:
                    myZoo.listAnimals();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}





