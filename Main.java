import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        double valor;
        int choice;
        int choiceContaId;
        int contaDestId;
        int choiceId;

        List<Pessoa> listaPessoa = new ArrayList<>();
        List<Conta> listaConta = new ArrayList<>();

        while(status) {
            System.out.println("");
            System.out.println("1-Cadastro e exibicao de informacoes da Pessoa");
            System.out.println("2-Cadastro e exibicao de informacoes do Banco");
            System.out.println("3-Operacoes bancarias");
            System.out.println("4-Sair");
            System.out.println("");

            choice = scanner.nextInt();
            
            //Menu de interação
            switch (choice) {
                case 1:
                        do {
                            System.out.println("");
                            System.out.println("1-Cadastrar Pessoa");
                            System.out.println("2-Exibir Info da pessoa");
                            System.out.println("3-Exibir Info de todas as pessoas");
                            System.out.println("4-Voltar");
                            System.out.println("");
                            choice = scanner.nextInt();

                            //Escolha 1: Cadastrar Infomações da pessoa
                            if (choice == 1) {
                                System.out.println("");
                                System.out.println("Opcão 1 escolhida: Cadastrar Pessoa\n");
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

                            //Escolha 2: Exibir Infomação da pessoa escolhida pelo id
                            else if (choice == 2) {
                                System.out.println("");
                                System.out.println("Opcão 2 escolhida: Exibir Info da pessoa");

                                System.out.println("");
                                System.out.println("Digite o id da pessoa que voce deseja exibir as informacoes");
                                System.out.println("");

                                choiceId = scanner.nextInt();
                                if (!listaPessoa.isEmpty()) {
                                    boolean pessoaEncontrada = false;
                                    for (Pessoa pessoa : listaPessoa) {
                                        if (choiceId == pessoa.getPessoaId()) {

                                            pessoaEncontrada = true;
                                            pessoa.ExibirInfo();
                                            break;
                                        
                                        }
                                    }
                                    if (!pessoaEncontrada) System.out.println("Pessoa com id:" + choiceId + " nao encontrada");
                                } else System.out.println("Nenhuma pessoa foi cadastrada");
                            }

                            //Escolha 3: Exibir Infomação de todas as pessoas cadastradas
                            else if (choice == 3) {
                                if (!listaPessoa.isEmpty()) {
                                    for (Pessoa pessoa : listaPessoa) {
                                    
                                        pessoa.ExibirInfo();

                                    }
                                } else System.out.println("Nenhuma pessoa foi cadastrada");
                            }

                            //Escolha 4: Voltar
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
                        System.out.println("1-Cadastrar conta");
                        System.out.println("2-Exibir Info da conta");
                        System.out.println("3-Exibir Info de todas as contas");
                        System.out.println("4-Voltar");
                        System.out.println("");
                        choice = scanner.nextInt();

                        //Escolha 1
                        if (choice == 1) {
                            System.out.println("");
                            System.out.println("Cadastrar e vincular conta a pessoa: ");

                            System.out.println("Digite o ID da pessoa para vincular a conta: ");
                            choiceId = scanner.nextInt();
                            boolean pessoaEncontrada = false;

                            for (Pessoa pessoa : listaPessoa) {
                                if (!listaPessoa.isEmpty()) {
                                    if (choiceId == pessoa.getPessoaId()) {
                                        
                                        Conta conta = new Conta(pessoa);
                                        listaConta.add(conta);
                                        pessoa.AdicionarConta(conta);
                                        pessoaEncontrada = true;
                                        System.out.println("Conta vinculada com sucesso à pessoa: " + pessoa.getNome());
                                        break;

                                    } 
                                } else System.out.println("Nenhuma pessoa esta cadastrada para vincular uma conta");
                            } if (!pessoaEncontrada) System.out.println("Pessoa escolhida para vincular nao encontrada");
                        }

                        //Escolha 2: Exibir infomação da conta escolhida pelo id
                        else if (choice == 2) {
                            System.out.println("");
                            System.out.println("Opcão 2 escolhida: Exibir Info da conta");

                            System.out.println("");
                            System.out.println("Digite o id da conta que voce deseja exibir as informacoes");
                            System.out.println("");

                            choiceId = scanner.nextInt();

                            if (!listaConta.isEmpty()){
                                boolean contaEncontrada = false;
                                for (Conta conta : listaConta) {
                                    if (choiceId == conta.getContaId()) {
                                        
                                        conta.ExibirInfoConta();
                                        contaEncontrada = true;
                                        break;

                                    }
                                } if (!contaEncontrada) System.out.println("Conta com id:" + choiceId + " nao encontrada");
                            } else System.out.println("Nenhuma conta cadastrada");
                        }

                        //Escolha 3: Exibir informação de todas as contas
                        else if (choice == 3) {
                            if (!listaConta.isEmpty()) {
                                for (Conta conta : listaConta) {
                                
                                    conta.ExibirInfoConta();
                                    
                                }
                            } else System.out.println("Nenhuma conta foi cadastrada");
                        }

                        //Escolha 4: Voltar
                        else if (choice == 4) {
                            System.out.println("");
                            System.out.println("Voltando");
                            System.out.println("");
                            break;
                        }

                        else System.out.println("\nnenhuma  opcao escolhida ou a opcao e invalida");

                    } while (choice != 4);

                    break;

                case 3:
                        do {
                            System.out.println("");
                            System.out.println("Operacoes bancarias:");
                            System.out.println("");
                            System.out.println("1-Depositar");
                            System.out.println("2-Sacar");
                            System.out.println("3-Transferir");
                            System.out.println("4-Voltar");
                            System.out.println("");
                            choice = scanner.nextInt();

                            //Escolha 1: Depositar
                            if (choice == 1) {
                                System.out.println("Opcao 1 escolhida: Depositar");
                                System.out.println("");

                                System.out.println("Digite o id da conta que voce deseja depositar: ");
                                choiceContaId = scanner.nextInt();
                                
                                boolean contaEncontrada = false;

                                for (Conta conta : listaConta) {
                                    if (!listaPessoa.isEmpty()) {
                                        if (choiceContaId == conta.getContaId()) {
                                            System.out.println("Digite o valor que voce deseja depositar na conta com id: " + choiceContaId);
                                            valor = scanner.nextDouble();
                                            
                                            contaEncontrada = true;
                                            conta.Depositar(valor);
                                            
                                        }
                                    } else {
                                        System.out.println("Nenhuma pessoa esta cadastrada para vincular uma conta");
                                        break;  
                                    }
                                } if (!contaEncontrada) System.out.println("Pessoa escolhida para vincular nao encontrada");
                            }

                            //Escolha 2: Sacar
                            else if (choice == 2) {
                                System.out.println("Opcao 2 escolhida: Sacar");
                                System.out.println("");

                                System.out.println("Digite o id da conta que voce deseja Sacar: ");
                                choiceContaId = scanner.nextInt();

                                boolean contaEncontrada = false;

                                for (Conta conta : listaConta) {
                                        if (choiceContaId == conta.getContaId()) {
                                            System.out.println("Digite o valor que voce deseja sacar da conta com id: " + choiceContaId);
                                            valor = scanner.nextDouble();
                                            
                                            conta.Sacar(valor);
                                            contaEncontrada = true;

                                        }
                                } if (!contaEncontrada) System.out.println("Conta com id:" + choiceContaId + " nao encontrada");
                            }

                            //Escolha 3: Transferir
                            else if (choice == 3) {
                                System.out.println("Opcao 3 escolhida: Transferir");
                                System.out.println("");

                                System.out.println("Digite o id da conta de origem: ");
                                choiceContaId = scanner.nextInt();

                                boolean contaOrigEncontrada = false;
                                boolean contaDestEncontrada = false;

                                for (Conta conta : listaConta) {
                                    if (!listaConta.isEmpty()){
                                        if (choiceContaId == conta.getContaId()) {
                                            System.out.println("Digite o id de destino: ");
                                            contaDestId = scanner.nextInt();

                                            contaOrigEncontrada = true;
                                            
                                            for (Conta contaDest : listaConta) {
                                                if (contaDestId == contaDest.getContaId()) {
                                                    System.out.println("Digite o valor que voce deseja Transferir da conta com id: " + choiceContaId);
                                                    
                                                    valor = scanner.nextDouble();
                                                    
                                                    conta.Transferir(valor, contaDest);
                                                    contaDestEncontrada = true;
                                                }
                                            } if (!contaDestEncontrada) System.out.println("Conta de destino com id:" + contaDestId + " nao encotrada");
                                        }
                                    } else System.out.println("Nenhuma conta cadastrada");
                                } if (!contaOrigEncontrada) System.out.println("Conta com id:" + choiceContaId + "nao encontrada");
                            }

                            //Escolha 4: Voltar
                            else if (choice == 4) {
                                System.out.println("");
                                System.out.println("Voltando");
                                System.out.println("");
                                break;
                            }
    
                            else System.out.println("\nnenhuma opcao escolhida ou a opcao e invalida");
    
                        } while (choice != 4);
                        
                    break;
                
                case 4:
                    System.out.println("");
                    System.out.println("Opcao 4 escolhida: Sair");
                    System.out.println("");
                    System.out.println("Saindo");
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
