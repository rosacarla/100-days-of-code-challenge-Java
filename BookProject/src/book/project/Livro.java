package book.project;

/**
 * Classe Livro agrega classe Pessoa e implementa a interface Publicacao.
 */

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; //agregação de classe Person

    //Metodo especial toString automático foi renomeado como detalhes()
    //IDE sugeriu remover anotação @Override
    public String detalhes() {
        return "\nLivro{" +
                "titulo=" + titulo + ", autor="
                + autor + "\n, totPaginas=" + totPaginas
                + ", pagAtual=" + pagAtual + ", aberto="
                + aberto + "\n, leitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() +
                ", sexo=" + leitor.getSexo() +'}';
    }

    //Metodo construtor com edicao de atributos aberto e pagAtual
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0; //pagina atual inicia em 0 por padrao
        this.aberto = false; //livro inicia fechado por padrão
        this.leitor = leitor;
    }

    //Metodos modificadores getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Implementacao de metodos abstratos da inteface Publicacao
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
            System.out.println("\nImpossível folhear até a página " + p + "!");
            System.out.println("O livro " + this.getTitulo() + " tem " + this.getTotPaginas() + " páginas!");
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
