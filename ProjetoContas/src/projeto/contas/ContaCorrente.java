package projeto.contas;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    //sobreposicao de metodo rendimento


    @Override
    public void rendimento() {
        double rendCC = this.getSaldo() * 0.05;
        double saldoAtual = (this.getSaldo() - 0.75);
        System.out.println("\n------------------------------------------------------------------------------");
        System.out.println("Conta Corrente nº: " + this.getNumero() + "  - Titular: " + this.getTitular());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldoAtual));
        System.out.println("Rendimento da conta: R$ " + String.format("%.2f", rendCC));
    }

}
