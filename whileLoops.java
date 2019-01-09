import javax.swing.JOptionPane;

public class whileLoops
{
    public static void main(){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        
        while (age<0 || 123>age) {
            System.out.println("Thank You");
        }
        //if (age < 0) {
            //System.out.println("Sorry, that age is not valid, please enter your age.");
            //int newAge = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        //}
          //  else if (age > 123) {
            //    System.out.println("That is not possible, please enter your name.");
              // int newAge2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
            //}
    }
}
