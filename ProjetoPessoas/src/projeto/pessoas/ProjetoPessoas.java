package projeto.pessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        //inseridos nomes
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        //inseridos sexo e idade
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        //inseridos curso, salario, setor
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //teste de metodo receberAumento()
        //p1.receberAumento(550.20f);  impossível por ser Pessoa, só pode Professor
        p3.receberAumento(550.20f);
        //p2.mudarTrabalho(); impossivel por ser Aluno, só pode Funcionario
        p4.mudarTrabalho();
        //p4.cancelarMatr(); impossivel por ser Funcionario, só pode Aluno
        p2.cancelarMatr();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
