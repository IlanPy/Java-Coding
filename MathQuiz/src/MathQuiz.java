/*
 * Creates a number of equations for the user to answer
 * Ilan Sela
 * 2/5/2022
 * JDK 1.17
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MathQuiz {
    public static void main(String[] args) {
        String response = JOptionPane.showInputDialog(null,
                "How many equations would you like to solve?");
        int numberEq = Integer.parseInt(response);
        String result;
        String operator = null;
        int answer = 0;
        int count = 0;
        
        for (int i = 0;i<numberEq;i++) {

            int num1 = (int)(Math.random() * 10 + 1);
            int num2 = (int)(Math.random() * 10 + 1);
            int num3 = (int)(Math.random() * 3 + 1);
            
            // if statement to determine operator
            if(num3 == 1) {
                operator = "+";
                answer = num1+num2;
            }
            else if(num3 == 2) {
                operator = "-";
                answer = num1-num2;
            }
            else if(num3 == 3) {
                operator = "*";
                answer = num1*num2;
            }
                
            String response2 = JOptionPane.showInputDialog(null,
                    num1 + operator + num2 + "=?");
            int answerInput = Integer.parseInt(response2);
            if (answerInput == answer) {
                JOptionPane.showMessageDialog(null, "Correct");
                count++;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect");
            }
        }
        // percent of correct answers + format
        double percent = ((double)count/numberEq) * 100;
        DecimalFormat p = new DecimalFormat("0.#");
        
        /* if statement for displaying a message 
         * correlating to percent of correct answers
        */
        if(percent >= 90)
            result = "You did amazing!";
        else if (percent >= 80)
            result = "You did okay.";
        else if (percent >= 70)
            result = "You didn't do very well.";
        else if (percent >= 60)
            result = "You need more practice.";
        else
            result = "You need to start studying!";
        
        // final output
        JOptionPane.showMessageDialog(null, "You got " + count + " out of " +
                numberEq + " questions correct.\n" +
                "which equates to " + p.format(percent) + "%\n" +
                result);
    }
    
}
