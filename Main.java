import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // imprimir();
            geraErro1();
            geraErro2();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage()); // Faz aparecer o erro.
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void imprimir() {
        double divisao = 7 / 0; // Caso 7 / 0, ocorreria um erro, e enviaria para a mensagem do catch
        System.out.println(divisao);
    }

    // Exceção não chegada ou não verificada
    static void geraErro1() throws Exception {
        throw new RuntimeErrorException(null, "Ocorreu um erro amigo!! - 1.");
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro aqui amigo!! - 2.");
    }
}
