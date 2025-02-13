package desafioBancoDigital;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirEstrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }
}
