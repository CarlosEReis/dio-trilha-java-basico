package com.carloser7.model;

import com.carloser7.model.implementations.Ipod;
import com.carloser7.model.implementations.Safari;
import com.carloser7.model.implementations.Telefone;
import com.carloser7.model.interfaces.AparelhoTelefonico;
import com.carloser7.model.interfaces.NavegadorInternet;
import com.carloser7.model.interfaces.ReprodutorMusical;

public class Iphone {
    
    private AparelhoTelefonico telefone = new Telefone();
    private NavegadorInternet browser = new Safari();
    private ReprodutorMusical reprodutorMusical = new Ipod();

    public AparelhoTelefonico getTelefone() {
        return telefone;
    }

    public NavegadorInternet getBrowser() {
        return browser;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }
}
