package projeto.contas;

public class MainContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234, "Maria Lisboa", 1234.46f);
        ContaPoupanca cp = new ContaPoupanca(7890, "Jonas Martins", 3456.75f);

        cc.rendimento();
        cp.rendimento();

        System.out.println(cc);
        System.out.println(cp);

    }
}
