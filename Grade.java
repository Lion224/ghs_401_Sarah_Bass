import javax.swing.JOptionPane;
public class Grade
{
   public static void main(){
       int percent = Integer.parseInt(JOptionPane.showInputDialog("Please enter your grade percent"));
     
       
       while (percent < 0 || percent > 100){
           percent = Integer.parseInt(JOptionPane.showInputDialog("Please enter a valid number"));
        }
       //if (percent > 90) {
         //  System.out.println("That's an A");
        //}
        //else if (percent > 80) {
          //  System.out.println("That's a B");
        //}
        //else if (percent > 70) {
          //  System.out.println("That's a C");
        //}
        //else if (percent > 60) {
          //  System.out.println("That's a D");
        //}
        //else if(percent > 0) {
          //  System.out.println("That is a F");
        //}
        
        if (percent < 60) {
            System.out.println("F");
        }
        else if (percent < 70) {
            System.out.println("D");
        }
        else if (percent < 80) {
            System.out.println("C");
        }
        else if (percent < 90) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }
    }
}
