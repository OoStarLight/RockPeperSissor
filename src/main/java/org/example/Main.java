package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1 - Rock"
                    + "\n" + "2 - Paper"
                    + "\n" + "3 - Sissor" + "\n" + "Chose one: ");

            int player = sc.nextInt();

            int computer = ran.nextInt(3) + 1;


            if (player == 1 && computer == 2) {
                System.out.println("Player chose: Rock" + "\n" + "Computer chose: Paper");
                System.out.println("Computer win's");
            }
            if (player == 2 && computer == 1) {
                System.out.println("Player chose: Paper" + "\n" + "Computer chose: Rock");
                System.out.println("Player win's");
            }
            if (player == 3 && computer == 1) {
                System.out.println("Player chose: Scissor" + "\n" + "Computer chose: Rock");
                System.out.println("Computer win's");
            }
            if (player == 1 && computer == 3) {
                System.out.println("Player chose: Rock" + "\n" + "Computer chose: Sissor");
                System.out.println("Player win's");
            }
            if (player == 3 && computer == 2) {
                System.out.println("Player chose: Sissor" + "\n" + "Computer chose: Paper");
                System.out.println("Player win's");
            }
            if (player == 2 && computer == 3) {
                System.out.println("Player chose: Paper" + "\n" + "Computer chose: Sissor");
                System.out.println("Computer win's");
            }
            if(player > 3){
                System.out.println("Chose between the 3 Choices");
            }
            if (player == computer) {

                System.out.println("The Computer has also choosen the same thing");
                System.out.println("No one win's");
            }

            System.out.println("---------------------------------------------");
        }












    }
}