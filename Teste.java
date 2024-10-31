public class Teste {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando o Reprodutor Musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.pausar();

        // Testando o Aparelho Telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuIphone.exibirPagina("www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
