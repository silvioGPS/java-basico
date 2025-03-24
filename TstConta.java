
public class TstConta {
    public static void main(String[] args){

        // Instânciando a classe Conta Terminal e a classe Leitura que é responsável
        // pela entrada e saída de dados.
        ContaTerminal ct = new ContaTerminal();
        Leitura l = new Leitura();

        ct.setNumero(Integer.parseInt(l.entDados("Informe a agencia: ")));

        ct.setAgencia(l.entDados("Informe o numero da agencia: "));
        ct.setNomeCliente(l.entDados("Informe o nome do cliente: "));
        ct.setDecimal(Double.parseDouble(l.entDados("Informe um valor em decimal: ")));

        System.out.println("\n------Informações------");
        System.out.println("\nA agência informada foi: " + ct.getNumero());
        System.out.println("\nO numero da agência informado foi: " + ct.getAgencia());
        System.out.println("\nO nome do cliente informado foi: " + ct.getNomeCliente());
        System.out.println("\nO valor decimal informado foi: " + ct.getDecimal());

    }
}
