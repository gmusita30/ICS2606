import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Candy_Machine extends JFrame{

	private JLabel blankItem,blankQuantity, blankCash, blankSpace, 
					blankSpace1;

	private JTextField changeTF, quantityTF, amount2TF, cashTF;

	private JButton candy1, candy2, candy3,candy4,amount, change, exitA;

	private candy1 can1;
	private candy2 can2;
	private candy3 can3;
	private candy4 can4;
	private amount amt;
	private change cha;
	private ExitButtonHandler ebHandler;

	private static final int WIDTH = 600;
	private static final int HEIGHT = 700;
	private static double  price = 0;
	//private static String candy;
	
	
	public Candy_Machine() {

		setTitle("Candy Machine");


		blankItem = new JLabel("Price: ",SwingConstants.CENTER);
		blankQuantity = new JLabel("Quantity",SwingConstants.CENTER);
		blankCash = new JLabel("Enter Cash",SwingConstants.CENTER);
		blankSpace1 = new JLabel("",SwingConstants.CENTER);

		
		blankSpace = new JLabel("");
		
	
		
		
		changeTF = new JTextField(15);
		quantityTF = new JTextField(10);
		amount2TF = new JTextField(10);
		cashTF = new JTextField(10);


		candy1 = new JButton("Candy");
		can1 = new candy1();
		candy1.addActionListener(can1);

		candy2 = new JButton("Gum");
		can2 = new candy2();
		candy2.addActionListener(can2);

		candy3 = new JButton("Chips");
		can3 = new candy3();
		candy3.addActionListener(can3);

		candy4 = new JButton("Cookie");
		can4 = new candy4();
		candy4.addActionListener(can4);

		amount = new JButton("Total Amount");
		amt = new amount();
		amount.addActionListener(amt);

		change = new JButton("Get Change");
		cha = new change();
		change.addActionListener(cha);

		exitA = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitA.addActionListener(ebHandler);



		Container pane = getContentPane();

		pane.setLayout(new GridLayout(0,1));

		pane.add(candy1); pane.add(candy2); pane.add(candy3); pane.add(candy4);
		

		pane.add(blankItem); pane.add(blankSpace1);pane.add(blankCash);pane.add(cashTF);

		pane.add(blankQuantity);pane.add(quantityTF);pane.add(change); pane.add(changeTF);
		

		pane.add(amount);pane.add(amount2TF);

		

		

		pane.add(blankSpace);
		pane.add(exitA);

		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		
	}
	private class candy1 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			blankSpace1.setText("10Php");
			price = 10;
		}

	}

	private class candy2 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			blankSpace1.setText("25Php");
			price = 25;
		}

	}

	private class candy3 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			blankSpace1.setText("40Php");
			price = 40;

		}

	}

	private class candy4 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			blankSpace1.setText("55Php");
			price = 55;
		}

	}

	private class amount implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
			double quantity, total;
			
			quantity = Double.parseDouble(quantityTF.getText());
			total = quantity * price;
			
			amount2TF.setText("" + total + "php" );
			if (quantity <= 0)
				throw new Exception("Enter desired quantity");
			}
			catch (NumberFormatException a) {
				amount2TF.setText("Enter desired quantity");
			}
			catch(Exception a) {
				amount2TF.setText("Enter desired quantity");
			}
			
		}
			

	}

	private class change implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			
			try {
			double cash, total, quantity, change, difference;
			
		
			quantity = Double.parseDouble(quantityTF.getText());
			total = quantity * price;
			cash = Double.parseDouble(cashTF.getText());
			difference = total - cash;
			change = cash - total;
			
			
			if (cash == total) {
		
				changeTF.setText("Enjoy your food");
			}
			
			if (cash > total) {
				
				
				
			changeTF.setText("Your change is " + change + "php" );
			}
			
			if (cash < total) {
				
				changeTF.setText("Please insert " + difference +"php more");
			}
			
			if (cash <= 0)
				throw new Exception("Insert appropriate amount ofcash");
			}
			
			catch(NumberFormatException b) {
				changeTF.setText("Insert appropriate amount of cash");
			}
			catch (Exception b) {
				changeTF.setText("Insert appropriate amount of cash");
			}
			
			
		

		}

	}

	private class ExitButtonHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}

	}



	public static void main(String[] args) {

		Candy_Machine candy = new Candy_Machine();
	}

}
