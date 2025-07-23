package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemovido = null;
        for(Aluno a : alunoSet){
            if(a.getMatricula() == matricula){
                alunoRemovido = a;
                break;
            }
        }
        alunoSet.remove(alunoRemovido);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparetorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("amor", 12L, 9.1d);
        alunos.adicionarAluno("eu", 13L, 8.7d);

        alunos.exibirAlunos();

        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());
    }
}
