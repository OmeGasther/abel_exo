package exo5.abel;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Random randomNumbers = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Je pense à un nombre entre 0 et 100 inclus. Devinez lequel.");
        int nb_dev = randomNumbers.nextInt(100);
        System.out.println("entré un nombre : ");
        int nmb = scanner.nextInt();
        System.out.println("vous penser a : " + nmb);
        System.out.println("je pensé a : " + nb_dev);
        int rest = nb_dev - nmb;
        if (rest == 0) {
            System.out.println("bravo tu a parfaitement deviné !");
        }

        else {
            System.out.println("Vous étiez à " + rest + " de la bonne réponse.");
        }
        scanner.close();
    }

}
