
import exceptions.ErrorPersonalizado;
import exceptions.StringVaziaException;
import exceptions.Valida;
import classPrincipal.*;

public class MainTestes { // Não estou usando pacotes para ficar mais simples possivel
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("as", 20); // Erro por conta de estar vazio e ser negativo, em validação tem tudo
                                               // que deve saber
            Valida.aluno(aluno); // Criando validação
        } catch (StringVaziaException e) {
            e.printStackTrace();
        } catch (ErrorPersonalizado e) {
            e.printStackTrace();
        } finally { // Ele executa mesmo com algum erro, ele é sempre chamado
            System.out.println("Sempre serei chamado");
        }
    }
}
