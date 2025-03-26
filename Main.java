import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Date date1 = Date.valueOf("2000-11-10");

        p1.Cadastro("NomeTeste1", "email1@email.com", "000.000.000-00", date1);
        p1.ExibirInfo();

        Pessoa p2 = new Pessoa();
        Date date2 = Date.valueOf("2020-11-10");

        p2.Cadastro("NomeTeste2", "email2@email.com", "111.111.111-11", date2);
        p2.ExibirInfo();

        Conta c1 = new Conta(p1);
        Conta c2 = new Conta(p2);

        c1.Depositar(500);
        c1.Transferir(155, c2);
        c1.ContaInfo();
        c2.ContaInfo();
    }

}
