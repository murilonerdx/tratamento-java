package exceptions;

import classPrincipal.*;

public class Valida {
    private Valida() {
    }

    public static void aluno(Aluno aluno) {

        if (aluno == null) { // Se o aluno não existir
            throw new IllegalArgumentException("Aluno está vazio");
        }

        if (aluno.nomeAluno == null || aluno.nomeAluno.trim().isEmpty()) { // Se o nome do aluno for nulo ou vazio
            throw new StringVaziaException("nome"); // Mensagem como parametro
        }

        if (aluno.notaAluno < 0 || aluno.notaAluno > 10) { // Caso for menor que zero ou maior que 10
            throw new ErrorPersonalizado("nota"); // Mensagem como parametro
        }

    }

}
