package com.carloser7.model.interfaces;

public interface ReprodutorMusical {
    
    public void tocar() throws InterruptedException;

    public void pausar() throws InterruptedException;

    public void selecionarMusica(String musica) throws InterruptedException;
}
