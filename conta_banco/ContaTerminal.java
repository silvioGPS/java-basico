package conta_banco;

public class ContaTerminal {
    private int numero = 0;
    private String agencia = "";
    private String nomeCliente = "";
    private double decimal = 0;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getDecimal() {
        return decimal;
    }
}