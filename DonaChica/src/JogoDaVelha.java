import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char vazio = ' ';
        char[][] tabuleiro = new char[3][3];
        tabuleiro[0][0] = ' ';
        tabuleiro[0][1] = ' ';
        tabuleiro[0][2] = ' ';
        tabuleiro[1][0] = ' ';
        tabuleiro[1][1] = ' ';
        tabuleiro[1][2] = ' ';
        tabuleiro[2][0] = ' ';
        tabuleiro[2][1] = ' ';
        tabuleiro[2][2] = ' ';
        int x = 0;
        int y = 0;

        System.out.println("Jogo Da Velha para 2 jogadores");

        for(int i=0; i<5; i++) {

            MostrarTabuleiro(tabuleiro);

            System.out.println("jogador X faça sua jogada (digite o numero da coluna e da linha)");
            x = scanner.nextInt();
            y = scanner.nextInt();
            jogadas1(x, y, tabuleiro);

            MostrarTabuleiro(tabuleiro);

            System.out.println("jogador O faça sua jogada (digite o numero da coluna e da linha)");
            x = scanner.nextInt();
            y = scanner.nextInt();
            jogadas2(x, y, tabuleiro);

            if(tabuleiro[0][0]==tabuleiro[1][1]&tabuleiro[2][2]==tabuleiro[1][1]&tabuleiro[0][0]!=vazio){
                System.out.println("O jogador " + tabuleiro[0][0] + " ganhou o jogo");
                i = 5;
            }else
            if(tabuleiro[2][0]==tabuleiro[1][1]&tabuleiro[0][2]==tabuleiro[1][1]&tabuleiro[2][0]!=vazio){
                System.out.println("O jogador " + tabuleiro[2][0] + " ganhou o jogo");
                i = 5;
            }else
            if(tabuleiro[0][0]==tabuleiro[1][0]&tabuleiro[2][0]==tabuleiro[1][0]&tabuleiro[0][0]!=vazio){
                System.out.println("O jogador " + tabuleiro[0][0] + " ganhou o jogo");
                i = 5;
            }else
            if(tabuleiro[0][1]==tabuleiro[1][1]&tabuleiro[2][1]==tabuleiro[1][1]&tabuleiro[0][1]!=vazio){
                System.out.println("O jogador " + tabuleiro[0][1] + " ganhou o jogo");
                i = 5;
            }else
            if(tabuleiro[0][2]==tabuleiro[1][2]&tabuleiro[2][2]==tabuleiro[1][2]&tabuleiro[0][2]!=vazio){
                System.out.println("O jogador " + tabuleiro[0][2] + " ganhou o jogo");
                i = 5;
            }else
            if(tabuleiro[0][0]==tabuleiro[0][1]&tabuleiro[0][2]==tabuleiro[0][1]&tabuleiro[0][0]!=vazio){
                System.out.println("O jogador " + tabuleiro[0][0] + " ganhou o jogo");
                i = 5;
            }else
            if(tabuleiro[1][0]==tabuleiro[1][1]&tabuleiro[1][2]==tabuleiro[1][1]&tabuleiro[1][0]!=vazio){
                System.out.println("O jogador " + tabuleiro[1][0] + " ganhou o jogo");
                i = 5;
            }else
            if(tabuleiro[2][0]==tabuleiro[2][1]&tabuleiro[2][2]==tabuleiro[2][1]&tabuleiro[2][0]!=vazio){
                System.out.println("O jogador " + tabuleiro[2][0] + " ganhou o jogo");
                i = 5;
            }else
                if(i==4){
                    System.out.println("As Jogadas acabaram, o jogo deu velha");
                }
        }
        System.out.printf("Para jogar denovo reinicie o programa");
    }

    //mostrar tabuleiro
    static void MostrarTabuleiro(char[][] tab){
        System.out.println("  0  1  2");
        for(int i = 0; i < 3; i++){
            System.out.print(i + " ");
            for(int j = 0; j < 3; j++){
                System.out.print(tab[i][j] + " |");
            }
            System.out.println("");
            System.out.println("------------------");
        }
    }

    //Jogadas
    static void jogadas1(int x, int y, char[][] tab){
        tab[y][x] = 'X';
        y = 0;
        x = 0;
    }
    static void jogadas2(int x, int y, char[][] tab){
        tab[y][x] = 'O';
        y = 0;
        x = 0;
    }
}