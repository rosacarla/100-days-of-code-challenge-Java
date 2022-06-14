package projeto.loja;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdPag;

    //metodo construtor vazio
    public Livro () {
    }

    //construtor da classe


    public Livro(String nome, double preco, int qtd,
                 String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    //getters
    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    //setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    //impementa interface calculaImposto
    @Override
    public void calculaImposto() {
        if (tema == "educativo") {
            double imp = 0;
            System.out.println("Livro educativo não tem imposto: " + getNome() + ".");
        } else {
            double imp = this.getPreco() * 0.10;
            System.out.println("R$ " + imp + " de impostos sobre o livro " + getNome() + ".");
        }
    }
    //sobrescreve toString() para Livro

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", tema='" + tema + '\'' +
                ", qtdPag=" + qtdPag +
                '}';
    }
}











