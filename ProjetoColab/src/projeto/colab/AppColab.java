package projeto.colab;

public class AppColab {
    public static void main(String[] args) {
        //objetos instanciados
        Gerente g = new Gerente("Joao Antonio Rosa", 65, 3000.23, 4);
        Supervisor s = new Supervisor("Alisson Silveira", 21,2020.56 , 3);
        Vendedor v = new Vendedor("Carolina Santos", 27, 1360.33, 2);

        //aplicacao do metodo pra calcular bonificações
        g.bonificacao();
        s.bonificacao();
        v.bonificacao();

    }
}
