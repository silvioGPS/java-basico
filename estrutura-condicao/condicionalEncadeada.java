public class condicionalEncadeada {
    public static void main(String[] args) {

        int v1 = 6;
        int v2 = 6;

        if (v1 < v2) {
            System.out.println("O " + v1 + " é menor que " + v2);
        } else if (v1 >= 2 && v2 < 6) {
            System.out.println("O numero digitado esta entre 2 e 6");
        }
        else{
            System.out.println("Os numeros são iguais");
        }
    }

}
