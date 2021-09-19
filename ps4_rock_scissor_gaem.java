
import java.util.Random;
import java.util.Scanner;

// stone, paper and scissor game
public class ps4_rock_scissor_gaem {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int wordNumber;
        wordNumber = random.nextInt( 3 ) + 1;
        String computerChoice = "";
        String userChoice;
        switch(wordNumber){
            case 1: computerChoice = "paper";
                    break;
            case 2: computerChoice = "rock";
                    break;
            case 3: computerChoice = "scissor";
                    break; 
        }
        
        System.out.print("Choices are paper, rock and scissor.\n");
        System.out.print("Your choice: ");
        userChoice = sc.next();
        if (userChoice.equals(computerChoice)){
            System.out.println("Computer Choice: "+computerChoice);
            System.out.println("Game over");
        }
        else if( computerChoice == "paper" && userChoice == "scissor" || computerChoice == "rock" && userChoice == "paper" || computerChoice == "scissor" && userChoice == "rock" ){
            System.out.println("Computer Choice:"+computerChoice);
            System.out.println("You won the game!");
        }
        else{
            System.out.println("Computer Choice:"+computerChoice);
            System.out.println("You lose the game!");
        }

        sc.close();

        }
    }



