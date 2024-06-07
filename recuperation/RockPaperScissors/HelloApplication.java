package com.example.rockpaperscissors;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class HelloApplication  {


    public static void main(String[] args) {
        String[][] games = {{"R", "S"}, {"S", "R"}, {"P", "S"}};

        int playerOneWins = 0,playerTwoWins = 0,randomly=0,randomly1=0;
        Random numRandom = new Random();
        System.out.println("Create a program that calculates who wins the most games at rock,\n" +
                "paper, scissors.");
        for (int i = 0; i < games.length; i++) {
            randomly=numRandom.nextInt(3);
            randomly1=numRandom.nextInt(3);
            String playerOneMove = games[randomly][0];
            String playerTwoMove = games[randomly1][1];
            System.out.println("("+playerOneMove+","+playerTwoMove+")");
            if (!playerTwoMove.equals(playerOneMove)) {
                if ((playerOneMove.equals("R") && playerTwoMove.equals("S")) || (playerOneMove.equals("S") && playerTwoMove.equals("P")) || (playerOneMove.equals("P") && playerTwoMove.equals("R"))) {
                    playerOneWins++;
                } else {
                    playerTwoWins++;
                }
            }
        }


        String result;
        if (playerOneWins == playerTwoWins) {
            result = "Tie";
        } else if (playerOneWins > playerTwoWins) {
            result = "Player 1";
        } else {
            result = "Player 2";
        }

        System.out.println("Win: "+result);


    }
}