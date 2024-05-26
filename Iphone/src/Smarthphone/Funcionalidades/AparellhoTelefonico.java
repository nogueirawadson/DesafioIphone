package Smarthphone.Funcionalidades;

import Smarthphone.InterfaceIphone;

public class AparellhoTelefonico implements  InterfaceIphone {

    public void ligar(){
        System.out.println("899981481087");


    }
    public void atender(){
        System.out.println("Antender");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz");
    }
}