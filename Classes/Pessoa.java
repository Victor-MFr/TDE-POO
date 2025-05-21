package Classes;

import java.util.ArrayList;
import java.util.List;

public class Pessoa{
    private final List<Conta> contasVinculadas;
    private String nome;
    private String email;
    private String CPF;
    private static int contadorId = 0;
    private int pessoaId;
        
    public Pessoa(String nome, String email, String CPF) {
            this.pessoaId = ++contadorId;
            this.nome = nome;
            this.email = email;
            this.CPF = CPF;
            this.contasVinculadas = new ArrayList<>();
        }

    public void Cadastro(String nome, String email, String CPF) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.pessoaId++;
    }
    
    public void AdicionarConta(Conta conta) {
        this.contasVinculadas.add(conta);
    }

    public void ExibirInfo() {
        System.out.println("");
        System.out.println("Id: " + pessoaId);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + CPF);
        System.out.println("Contas bancarias:");
        for (Conta conta : contasVinculadas) {
            System.out.println("Id: " + conta.getContaId() + " Saldo: R$" + conta.getSaldo());
        }
        System.out.println("");
    }

    public int getPessoaId() {
        return pessoaId;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}
