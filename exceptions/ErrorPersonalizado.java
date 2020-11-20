package exceptions;

@SuppressWarnings("serial")
public class ErrorPersonalizado extends RuntimeException {
    private String nomeDoAtributo;

    public ErrorPersonalizado(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s invalido, a nota deve estar entre 0 e 10", nomeDoAtributo);
    }

}
