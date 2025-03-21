
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Date date1 = new Date(100, 10, 10);

        p1.Cadastro("NomeTeste1", "email1@email.com", "000.000.000-00", date1);
        p1.ExibirInfo();

        Pessoa p2 = new Pessoa();
        Date date2 = new Date(120, 10, 10);
        
        p1.Cadastro("NomeTeste2", "email2@email.com", "111.111.111-11", date2);
        p1.ExibirInfo();
    }

}
