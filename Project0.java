import javax.swing.JOptionPane;

public class Project0 {
   
    public static void main(String[] args) {
        //keeping track of the number of times the upper and lower e appears
        int counterUpper = 0, counterLower = 0; 
        //while true loop to keep the program running until the user enters stop
        while(true){
            String userInput = JOptionPane.showInputDialog(null, "Please enter a sentence.");
            
            //if the user enters stop, the program will terminate ingorning case sensitivity
            if(userInput.equalsIgnoreCase("stop")){
                System.exit(0);
            }
            
            //counting the number of upper and lower case e's in the sentence using for loop
            for(int i = 0; i < userInput.length(); i++){
                //getting the current character in the sentence
                char currentChar = userInput.charAt(i);
                
                //checking if the current character is an upper or lower case e and incrementing the counter
                if(currentChar == 'E'){
                    counterUpper++;
                }
                else if(currentChar == 'e'){
                    counterLower++;
                }
                
            }
            
            //displaying the number of upper and lower case e's in the sentence
            JOptionPane.showMessageDialog(null, "Number of lower case e's: " + counterLower + "\nNumber of upper case e's: " + counterUpper);
            //resettting the counters for the next sentence
            counterUpper = 0;
            counterLower = 0;
        }
    }
}
