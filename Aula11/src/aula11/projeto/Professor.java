package aula11.projeto;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    //Metodo publico
    public void receberAumento(float aum) {
        this.salario += aum;
        System.out.println("\n" + getNome() + " recebeu aumento de R$ " + aum + ".\n");
    }

    //Metodos getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
