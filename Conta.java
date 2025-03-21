public class Conta {
    private static int contaId = 0;
    private double saldo = 0;
    private double valorDeposito = 0;
    private double valorSaque = 0;
    private double valorTransferencia = 0;
    private double valorSimulacao = 0;

    public void Depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        } else System.out.println("Valor de deposito invalido.");
    }
    
    public void Sacar(double valorSaque) {
        if (valorSaque)
    }

    public void Transferir(double valorTransferencia, int contaId) {

    }

    public void SimuladorDeRendimento() {

    }
}
