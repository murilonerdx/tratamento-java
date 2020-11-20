package classPrincipal;

public class Aluno {
    public final String nomeAluno; // Ultilizando como final, não necessario o set e get já que não estou
    // utilizando protect nem private
    public final int notaAluno;

    public Aluno(String nomeAluno, int notaAluno) {
        this.nomeAluno = nomeAluno;
        this.notaAluno = notaAluno;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nomeAluno + " tem nota " + notaAluno; // Uma forma de tratar informações do tipo String para não vir como
                                                     // memoria
    }
}
