package Smarthphone.Funcionalidades;

import Smarthphone.InterfaceIphone;

public class Navegador implements  InterfaceIphone {


    public void exibirPagina() {
        System.out.println("https://github.com/nogueirawadson");
    }
        public void adicionarNovaAba() {
        System.out.println("Nova Aba");
    }
        public void atualizarPagina() {
        System.out.println("Atualizar Página");
    }
}
