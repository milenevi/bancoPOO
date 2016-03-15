package banco1;

import java.util.Scanner;

/**
 * @brief Classe AppBanco
 * @author Milene Vieira <milene_vi@hotmail.com>  
 * @since   13/03/2016
 */
public class AppBanco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int codigo;
        String cliente;
        char tipo;
        float valor;

        Conta ct1;
        
        //PARA CADASTRAR CONTA
        System.out.print("Informe o número da conta: ");
        codigo = input.nextInt();

        System.out.print("Informe o nome do cliente: ");
        cliente = input.next();

        System.out.print("Informe o tipo da conta: ");
        tipo = input.next().charAt(0);

        ct1 = new Conta(codigo, cliente, tipo);

        ct1.emitirSaldo();

        //PARA OPERAÇÃO DE DEPÓSITO
        System.out.print("\nDigite o valor de depósito: ");
        valor = input.nextFloat();
        ct1.creditar(valor);

        ct1.emitirSaldo();

        //PARA OPERAÇÃO DE DEBITO
        System.out.print("\nDigite o valor de saque: ");
        valor = input.nextFloat();

        if (ct1.validarSaldo(valor)) {
            ct1.debitar(valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        ct1.emitirSaldo();
    }
}
