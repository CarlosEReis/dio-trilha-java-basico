package com.carloser7.model.interfaces;

public interface NavegadorInternet {
    
    public void exibirPagina(String url) throws InterruptedException;

    public void adicionarNovaAba() throws InterruptedException;

    public void atualizarPagina() throws InterruptedException;
}
