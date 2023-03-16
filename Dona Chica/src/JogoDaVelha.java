import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        MostrarTabuleiro(tabuleiro);

        jogadas(x,y,tabuleiro);

        MostrarTabuleiro(tabuleiro);

        jogadas(x,y,tabuleiro);



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
    static void jogadas(int x, int y, char[][] tab){
        System.out.println("jogador X faça sua jogada (digite o numero da coluna e da linha)");

        tab[y][x] = 'X';

        System.out.println("jogador O faça sua jogada (digite o numero da coluna e da linha)");

        tab[y][x] = 'O';
    }
}
