public class CepNaoEncontradoException extends Exception {
    private String mensagem;

    public CepNaoEncontradoException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
