package book.project;

/**
 * Interfaxe lista metodos publicos para implementação na classe Livro
 */

public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folhear(int p);  //recebe nro de páginas como parametro
    public void avancarPag();
    public void voltarPag();
}
