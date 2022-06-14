package projeto.youtube;

public class Gafanhoto extends Pessoa {  //herda atributos e metodos de Pessoa
    //declarados atributos encapsulados
    private String login;
    private int totAssistido;

    //metodo construtor para chamar a superclasse
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;  //login atributo = login parametro do construtor
        this.totAssistido = 0;
    }

    //metodos getters e setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    //sobrescreve metodo toString() para Gafanhoto


    @Override
    public String toString() {
        return "\nGafanhoto{" +
                super.toString() +   //inclusao manual da chamada de metodo de Pessoa
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
