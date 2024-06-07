package com.example.seriesdidactics;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication  {


    public static void main(String[] args) {
        System.out.print("Write a program that displays by console (with a print) the numbers from 1 to 100 (both included and with a line break between each print), substituting the following:\n" +
                " * - Multiples of 3 for the word “fizz”.\n" +
                " * Multiples of 5 for the word “buzz”.\n" +
                " * - Multiples of 3 and 5 at the same time for the word “fizzbuzz”.\n"+"Series: "+"\n");
        for (int iterator=1 ; iterator<=100; iterator++){

            if ((iterator%3==0) && (iterator%5==0)){
                System.out.print("fizzbuzz"+"\n");
            }else if (iterator%3==0){
                System.out.print("fizz"+"\n");
            }else if (iterator%5==0){
                System.out.print("buzz"+"\n");
            }else {
                System.out.print(iterator+"\n");
            }
        }

    }
}