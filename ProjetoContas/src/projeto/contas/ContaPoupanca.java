package projeto.contas;

public class ContaPoupanca extends Conta {
    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void rendimento() {
        double rendCP = this.getSaldo() * 0.07;
        System.out.println("\n------------------------------------------------------------------------------");
        System.out.println("Conta Poupança nº: " + this.getNumero() + "  - Titular: " + this.getTitular());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", this.getSaldo()));
        System.out.println("Rendimento da conta: R$ " + String.format("%.2f", rendCP));

    }


}
