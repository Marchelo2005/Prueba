package com.example.initialsummative;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.SignatureSpi;
import java.util.Scanner;
public class HelloApplication {

    public static void main(String[] args) {

        Scanner Keyboard=new Scanner(System.in);
        int numStaircase=0;
        numStaircase = Keyboard.nextInt();
        System.out.println("staircase");
        if (numStaircase>0) {
            for (int iterator1 = 0; iterator1 <= numStaircase; iterator1++) {

                if (iterator1 > 0) {
                    System.out.print(" _|");
                    System.out.println("");
                }
                for (int iterator = numStaircase - iterator1; iterator >= 0; iterator--) {
                    System.out.print(" ");

                }

            }
        } else if (numStaircase < 0) {
            numStaircase = -numStaircase;
            for (int iterator1 = 0; iterator1 < numStaircase; iterator1++) {
                for (int iterator = 0; iterator < iterator1; iterator++) {
                    System.out.print(" ");
                }

                System.out.print("|_");
                System.out.println();
            }
        }else {
            System.out.println("__");
        }
    }

}