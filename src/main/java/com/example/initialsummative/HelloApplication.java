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
        // primer ejercicio
        int numescalera=0;
        numescalera = Keyboard.nextInt();
        System.out.println("Escalera");
        System.out.println("        _");
        if (numescalera>0) {


            for (int iterator1 = 0; iterator1 <= numescalera; iterator1++) {

                if (iterator1 > 0) {
                    System.out.print(" _|");
                    System.out.println("");
                }
                for (int iterator = numescalera - iterator1; iterator >= 0; iterator--) {
                    System.out.print(" ");

                }

            }

            }else if(numescalera==0){
            System.out.println("--");
        }
    }
}