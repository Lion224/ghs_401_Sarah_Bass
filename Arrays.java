public class Arrays {
    public static void main(){
        
        //declare an arrray of size 12 that holds 12 integers
        int[] myArray = new int[12];
        
        //print the length of the array using the length call
        System.out.println("The length of the array is " + myArray.length);
        
        //store three arbitrary values in the array in three arbitray locations
        myArray[0] = 55;
        myArray[1] = 15;
        myArray[3] = 100;
        myArray[myArray.length - 2] = 8;
        myArray[11] = 73;
        
        //print the contents of the array in a loop, using length to end the loops
        for (int i=0; i<myArray.length; i++){
            
            //print each index and its value
            System.out.println("The value of element: " +i + " in the array is " + myArray[i]);
        }
    }
}