package banco1;

import java.util.Scanner;

/**
 * @brief Classe AppBanco
 * @author Milene Vieira e Fabiana Barreto
 * @since 13/03/2016
 *
 */
public class AppBanco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String numeroConta;
        String nomeCliente;
        char tipo;
        float valor;
        Conta ct1;
        int opcao;

        ct1 = new Conta();
        //Menu
        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Cadastrar:");
            System.out.println("2 - Alterar:");
            System.out.println("3 - Excluir:");
            System.out.println("4 - Saldo:");
            System.out.println("5 - Deposito:");
            System.out.println("6 - Pagamentos:");
            System.out.println("7 - Transferências:");
            System.out.println("8 - Extrato detalhado:");
            System.out.println("9 - Calcular Montante:");
            System.out.println("10 - Sair");

            opcao = input.nextInt();

            switch (opcao) {
                //1 - Cadastrar:
                case 1:
                    int opcao1;
                    System.out.println("#######  TELA DE CADASTRO  #######");
                    System.out.println("Digite a opção desejada:");
                    System.out.println("1 - Cadastrar Banco:");
                    System.out.println("2 - Cadastrar Agencia:");
                    System.out.println("3 - Cadastrar Conta:");
                    System.out.println("4 - Sair:");

                    opcao1 = input.nextInt();
                    switch (opcao1) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            //PARA CADASTRAR CONTA
                            System.out.print("Informe o número da conta: ");
                            numeroConta = input.next();

                            System.out.print("Informe o nome do cliente: ");
                            nomeCliente = input.next();

                            System.out.print("Informe o tipo da conta: ");
                            tipo = input.next().charAt(0);
                            
                            ct1 = new Conta(numeroConta, nomeCliente,  tipo);
                            break;
                        case 4:
                            System.out.println("");
                        default:
                            System.out.println("Opção incorreta");
                            break;
                    }
                    break;
                case 2:
                    //2 - Alterar:
                    int opcao2;
                    System.out.println("#######  TELA DE ALTERAR CADASTRO  #######");
                    System.out.println("Digite a opção desejada:");
                    System.out.println("1 - Alterar Banco:");
                    System.out.println("2 - Alterar Agencia:");
                    System.out.println("3 - Alterar Conta:");
                    System.out.println("4 - Sair:");

                    opcao2 = input.nextInt();
                    switch (opcao2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            System.out.println("");
                        default:
                            System.out.println("Opção incorreta");
                            break;
                    }
                    break;
                case 3:
                    //3 - Excluir:
                    int opcao3;
                    System.out.println("#######  TELA DE EXCLUIR CADASTRO  #######");
                    System.out.println("Digite a opção desejada:");
                    System.out.println("1 - Excluir Banco:");
                    System.out.println("2 - Excluir Agencia:");
                    System.out.println("3 - Excluir Conta:");
                    System.out.println("4 - Excluir Sair:");

                    opcao3 = input.nextInt();

                    switch (opcao3) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            System.out.println("");
                        default:
                            System.out.println("Opção incorreta");
                            break;
                    }
                    break;
                case 4:
                    //4 - Saldo:
                    int opcao4;
                    System.out.println("#######  TELA DE SALDO  #######");
                    System.out.println("Digite a opção desejada:");
                    System.out.println("1 - Saldo de apenas uma agência:");
                    System.out.println("2 - Saldo de todas as agencias:");
                    System.out.println("3 - Sair:");

                    opcao4 = input.nextInt();

                    switch (opcao4) {
                        case 1:
                            
                            ct1.emitirSaldo();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opção incorreta");
                            break;
                    }
                    break;
                case 5:
                    //5 - Deposito:
                    System.out.println("#######  TELA DE DEPOSITO  #######");
                    System.out.print("\nDigite o valor de depósito: ");
                    valor = input.nextFloat();
                    ct1.creditar(valor);
                    break;
                case 6:
                    //6 - Pagamentos:
                    System.out.println("#######  TELA PAGAMENTO  #######");
                    break;
                case 7:
                    //7 - Transferências:
                    System.out.println("#######  TELA DE TRANSFERÊNCIA  #######");
                    System.out.print("\nDigite o valor a ser transferido: ");
                    valor = input.nextFloat();

                    if (ct1.validarSaldo(valor)) {
                        ct1.debitar(valor);
                        System.out.println("Digite a conta a ser creditadada");
                        //validar se conta existe
                        
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 8:
                    //8 - Extrato detalhado:
                    System.out.println("#######  TELA DE EXTRATO  #######");
                    break;
                case 9:
                    //9 - Calcular Montante:
                    int opcao9;
                    System.out.println("#######  TELA DE CALCULO DE MONTANTE  #######");
                    System.out.println("Digite a opção desejada:");
                    System.out.println("1 - Calcular Montante do Banco:");
                    System.out.println("2 - Calcular Montante da Agencia:");
                    System.out.println("3 - Sair:");

                    break;
                case 10:
                    //10 - Sair
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    //caso digite opção que não está entre as referênciasdas no menu principal
                    System.out.println("Opção incorreta");
                    break;
            }

        } while (opcao == 10);
        
    }
}
