package projeto.youtube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        //instanciados objetos da classe Video em vetor
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        System.out.println(v[0]);  //excluido toString(), pois IDE considera redundante a chamada

        //Pessoa p = new Pessoa(); --> impossivel pois classe Pessoa eh abstrata!

        //instanciados objetos da classe Gafanhoto em vetor
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

        System.out.println(g[0]); //mostrou na 1a vez como Pessoa por ter herança, usa toString de Pessoa

        /*System.out.println("\nVIDEOS\n--------------------------------------------");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println("\nGAFANHOTOS\n---------------------------------------------");
        System.out.println(g[0]);
        System.out.println(g[1]);*/

        //instanciados objetos em vetor
        Visualizacao vis[] = new Visualizacao[5];  //Jubileu assite HTML5
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();  //faz avaliacao sem parametro
        //vis.toString();  --> nao mostra nada
        System.out.println(vis[0]);
        vis[1] = new Visualizacao(g[0], v[1]); //Jubileu assiste PHP
        vis[0].avaliar(87.0f);  //faz avaliacao baseada em percentual visto
        System.out.println(vis[1]);

        //novas instancias para testar agregacoes da classe Visualizacao
        vis[2] = new Visualizacao(g[1], v[2]);
        vis[2].avaliar(9);
        System.out.println(vis[2]);
        vis[3] = new Visualizacao(g[1], v[0]);
        vis[3].avaliar(91.0f);
        System.out.println(vis[3]);


    }
}
