package main;

import java.util.Scanner;

public class ReprodutorMusical {
    private boolean tocando;
    private String musicaAtual;

    public ReprodutorMusical() {
        this.tocando = false;
        this.musicaAtual = "";
    }

    public void tocar(String musica){
        if (!tocando) {
            System.out.println("Tocando a música " + musica);
            tocando = true;
            musicaAtual = musica;
        }else {
                System.out.println("Já está tocando uma música. \n");
            }
    }

    public void pausar(){
        if (tocando){
            System.out.println("Música pausada " + musicaAtual);
            tocando = false;
        }else {
            System.out.println("Não há nenhuma música tocando para pausar. \n");
        }
    }

    public void selecionarMusica(String musica){
        if (!tocando){
            System.out.println("Selecione a música " + musica);
            musicaAtual = musica;
        }else {
            System.out.println("Pare a música atual antes de selecionar outra. \n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        while (true) {
            System.out.println("----------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Tocar");
            System.out.println("2. Pausar");
            System.out.println("3. Selecionar Música");
            System.out.println("0. Sair");
            System.out.println("----------------------");


            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String musicaTocar = scanner.nextLine();
                    reprodutor.tocar(musicaTocar);
                    break;
                case 2:
                    reprodutor.pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musicaSelecionar = scanner.nextLine();
                    reprodutor.selecionarMusica(musicaSelecionar);
                    break;
                case 0:
                    System.out.println("Encerrando o reprodutor musical.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");

            }    }
    }

}
