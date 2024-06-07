package com.example.robotcoordinates;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication {


    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int Steps = 0, Coordinates = 0, numbersCoordinates = 0, coordinatesY = 0, coordinatesX = 0;
        int cont = 0;
        System.out.println("* Calculate where a robot will be (its final coordinates) that lies on a grid represented by the “x” and “y” axes. \n" + "Steps");
        Steps = Keyboard.nextInt();
        if (Steps < 0) {
            Steps = Steps * -1;
        }
        int sequenceSteps[] = new int[Steps];

        for (int iterator = 0; iterator < Steps; iterator++) {
            System.out.println("Step " + (iterator + 1) + ":");
            Coordinates = Keyboard.nextInt();
            sequenceSteps[iterator] = Coordinates;
        }
        for (int iterator = 0; iterator < Steps; iterator++) {
            numbersCoordinates = sequenceSteps[iterator];
            if (cont == 4) {
                cont = 0;
            }
            cont++;
            if (iterator % 2 == 0) {

                if (cont == 3) {
                    numbersCoordinates = numbersCoordinates * -1;
                    coordinatesY = coordinatesY + numbersCoordinates;
                } else if (cont == 1) {
                    coordinatesY = coordinatesY + numbersCoordinates;
                }
            } else {
                if (cont == 2) {
                    numbersCoordinates = numbersCoordinates * -1;
                    coordinatesX = coordinatesX + numbersCoordinates;
                } else if (cont == 4) {
                    coordinatesX = coordinatesX + numbersCoordinates;
                }
            }
        }
        System.out.println("Coordinates \n" + "x: " + coordinatesX + " y: " + coordinatesY +"\n Thank you very much for choosing us! We look forward to serving you again.");
    }

}