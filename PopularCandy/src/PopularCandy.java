import javax.swing.JOptionPane;

public class PopularCandy {
    public static void main(String[] args) {
        String[] candy = {"Skittles", "Starburst", "Snickers", "Twix"};
        int[] boxes = new int[4];
        int sum = 0;
        
        for(int i=0;i<candy.length;i++) 
        {
            boxes[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of boxes of " + candy[i]));
            if(boxes[i] < 0)
            {
                while(boxes[i] < 0)
                boxes[i] = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "You cannot sell negative boxes.\nRe-enter the number of boxes of " + candy[i]));
            }
            sum += boxes[i];
        }
        JOptionPane.showMessageDialog(null, "Total boxes of candy sold: " + sum +
                "\nHighest selling candy: " + candy[largestIndex(boxes)] +
                "\nLowest selling candy: " + candy[smallestIndex(boxes)]);
    }
    public static int smallestIndex(int[] boxes){
        int index = 0;
        int min = boxes[index];
        
        for(int i = 1; i < boxes.length; i++)
        {
            if(boxes[i] <= min)
            {
                min = boxes[i];
                index = i;
            }
        } return index;
    }
    public static int largestIndex(int[] boxes){
        int index = 0;
        int max = boxes[index];
        
        for(int i = 1; i < boxes.length; i++)
        {
            if(boxes[i] >= max)
            {
                max = boxes[i];
                index = i;
            }
        } return index;
    }
}
