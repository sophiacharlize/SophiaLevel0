import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	
	String word= JOptionPane.showInputDialog("write a word");
	JOptionPane.showMessageDialog(null, word + " is awesome");
	String sentence= JOptionPane.showInputDialog("write another word");
JOptionPane.showMessageDialog(null, sentence + " is not awesome");
}
}
