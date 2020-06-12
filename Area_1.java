import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Area_1 extends JFrame{
	private JLabel  blankSpace, blank2, blank3, blankL, blankW,
	blankR, blankSphArea, blankRadSph,
	blankRecArea,blankCirArea;

	private JTextField  radiusTF, lengthTF,
	widthTF, cirTF, sphTF,
	recTF,radSphTF;

	private JButton calculateCir,calculateRec, calculateSph, exitB;

	private CalculateRec calRec;
	private CalculateCir calCir;
	private CalculateSph calSph;
	private ExitButtonHandler ebHandler;

	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;

	public Area_1()
	{

		blankSpace = new JLabel("");
		blank2 = new JLabel("");
		blank3 = new JLabel("");
	

		blankSphArea = new JLabel("Sphere Area", SwingConstants.RIGHT);
		blankCirArea = new JLabel("Circle Area",SwingConstants.RIGHT);
		blankRecArea = new JLabel("Rectangle Area ", SwingConstants.RIGHT);
		blankL = new JLabel("Length: ", SwingConstants.RIGHT);
		blankW = new JLabel("Width: ", SwingConstants.RIGHT);
		blankR = new JLabel("Radius: ", SwingConstants.RIGHT);
		blankRadSph = new JLabel("Radius: ", SwingConstants.RIGHT);



		cirTF = new JTextField(10);
		sphTF = new JTextField(10);
		recTF = new JTextField(10);
		radiusTF = new JTextField(10);
		lengthTF = new JTextField(10);
		widthTF = new JTextField(10);
		radSphTF = new JTextField(10);

		calculateCir = new JButton("Calculate");
		calCir = new CalculateCir();
		calculateCir.addActionListener(calCir);

		calculateRec = new JButton("Calculate");
		calRec = new CalculateRec();
		calculateRec.addActionListener(calRec);

		calculateSph = new JButton("Calculate");
		calSph = new CalculateSph();
		calculateSph.addActionListener(calSph);


		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);


		setTitle("Input Positive Integers to Calculate the Area");


		Container pane = getContentPane();

		pane.setLayout(new GridLayout(0,2));


		pane.add(blankL);
		pane.add(lengthTF);
		pane.add(blankW);      
		pane.add(widthTF);
		pane.add(blankRecArea);
		pane.add(recTF);
		pane.add(blankSpace);
		pane.add(calculateRec);

		pane.add(blankR);
		pane.add(radiusTF);       
		pane.add(blankCirArea);
		pane.add(cirTF);  
		pane.add(blank2);
		pane.add(calculateCir);


		pane.add(blankRadSph);
		pane.add(radSphTF);
		pane.add(blankSphArea);
		pane.add(sphTF);
		pane.add(blank3);
		pane.add(calculateSph);

		pane.add(exitB);           


		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class CalculateRec implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		
			try {
				double height, width,  rec;

				height = Double.parseDouble(lengthTF.getText());
				width = Double.parseDouble(widthTF.getText());
				rec = height * width;
				recTF.setText(""+ String.format("%.2f", rec));

				if( height < 0 || width < 0)
					throw new Exception("Enter Positive Number"); 
			}
			catch (NumberFormatException f) {
				recTF.setText("Enter Positive Integer");
			}
			catch (Exception f) {
				recTF.setText("Negative integer is not accepted");
			}
		}
	}
	private class CalculateSph implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
		
			try {
				double radius, sph;

				radius = Double.parseDouble(radSphTF.getText());
				sph =   4*(3.14 )* (radius*radius);
				sphTF.setText(""+ String.format("%.2f", sph));
				if (radius<0)
					throw new Exception();


			}
			catch (NumberFormatException h) {
				sphTF.setText("Enter Positive Number");
			}
			catch (Exception h) {
				sphTF.setText("Negative integer is not accepted");
			}



		}
	}


	private class CalculateCir implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			
			try {
				double radius, cir;

				radius = Double.parseDouble(radiusTF.getText());
				cir =   3.14 * (radius*radius);
				cirTF.setText(""+ String.format("%.2f", cir));
				if (radius<0)
					throw new Exception();


			}
			catch (NumberFormatException h) {
				cirTF.setText("Enter Positive Number");
			}
			catch (Exception h) {
				cirTF.setText("Negative integer is not accepted");
			}

		}
	}


	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		Area_1 Frame = new Area_1();
	}

}