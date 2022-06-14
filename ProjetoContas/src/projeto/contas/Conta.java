package projeto.contas;

public abstract  class Conta {
    private int numero;
    private String titular;
    private double saldo;

    //construtor vazio
    public Conta() {
    }

    //construtor da classe
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //setters

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodo personalizado
    public void rendimento() {

    }

    @Override
    public String toString() {
        return " ";
    }
}
