package day3;





// Copyright Wintriss Technical Schools 2013


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8 {

	// 1. Make a main method that includes all the steps below….
		public static void main(String[] args) {
			
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		
	// 3. Print out this variable
			
			
			for (int j = 0; j < 10; j++) {
				
				
				int i = new Random().nextInt(4);
	// 4. Get the user to enter a question for the 8 ball
				System.out.println(i);
			String a = JOptionPane.showInputDialog("Ask a question.");
	// 5. If the random number is 0
			
		if(i == 0){
			
			JOptionPane.showMessageDialog(null,"Yes");
			
		}
			
	// -- tell the user "Yes"

	// 6. If the random number is 1
		else if(i == 1){
			
			JOptionPane.showMessageDialog(null,"No");
			
		
		}

	// -- tell the user "No"

	// 7. If the random number is 2
		else if(i == 2){
			
			JOptionPane.showMessageDialog(null,"Maybe you should ask Google?");
			
		}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		else if(i == 3){
			
			JOptionPane.showMessageDialog(null,"Ask Siri");
			
		}
	// -- write your own answer

}

}
}