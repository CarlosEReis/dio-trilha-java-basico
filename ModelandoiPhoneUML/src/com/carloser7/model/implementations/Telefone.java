package com.carloser7.model.implementations;

import java.util.logging.Logger;

import com.carloser7.model.interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    private static final Logger LOGGER = Logger.getLogger(Telefone.class.getName());

    @Override
    public void ligar(String numero) throws InterruptedException {
        Thread.sleep(1000);
        LOGGER.info("Iniciando ligação para " + numero + "\n" );
    }

    @Override
    public void atender()throws InterruptedException {
        Thread.sleep(1000);
       LOGGER.info("Atendendo uma ligação \n");
    }

    @Override
    public void iniciarCorreioVoz() throws InterruptedException {
        Thread.sleep(1000); 
        LOGGER.info("Iniciando Correio de Voz \n");
    }
    


}
