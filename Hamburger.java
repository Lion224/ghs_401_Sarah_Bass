import javax.swing.JOptionPane;

public class Hamburger
{

    //instance variables
    //This is a class called hamburger
    //from this class, we can make as many 
    //hamburger instances(objects) as we want.
    
    //instance variables
    private boolean hasLettuce;
    private int numPatties;
    private String cheeseType;
    
    //zero-argument constructor
    //this runs every time a zero-arg hamburger is made
    //always is named public className
    public Hamburger(){//arguments go in the parenthese, this is a zero-arg constructor
        System.out.println("a hamburger was created\n");
        this.hasLettuce = false;//Boolean.parseBoolean(JOptionPane.showInputDialog("Does your hamburger have lettuce? true/false"));//sets all instance variables 
        
        //if (hasLettuce != true || hasLettuce != false) {
          //  System.out.println("Sorry that is not an acceptable input,\n please enter again in terms of true or false");
            //hasLettuce = Boolean.parseBoolean(JOptionPane.showInputDialog("Does your hamburger have lettuce? true/false"));
        //}
        
        this.numPatties = 1;//Integer.parseInt(JOptionPane.showInputDialog("How many patties does your hamburger have?"));//to generic values
        this.cheeseType = "cheddar";//JOptionPane.showInputDialog("What kind of cheese does your hamburger have?");
        
    }
    
    //multi-arg constructor
    public Hamburger(boolean hasLettuce, int numPatties, String cheeseType) {
        this.hasLettuce = hasLettuce;//set the instance variables to the argument variables 
        this.numPatties = numPatties;
        this.cheeseType = cheeseType;
        
    }
    
    //toString method
    public String toString() {
        String output = "Has lettuce: " + this.hasLettuce + "\nPatties: " + this.numPatties + "\nCheese: " + this.cheeseType + "\n";
        return output; //returns the string output
    }
}


