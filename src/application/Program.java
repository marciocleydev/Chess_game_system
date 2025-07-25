package application;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());


        sc.close();
    }
}
