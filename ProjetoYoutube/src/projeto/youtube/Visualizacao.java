package projeto.youtube;

public class Visualizacao {
    private Gafanhoto espectador;  //agregação de classe Gafanhoto
    private Video filme;   //agregação de classe Video

    //metodo construtor


    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1); //contagem de total assistido
        this.filme.setViews(this.filme.getViews() + 1); //contagem de visualizacoes
    }

    //metodos publicos personalizados - sobrecarga
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        int tot = 0; //nota total da avaliação
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot); //filme recebe o total da avaliação
    }

    //metodos getters e setters

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //sobrescreve metodo toStrint() para Visualizacao

    @Override
    public String toString() {
        return "\nVisualizacao{" +
                "\nespectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
