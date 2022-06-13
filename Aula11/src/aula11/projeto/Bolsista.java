package aula11.projeto;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("\nRenovando bolsa de " + this.nome + ".");
    }

    //Metodo sobreposto, por ser diferente do metodo de Aluno
    @Override   //exemplo de polimorfismo
    public void pagarMensalidade() {
        System.out.println("\n" + this.nome + " é bolsista! Pagamento facilitado.");
    }

    //Metodos getter e setter
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
