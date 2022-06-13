/*
 * Classe chamadora executa código da classe Lutador
 */

package ultraemojicombat;

/**
 *
 * @author carla
 */
public class UltraEmojiCombat {
    public static void main(String[] args) {
/*      Lutador ll = new Lutador("Gold Man", "Belgica", 40, 1.77f,
                66.8f, 21, 4, 7);
        ll.status();*/
        
        //Entrada de dados dos lutadores em vetor
        Lutador l[] = new Lutador[6]; //inicia vetor com 6 posições
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
                68.9f, 11, 2, 1);
        
        //l[0].status();
        
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
                57.8f, 14, 2, 3);
        
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f,
                80.9f, 12, 2, 1);
        
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f,
                81.6f, 13, 0, 2);
        
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f,
                119.3f, 5, 4, 3);
        
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f,
                107.5f, 12, 2, 4);
        
        //l[3].setCategoria(); //impossivel pois acesso ao met setCat é privado        
        /*
        l[3].status();
        l[3].setPeso(10f);
        l[3].status();
        l[3].setPeso(81.8f);
        l[3].ganharLuta();
        l[3].status(); 
        l[3].empatarLuta();
        l[3].status(); 
        l[3].perderLuta();
        l[2].empatarLuta();
        l[4].empatarLuta();
        l[5].ganharLuta();
        l[1].perderLuta();
        l[1].status();
        l[2].status();
        l[3].status();   
        l[4].status();
        l[5].status(); */
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status(); 
        l[1].status();
        
        Luta UEC02 = new Luta();
        UEC02.marcarLuta(l[2], l[3]);
        UEC02.lutar();
        l[2].status(); 
        l[3].status();
        
        Luta UEC03 = new Luta();
        UEC03.marcarLuta(l[5], l[1]);
        UEC03.lutar();
        l[5].status(); 
        l[1].status();
        
        Luta UEC04 = new Luta();
        UEC04.marcarLuta(l[4], l[4]);
        UEC04.lutar();
        l[4].status(); 
        l[4].status();
    }
}
