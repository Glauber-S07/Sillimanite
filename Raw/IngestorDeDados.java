package Raw;

public class IngestorDeDados {

    /**
     * Método de ingestão de dados.
     * @param dados String simulando o conteúdo vindo de uma fonte externa.
     */
    public void realizarIngestao(String dados) {

        System.out.println("Iniciando processo de ingestão...");

        if (dados != null && !dados.isEmpty()) {
            System.out.println("Dados processados com sucesso: " + dados);
        } else {
            System.err.println("Erro: Dados vazios ou nulos.");
        }
    }
}
