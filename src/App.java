import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        
        int numero = random.nextInt(11);
        int numero2 = random.nextInt(11);
        int numero3 = random.nextInt(11);

        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);

        if (numero ==7 || numero2 ==7 || numero3 ==7)
        {
            System.out.println("Onneksi olkoon, voitit pelin!");
        }
        else
        {
            System.out.println("Hävisit pelin.");
        }
        System.out.println("Push 1")
        System.out.println("Push 2")
        System.out.println("Push 3")
        
    }
}
