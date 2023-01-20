package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] tttBoard = new String[9];
        String player = "X";
        String winner = "";

        for(int i =0;i<9;i++){
            tttBoard[i]=String.valueOf(i+1);
        }
        TicTacToe.printBoard(tttBoard);
        System.out.println("Tic Tac Toe game");
        System.out.println("-------------");
        System.out.println("X will play first");

        Scanner scanner = new Scanner(System.in);

        while(winner ==""){
            // play tic-tac-toe
            int input;
            input = scanner.nextInt();
            if((input>0)&&(input<10)){           

            }else{
                System.out.println("Only number 1 to 9 is allowed");
                continue;
            }
            //
            if(tttBoard[input-1].equals(String.valueOf(input))){
                tttBoard[input-1]=player;
                if(player.equalsIgnoreCase("X")){
                    player = "O";
                } else 
                player = "X";
            } else{
                System.out.println("position already occupied, enter another position");
            }

            TicTacToe.printBoard(tttBoard);
            winner = TicTacToe.checkWinner(tttBoard);

            if(winner.equalsIgnoreCase("draw")){
                System.out.println("It's a "+winner);
            } else{
                System.out.println("The winner is :"+winner);
            }

        }
        scanner.close();

    }   
     
}
