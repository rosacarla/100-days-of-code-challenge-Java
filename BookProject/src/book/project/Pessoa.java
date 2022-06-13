package book.project;

/**
 * Classe Pessoa para ser agregada à classe Livro.
 */

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //Metodo publico personalizado
    public void fazerAniver() {
        this.idade = this.idade + 1;
        //this.idade++ ==> outra opcao de codigo
    }

    //Metodo Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Metodos modificadores getters e setters
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
}
