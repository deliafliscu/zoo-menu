import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a name to the hedgehog:");
        String name = scanner.nextLine();

        Hedgehog myHedgehog = new Hedgehog(name);
        myHedgehog.speakM1();
    }
}