import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("-----MENU-----");
            System.out.println("1 - SOMA");
            System.out.println("2 - MULTIPLICACAO");
            System.out.println("3 - SUBTRACAO");
            System.out.println("-----MENU-----\n");
            System.out.println("Escolha uma opcao: ");
            int opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("\nDigite um numero: ");
                    int n = scanner.nextInt();

                    System.out.println("\nDigite outro numero: ");
                    int n1 = scanner.nextInt();

                    System.out.println("A soma desses numeros sao: " + (n + n1));
                    break;

                case 2:
                    System.out.println("\nDigite um numero: ");
                    int n2 = scanner.nextInt();

                    System.out.println("\nDigite outro numero: ");
                    int n3 = scanner.nextInt();

                    System.out.println("A multiplicacao desses numeros sao: " + (n2 * n3));
                    break;

                case 3:
                    System.out.println("\nDigite um numero: ");
                    int n4 = scanner.nextInt();

                    System.out.println("\nDigite outro numero: ");
                    int n5 = scanner.nextInt();

                    System.out.println("A subtracao desses numeros sao: " + (n4 + n5));
                    break;

                default:
                    break;
            }
        }
    }
}
