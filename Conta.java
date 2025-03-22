public class Conta { //falta a implementaçao da herança com a classe pessoa, ou criar uma classe cliente que tenha herança da classe pessoa e depois implementar ela a essa classe
    private static int contaId = 0;
    private double saldo = 0;
    private double valorDeposito = 0;
    private double valorSaque = 0;
    private double valorTransferencia = 0;

    //eu acho que esse Construtor está errado
    public Conta() {
        this.contaId = ++contaId;
    }

    public void ContaInfo() {
        System.out.println("Id da Conta: " + contaId);
        System.out.println("Saldo: " + saldo);
    }

    public void Depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.println("Deposito no valor de R$" + valorDeposito + " realizado com sucesso");
        } else System.out.println("Valor de deposito invalido.");
    }
    
    public void Sacar(double valorSaque) {
        if (valorSaque <= this.saldo && valorSaque > 0) {
            this.saldo -= valorSaque;
            System.out.println("Saque no valor de R$" + valorSaque + " realizado com sucesso");
        } else System.out.println("Valor de saque invalido");
    }

    public void Transferir(double valorTransferencia, int contaId) {
        if (valorTransferencia <= this.saldo && valorTransferencia > 0) {
            Conta contaDaTransferencia = Conta(contaId); //ERRO NESSA LINHA
            if (contaDaTransferencia != null) {
                this.saldo -= valorTransferencia;
                contaDaTransferencia.saldo += valorTransferencia;
                System.out.println("Transferencia no valor de R$" + valorTransferencia + " para a conta com id " + contaId + " realizado com sucesso");
            } else System.out.println("Conta com id " + contaId +" não encontrada");
        } else System.out.println("Valor de transferencia invalido");
    }
}
