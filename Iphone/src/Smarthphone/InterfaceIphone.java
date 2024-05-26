package Smarthphone;

import Smarthphone.Funcionalidades.AparellhoTelefonico;
import Smarthphone.Funcionalidades.Navegador;
import Smarthphone.Funcionalidades.ReprodutorMusical;

public interface InterfaceIphone {
    public static void main(String[] args) {
        AparellhoTelefonico telefone = new AparellhoTelefonico();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        ReprodutorMusical player = new ReprodutorMusical();
        player.tocar();
        player.pausar();
        player.selecionarMusica();

        Navegador navegador = new Navegador();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

    }
}
