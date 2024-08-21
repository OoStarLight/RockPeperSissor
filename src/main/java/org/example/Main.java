package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int playerScore = 0;
        int computerScore = 0;

        while (playerScore < 3 && computerScore < 3) {

            System.out.println("1 - Rock"
                    + "\n" + "2 - Paper"
                    + "\n" + "3 - Sissor" + "\n" + "Chose one: ");

            int player = sc.nextInt();

            int computer = ran.nextInt(3) + 1;


            if (player == 1 && computer == 2) {
                System.out.println("Player chose: Rock" + "\n" + "Computer chose: Paper");
                System.out.println("Computer win's");
                computerScore++;
                System.out.println("Player" + playerScore + " || " + " Computer " + computerScore);
            }
            if (player == 2 && computer == 1) {
                System.out.println("Player chose: Paper" + "\n" + "Computer chose: Rock");
                System.out.println("Player win's");
                playerScore++;
                System.out.println("Player " + playerScore + " || " + " Computer " + computerScore);

            }
            if (player == 3 && computer == 1) {
                System.out.println("Player chose: Scissor" + "\n" + "Computer chose: Rock");
                System.out.println("Computer win's");
                computerScore++;
                System.out.println("Player " + playerScore + " || " + " Computer" + computerScore);

            }
            if (player == 1 && computer == 3) {
                System.out.println("Player chose: Rock" + "\n" + "Computer chose: Sissor");
                System.out.println("Player win's");
                playerScore++;
                System.out.println("Player " + playerScore + " || " + " Computer" + computerScore);

            }
            if (player == 3 && computer == 2) {
                System.out.println("Player chose: Sissor" + "\n" + "Computer chose: Paper");
                System.out.println("Player win's");
                playerScore++;
                System.out.println("Player " + playerScore + " || " + " Computer" + computerScore);

            }
            if (player == 2 && computer == 3) {
                System.out.println("Player chose: Paper" + "\n" + "Computer chose: Sissor");
                System.out.println("Computer win's");
                computerScore++;
                System.out.println("Player " + playerScore + " || " + " Computer" + computerScore);

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

        if(playerScore > computerScore){
            System.out.println("'Player' Win! the Round with a Score of: " + playerScore + "||" + computerScore);
            System.out.println("-------------------------------------------");
        }else{
            System.out.println("'Computer' Win! the Round with a Score of: " + computerScore + "||" + playerScore);
            System.out.println("----------------------------------------------");
        }










    }
}