import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalNumber animalNumber = new AnimalNumber();
        animalNumber.animalNumber();

        AnimalOutput animalOutput = new AnimalOutput();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        animalOutput.animalOutput(number);
    }
}
