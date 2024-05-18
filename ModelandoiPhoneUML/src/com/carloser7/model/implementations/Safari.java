package com.carloser7.model.implementations;

import java.util.logging.Logger;

import com.carloser7.model.interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {

    private static final Logger LOGGER = Logger.getLogger(Safari.class.getName());

    @Override
    public void exibirPagina(String url) throws InterruptedException {
        LOGGER.info(String.format("Exibindo página %s.\n", url));
    }

    @Override
    public void adicionarNovaAba() throws InterruptedException {
        LOGGER.info("Nova aba criada.\n");
    }

    @Override
    public void atualizarPagina() throws InterruptedException {
        LOGGER.info("Iniciando atualizacao de página\n");
        LOGGER.info("Atualizando página");
        
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);
        System.out.println("..");
        Thread.sleep(500);
        System.out.println("...");
        Thread.sleep(500);
        System.out.println("....");
        Thread.sleep(500);
        System.out.println(".....");

        LOGGER.info("Página atualizada com sucesso.\n");
    }
    

}
