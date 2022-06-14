package projeto.loja;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    //metodo construtor vazio
    public VideoGame () {

    }

    //metodo construtor da classe
    public VideoGame(String nome, double preco, int qtd,
                     String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    //Implementacao da interface calculaImposto
    @Override
    public void calculaImposto() {
        if (isUsado) {
            double imp = this.getPreco() * 0.25;
            System.out.println("Imposto " + getNome() + " " +getModelo() + " usado, R$ " + imp + ".");
        } else {
            double imp = this.getPreco() * 0.45;
            System.out.println("Imposto " + getNome() + " " + getModelo() + " R$ " + imp + ".");
        }
    }
}

