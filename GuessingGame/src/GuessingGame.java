/*
 * This Program generates a random number from 1-10 and then
 * has the user try to guess that number
 * Ilan Sela
 * 2/5/2022
 * JDK 1.17
 */

import javax.swing.JOptionPane;

public class GuessingGame {
    public static void main(String[] args) {
        // generate a random number from 1 to 10
        int computerNumber = (int) (Math.random() * 10 + 1);
        // display the correct guess for testing purposes
        System.out.println("The correct guess would be " + computerNumber);
        int userAnswer = 0;
        int count = 0;
        while (computerNumber != userAnswer) {
            count++;
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 10");
            userAnswer = Integer.parseInt(response);
            String result = null;
            if (userAnswer == computerNumber) {
                result = "Correct";
            } else {
                if (userAnswer<=0 || userAnswer>10) {
                    result = "Invalid guess";
                } else if (userAnswer > computerNumber) {
                    result = "Too High";
                } else {
                    result = "Too Low";
                }
            }
            JOptionPane.showMessageDialog(null, result
                    + "\nTry number " + count);
        }
        if (count == 1) {
            JOptionPane.showMessageDialog(null, "You must be psychic!");
        } else if (count < 3) {
            JOptionPane.showMessageDialog(null, "Amazing!");
        } else if (count < 5) {
            JOptionPane.showMessageDialog(null, "Great Job!");
        } else {
            JOptionPane.showMessageDialog(null, "You need some practice");
        }
    }
}
