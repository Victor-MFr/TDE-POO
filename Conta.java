public class Conta {
    private static int contaId = 0;
    private double saldo = 0;
    private double valorDeposito = 0;
    private double valorSaque = 0;
    private double valorTransferencia = 0;
    private double valorSimulacao = 0;

    public void Depositar() {
        this.saldo += valorDeposito;
    }
    
    public void Sacar() {
    }

    public void Transferir() {

    }

    public void SimuladorDeRendimento() {

    }
}
