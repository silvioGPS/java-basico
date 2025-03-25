public class condicaoTernaria {
    public static void main(String[] args) {
        int tempoServico = 7;
        double salario = 2500.23;

        // condição ? expressão Verdadeira : expressão Falsa
        double bonus = tempoServico <= 6
        ? salario * 5
        : salario * 22;

        // Imprimindo o valor da condição
        System.out.println("O bonus do salario sera: " + bonus);
    }
}
