package aula11.projeto;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    //Metodo publico
    public void fazerAniversario() {
        this.idade++;
    }

    //Metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodo especial toString()

    @Override
    public String toString() {
        return "\nDados: {" +   //editado Dados no lugar de Pessoa
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
