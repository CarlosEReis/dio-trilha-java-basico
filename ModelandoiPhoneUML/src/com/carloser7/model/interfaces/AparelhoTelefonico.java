package com.carloser7.model.interfaces;

public interface AparelhoTelefonico {
    
    public void ligar(String numero) throws InterruptedException;

    public void atender() throws InterruptedException;

    public void iniciarCorreioVoz() throws InterruptedException;
}
