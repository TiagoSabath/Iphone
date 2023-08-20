package main;
import java.util.Scanner;

class AparelhoTelefonico {
    private boolean ligado;
    private boolean chamadaAtiva;

    public AparelhoTelefonico() {
        ligado = false;
        chamadaAtiva = false;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando ...");
            ligado = true;
        } else {
            System.out.println("Já está ligação.");
        }
    }

    public void atender() {
        if (ligado && !chamadaAtiva) {
            System.out.println("Atendendo chamada.");
            chamadaAtiva = true;
        } else if (!ligado) {
            System.out.println("O aparelho telefônico está desligado.");
        } else {
            System.out.println("Já existe uma chamada ativa.");
        }
    }

    public void iniciarCorreioVoz() {
        if (chamadaAtiva) {
            System.out.println("Iniciando correio de voz...");
            chamadaAtiva = false;
        } else {
            System.out.println("Não há chamada ativa para iniciar o correio de voz.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AparelhoTelefonico aparelho = new AparelhoTelefonico();

        while (true) {
            System.out.println("----------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Ligar");
            System.out.println("2. Atender Chamada");
            System.out.println("3. Iniciar Correio de Voz");
            System.out.println("0. Desligar Chamada");
            System.out.println("----------------------");


            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    aparelho.ligar();
                    break;
                case 2:
                    aparelho.atender();
                    break;
                case 3:
                    aparelho.iniciarCorreioVoz();
                    break;
                case 0:
                    System.out.println("Desligando a chamada.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

