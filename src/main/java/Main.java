import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Velkommen til Adventure af Navid...");
        System.out.println("------------------------------------");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Menu:");
        System.out.println("VIS:       - Vis alle brugere ");
        System.out.println("OPRET:     - Opret en ny bruger ");
        System.out.println("FIND:      - Find bruger ");
        System.out.println("REDIGER:   - Eller EDIT bruger  ");
        System.out.println("SLET:      - Slet bruger ");


        do {

            String menuvalg = scanner.nextLine();

            switch (menuvalg) {
                case "vis":
                    System.out.println("Vis alle brugere: ");
                    break;
                case "opret":
                    System.out.println("Opret en ny bruger: ");
                    break;
                case "find":
                    System.out.println("Find en bruger: ");
                    break;
                case "rediger":
                    System.out.println("Rediger eller edit en bruger: ");
                    break;
                case "slet":
                    System.out.println("Slet en bruger: ");
                    break;
            }
        } while (true);

    }
}
