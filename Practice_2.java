import javax.swing.JOptionPane;

/*
 * Make a program that asks the user how many bedrooms their house has.
 * Give them the following response based on their input
 * 
 * less than 0 : Give them an error
 * equal to 0 : Come stay at my place!
 * one to three : That's cool
 * greater than 3 : You have a big house! 
 */
public class Practice_2 {
	public static void main(String[] args) {
		String bedrooms = JOptionPane.showInputDialog(null, "How many bedrooms does your house have?");
Integer.parseInt(bedrooms);
if (bedrooms){
	JOptionPane.showMessageDialog(null, "ERROR");
}

else if (bedrooms.equals(0)){
	JOptionPane.showMessageDialog(null, "Come stay at my place!");
}
else if (bedrooms.
}
}