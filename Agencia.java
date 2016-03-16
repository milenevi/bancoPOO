package banco1;

/**
 * @brief Classe Agencia
 * @author Milene Vieira e Fabiana Barreto
 * @since 13/03/2016
 */
public class Agencia {

    private int codigoAgencia;
    private String nomeAgencia;
    private Banco banco = new Banco();

    public void setCodigoAgencia(int codigo) {
        this.codigoAgencia = codigo;
    }

    public void setNomeAgencia(String nome) {
        this.nomeAgencia = nome;
    }

    public int getCodigoAgencia() {
        return this.codigoAgencia;
    }

    public String getNomeAgencia() {
        return this.nomeAgencia;
    }

    public void CalcularMontanteAgencia() {

    }

}
