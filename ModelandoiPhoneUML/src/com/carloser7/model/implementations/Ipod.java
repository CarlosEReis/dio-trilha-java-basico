package com.carloser7.model.implementations;

import java.util.logging.Logger;

import com.carloser7.model.interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

    private static final Logger LOGGER = Logger.getLogger(Ipod.class.getName());

    @Override
    public void tocar() throws InterruptedException {
        LOGGER.info("Iniciando stream de aúdio...\n");
    }

    @Override
    public void pausar() throws InterruptedException {
        LOGGER.info("Pausando o stream de aúdio...\n");
    }

    @Override
    public void selecionarMusica(String musica) throws InterruptedException {
        LOGGER.info(String.format("Música - %s, selecionada com sucesso\n", musica));
    }
    
}
