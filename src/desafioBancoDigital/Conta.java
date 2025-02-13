package desafioBancoDigital;

public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1323;

    protected int agencia;
    protected int numero;
    protected double saldo;

    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void sacar(double valor) {

    }

    public void depositar(double valor) {

    }

    public void transferir(double valor, Conta contaDestino) {

    }
}
