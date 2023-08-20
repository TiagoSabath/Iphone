package main;

import java.util.Scanner;

public class NavegadorNaInternet {
    private String paginaAtual;

    public NavegadorNaInternet() {
        this.paginaAtual = paginaAtual;
    }

    public void exibirPagina(){
        System.out.println("Exibindo página");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

    public static void main(String[] args) {
        NavegadorNaInternet navegador = new NavegadorNaInternet();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();


    }

}
