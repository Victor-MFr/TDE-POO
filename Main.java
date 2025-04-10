import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        int choice;
        int choiceId;

        List<Pessoa> listaPessoa = new ArrayList<>();
        List<Conta> listaConta = new ArrayList<>();

        while(status) {
            System.out.println("");
            System.out.println("1-Pessoa");
            System.out.println("2-Banco");
            System.out.println("3-Sair");
            System.out.println("");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                        do {
                            System.out.println("");
                            System.out.println("1-Cadastrar Pessoa");
                            System.out.println("2-Exibir Info");
                            System.out.println("3-Exibir Info de todas as pessoas");
                            System.out.println("4-Voltar");
                            System.out.println("");
                            choice = scanner.nextInt();

                            //Escolha 1: Cadastrar Infomações da pessoa
                            if (choice == 1) {
                                System.out.println("");
                                System.out.println("Opcão 1 escolhida: Cadastra Pessoa\n");
                                scanner.nextLine();

                                System.out.println("");
                                System.out.println("Digite o Nome da pessoa: ");
                                String nome = scanner.nextLine();

                                System.out.println("");
                                System.out.println("Digite o email da pessoa: ");
                                String email = scanner.nextLine();

                                System.out.println("");
                                System.out.println("Digite o CPF da pessoa: ");
                                String CPF = scanner.nextLine();
                                
                                Pessoa pessoa = new Pessoa(nome, email, CPF);
                                listaPessoa.add(pessoa);

                                System.out.println("");
                                System.out.println("Pessoa adicionada.");
                                System.out.println("");
                            }

                            //Escolha 2: Exibir Infomação da pessoa
                            else if (choice == 2) {
                                System.out.println("");
                                System.out.println("Opcão 2 escolhida: Exibir Info");

                                System.out.println("");
                                System.out.println("Digite o id da pessoa que voce deseja exibir as informacoes");
                                System.out.println("");

                                choiceId = scanner.nextInt();

                                for (Pessoa pessoa : listaPessoa) {
                                    if (!listaPessoa.isEmpty()) {
                                        if (choiceId == pessoa.getPessoaId()) {
                                            pessoa.ExibirInfo();
                                            break;
                                        } else System.out.println("Pessoa com id:" + choiceId + " nao encontrada");
                                    } else System.out.println("Nenhuma pessoa foi cadastrada");
                                }
                            }

                            //Escolha 2: Exibir Infomação de todas as pessoas cadastradas
                            else if (choice == 3) {
                                if (!listaPessoa.isEmpty()) {
                                    for (Pessoa pessoa : listaPessoa) {
                                    pessoa.ExibirInfo();
                                    }
                                } else System.out.println("Nenhuma pessoa foi cadastrada");
                            }

                            //Escolha 4: Sair
                            else if (choice == 4) {
                                System.out.println("");
                                System.out.println("Voltando");
                                System.out.println("");
                                break;
                            } 
                            
                            else System.out.println("Opcao invalida");

                        } while (choice != 4);

                    break;
                    
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("1-");
                        System.out.println("2-Exibir Info");
                        System.out.println("3-Exibir Info de todas as pessoas");
                        System.out.println("4-");
                        System.out.println("5-Voltar");
                        System.out.println("");
                        choice = scanner.nextInt();

                        // if () {

                        // }

                        // else if (true) {
                            
                        // }
                        
                        // else if (true) {
                            
                        // }

                        // else if (true) {
                            
                        // }

                        // else if (true) {
                            
                        // }

                        // else ;

                    } while (choice != 5);

                    break;
                
                case 3:
                    System.out.println("");
                    System.out.println("Opcao 3 escolhida: Sair");
                    System.out.println("");
                    status = false;
                    break;
                        
                
                default:
                    System.out.println("");
                    System.out.println("Nenhuma opcao escolhida ou a opcao e invalida");
                    System.out.println("");
                    break;
            }
        }
    }
}
