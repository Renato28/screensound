package br.com.alura.screensound.principal;

import br.com.alura.screensound.repository.ArtistaRepository;

public class Principal {

    private final ArtistaRepository repositorio;

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
    }
}
