package book.project;

/**
 *  Executa classe Livro com agragação de classe Pessoa
 *  e implementação da interface Publicacao
 */

public class ProjetoLivro {
    //Objetos são instanciados e armazenados em vetores
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2]; //instancia 2 pessoas-leitores
        Livro[] l = new Livro[3]; //instancia 3 livros

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        //Mostrar detalhes dos livros
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());

        //Abrir livros e folhear páginas
        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(520);
        System.out.println(l[1].detalhes());

        l[2].abrir();
        l[2].folhear(780);
        System.out.println(l[2].detalhes());
        l[2].avancarPag();
        System.out.println(l[2].detalhes());

    }
}
