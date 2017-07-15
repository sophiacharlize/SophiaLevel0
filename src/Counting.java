import javax.swing.JOptionPane;

public class Counting {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("how old are you?");
		int age = Integer.parseInt(answer);	
		for (int i = 2017 - age; i <= 2017 ; i++) { 
		System.out.println(i);	
			
		}
			
		}
	}

