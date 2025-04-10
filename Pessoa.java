public class Pessoa{
    private int pessoaId;
    private static int contadorId = 0;
    private String nome;
    private String email;
    private String CPF;
        
    public Pessoa(String nome, String email, String CPF) {
            this.pessoaId = ++contadorId;
            this.nome = nome;
            this.email = email;
            this.CPF = CPF;
        }

    public void Cadastro(String nome, String email, String CPF) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.pessoaId++;
    }

    public void ExibirInfo() {
        System.out.println("");
        System.out.println("Id: " + pessoaId);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + CPF);
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
