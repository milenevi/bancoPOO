package banco1;

/**
 * @brief Classe Banco
 * @author Milene Vieira e Fabiana Barreto
 * @date 16/03/2016
 */
public class Banco {

    private int codigoBanco;
    private String nomeBanco;

    public Banco() {
        
    }
    public Banco(int codigo, String nome) {
        this.codigoBanco = codigo;
        this.nomeBanco = nome;
    }

    public void setCodigoBanco(int codigo) {
        this.codigoBanco = codigo;
    }

    public void setNomeBanco(String nome) {
        this.nomeBanco = nome;
    }

    public int getCodigoBanco() {
        return this.codigoBanco;
    }

    public String getNomeBanco() {
        return this.nomeBanco;
    }

    public void CalcularMontanteBanco() {

    }
}
