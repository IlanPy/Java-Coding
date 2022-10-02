import javax.swing.JOptionPane;

public class BackwardString {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a word");
        backString(input);
    }
    public static void backString(String str){
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        JOptionPane.showMessageDialog(null, reverse);
    }
}
