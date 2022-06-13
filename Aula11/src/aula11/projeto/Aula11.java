package aula11.projeto;

public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); --> erro pessoa é "abstract", nao pode ser instanciada
        Visitante v1 = new Visitante(); //instanciado objeto com herança de implementacao ou pobre
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");

        System.out.println(v1);

        //instaciado objeto a1 com herança pra diferença
        Aluno a1 = new Aluno();  //aluno eh especializacao de Pessoa, que eh generalizacao de Aluno
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        System.out.println(a1);

        //Instanciado objeto b1 com herança pra diferença e metodo sobreposto
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jurema");
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade(); //metodo diferente do que há em Aluno
        b1.renovarBolsa();

        System.out.println(b1);

        Tecnico t1 = new Tecnico();
        t1.setNome("Olivio");
        t1.setIdade(45);
        t1.setRegistroProfissional(12678);
        t1.praticar();

        System.out.println(t1);

        Aluno a2 = new Aluno();
        a2.setNome("Marilia");
        a2.setIdade(23);
        a2.setSexo("F");
        a2.setMatricula(1113);

        System.out.println(a2);

        a2.setCurso("Web Designer");
        a2.fazerAniversario();

        System.out.println(a2);

    }
}
