public class Conta {
    private int contaId;
    private static int contadorContaId = 0;
    private double saldo = 0;
    private Pessoa cliente;

    public Conta(Pessoa cliente) {
        this.cliente = cliente;
        contadorContaId++;
        this.contaId = contadorContaId;
    }

    public void ContaInfo() {
        System.out.println("\nId da Conta: " + contaId);
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Saldo: R$" + saldo);
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

    public void Transferir(double valorTransferencia, Conta contaDaTransferencia) {
        if (valorTransferencia <= this.saldo && valorTransferencia > 0) {
            if (contaDaTransferencia != null) {
                this.saldo -= valorTransferencia;
                contaDaTransferencia.saldo += valorTransferencia;
                System.out.println("Transferencia no valor de R$" + valorTransferencia + " para a conta com id " + contaId + " realizado com sucesso");
            } else System.out.println("Conta de transferencia invalida");
        } else System.out.println("Valor de transferencia invalido");
    }
}
