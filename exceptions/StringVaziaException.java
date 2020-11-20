package exceptions;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) { // Parametro para ser chamado
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está vazio", nomeDoAtributo); // Mensagem
    }

}
