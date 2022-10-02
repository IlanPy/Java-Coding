/*
 * Playing rock paper scissors with the computer
 * Ilan Sela
 * 2/12/2022
 * JDK 17
 */

import javax.swing.JOptionPane;

public class RockPaperScissors {
    public static void main(String[] args) {
        int tieCheck = 1;
        do {
            int ranNum = randomNumber();
            int userNum = userNumber();
        
            tieCheck = decideWinner(userNum, ranNum);
            if(tieCheck == 2) {
                JOptionPane.showMessageDialog(null, "Play again to decide the winner!!");
            }
        } while (tieCheck == 2);
    }
    
    public static int randomNumber() {
        return (int) (Math.random() * 3 + 1);
    }
    
    public static int userNumber() {
        int response;
        do {
        String input = JOptionPane.showInputDialog(null,
                "Select a number correlated to the option: "
                        + "\n1: Rock"
                        + "\n2: Paper"
                        + "\n3: Scissors");
        response = Integer.parseInt(input);
        if(response !=1 && response != 2 && response != 3) {
            JOptionPane.showMessageDialog(null, "Please re-enter a valid number");
        }
        } while(response != 1 && response != 2 && response != 3);
        return response;
    }
    
    public static int decideWinner(int user, int random) {
        int returnValue = 1;
        if(user == 1) {
            switch (random){
                case 1: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Rock"
                                + "\nUser's choice: Rock"
                                + "\nIt's a tie!");
                        returnValue = 2;
                        break;
                case 2: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Paper"
                                + "\nUser's choice: Rock"
                                + "\nYou lose!!");
                        break;
                case 3: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Scissors"
                                + "\nUser's choice: Rock"
                                + "\nYou win!!");
                        break;
            }
        } else if(user == 2) {
            switch (random){
                case 1: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Rock"
                                + "\nUser's choice: Paper"
                                + "\nYou win!!");
                        break;
                case 2: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Paper"
                                + "\nUser's choice: Paper"
                                + "\nIt's a tie!");
                        returnValue = 2;
                        break;
                case 3: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Scissors"
                                + "\nUser's choice: Paper"
                                + "\nYou lose!!");
                        break;
            }
        } else if(user == 3) {
            switch (random){
                case 1: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Rock"
                                + "\nUser's choice: Scissors"
                                + "\nYou lose!!");
                        break;
                case 2: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Paper"
                                + "\n User's choice: Scissors"
                                + "\nYou win!!");
                        break;
                case 3: JOptionPane.showMessageDialog(null, 
                                "Computer's choice: Scissors"
                                + "\nUser's choice: Scissors"
                                + "\nIt's a tie!");
                        returnValue = 2;
                        break;
            }
        }
        return returnValue;
    }
}
