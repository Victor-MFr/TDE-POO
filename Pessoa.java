import java.sql.Date;

public class Pessoa {
    private static int pessoaId = 0;
    private String nome;
    private String email;
    private String CPF;
    private Date dataNascimento;

    public void Cadastro(String nome, String email, String CPF, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.pessoaId++;
    }

    public void ExibirInfo() {
        System.out.println("\nId: " + pessoaId);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + CPF);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
}
