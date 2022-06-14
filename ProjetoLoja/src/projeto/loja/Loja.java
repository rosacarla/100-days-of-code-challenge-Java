package projeto.loja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Double.sum;

public class Loja {
    //atributos encapsulados
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    private Produto produtos;

    private double valor = 0; //variavel receberá resultado de calculaPatrimonio

    private int quantidade = 0; //variavel recebe qtd de Produto

    //construtor vazio
    public Loja(Produto produtos) {
        this.produtos = produtos;
    }

    //getter e setter de Produto
    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    //metodo construtor da classe
    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    //metodos getters
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    //metodos personalizados
    public void listaLivros() {
        System.out.println("-------------------------------------------------------------------------");
        boolean qtdel = livros.isEmpty();
        if (qtdel == true) {
            System.out.println("A loja não tem livros no seu estoque.");
        } else {
            System.out.println("A loja " + this.getNome() + " possui estes livros para venda:");
            this.getLivros();
            for (Livro livro : livros)
                System.out.println("Título: " + livro.getNome()
                        + " , preço: " + livro.getPreco()
                        + " , quantidade: " + livro.getQtd() + " em estoque.");
        }
    }

    public void listaVideoGames() {
        System.out.println("-------------------------------------------------------------------------");
        boolean qtdev = videoGames.isEmpty();
        if (qtdev == true) {
            System.out.println("A loja não tem video-games no seu estoque.");
        } else {
            System.out.println("A loja " + this.getNome() + " possui estes videos-games para venda:");
            this.getVideoGames();
            for (VideoGame videogame : videoGames)
                System.out.println("Vídeo-game: " + videogame.getNome()
                        + " , preço: " + videogame.getPreco()
                        + " , quantidade: " + videogame.getQtd() + " em estoque.");
        }
    }

    //metodo personalizado
    public void calculaPatrimonio() {
        System.out.println("-------------------------------------------------------------------------");
        //double valor = getProdutos().getTotal();
        /*List<Double> precos = new ArrayList<Double>();
        precos.add(getProdutos().getPreco());
        Double d[] = new Double[precos.size()];
        precos.toArray(d);
        int sum,i;
        for(sum= 0, i= d.length - 1; 0 <= i; sum+= d[i--]);
        double valor = sum;*/
        System.out.println("O patrimônio da loja: " + this.getNome() + " é de R$ " + valor);
    }

    //tostring
    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", livros=" + livros +
                ", videoGames=" + videoGames +
                ", produtos=" + produtos +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
