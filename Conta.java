package banco1;

/**
 * @brief Classe Conta
 * @author Milene Vieira <milene_vi@hotmail.com>
 * @since 13/03/2016
 */
public class Conta {

    private int codigo;
    private String nomeCliente;
    private char tipo;
    private double saldo;

    public Conta(int codigo, String nomeCliente, char tipo) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        System.out.println("Numero: " + codigo);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Conta: " + tipo);
        System.out.println("Saldo: " + saldo);
    }
}
