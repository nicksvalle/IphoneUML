public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Something in the way - Nirvana");
        iphone.ligar("(11)98732-4589");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://github.com/nicksvalle");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
