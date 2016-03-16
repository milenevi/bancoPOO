package banco1;

/**
 * @brief Classe Conta
 * @author Milene Vieira e Fabiana Barreto
 * @since 13/03/2016
 */
public class Conta {

    private String numeroConta;
    private String nomeCliente;
    private char tipo;
    private double saldo;
    private Agencia agencia = new Agencia();
    
    public Conta() {
    
    }
    
    public Conta(String numeroConta, String nomeCliente, char tipo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.tipo = tipo;
    }



    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String codigo) {
        this.numeroConta = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void creditar(float valor) {
        saldo += valor;
    }

    public void debitar(float valor) {
        saldo -= valor;
    }

    public boolean validarSaldo(float valor) {
        boolean liberado = false;
        if (saldo >= valor) {
            liberado = true;
        }
        return liberado;
    }

    public void emitirSaldo() {
        System.out.println("Numero: " + numeroConta);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Conta: " + tipo);
        System.out.println("Saldo: " + saldo);
    }
}
