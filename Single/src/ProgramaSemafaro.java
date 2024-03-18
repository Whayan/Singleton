public class ProgramaSemafaro {
    public static void main(String[] args) {

        String tipoSemafaro = "SinalVermelho";

        GerenciadorSemafaro gerenciador = new GerenciadorSemafaro(tipoSemafaro);
        gerenciador.exibirCor();
    }
}
