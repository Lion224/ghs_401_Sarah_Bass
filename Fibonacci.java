import javax.swing.JOptionPane;
public class Fibonacci
{
    public static void main(){
        int numFib = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
        int[] numbers = new int [numFib];
       
        System.out.println("Index\tFib num.\tRunning total");
       
        int t1 = 0, t2 = 1, total = 0;
        
       
        for (int i=0; i < numFib; i++){
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            
            System.out.println((i+1) + "\t" + t1 + "\t\t" + (total + sum));
        }
       
    }
}
