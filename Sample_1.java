
//public class Sample_1 {

//}
//This Java Program determines the weighted average
//of four test scores.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sample_1 extends JFrame
{
private JLabel  blankoneL, blanktwoL,
                blankthreeL, scoreL,
                weightL, oneL, twoL,
                threeL,fourL,averageL;

private JTextField  oneTF, twoTF,
                    threeTF, fourTF,woneTF, wtwoTF,
                    wthreeTF, wfourTF, averageTF;

private JButton calculateB, exitB;

private CalculateButtonHandler cbHandler;
private ExitButtonHandler ebHandler;

private static final int WIDTH = 500;
private static final int HEIGHT = 500;

public Sample_1()
{
        // Create eight labels
    blankoneL = new JLabel("");
    blanktwoL = new JLabel("");
    blankthreeL = new JLabel("");

    scoreL = new JLabel("Score",
                        SwingConstants.CENTER);
    weightL = new JLabel("Weight",
                        SwingConstants.CENTER);
    oneL = new JLabel("Test one: ",
                        SwingConstants.RIGHT);
    twoL = new JLabel("Test two: ",
                        SwingConstants.RIGHT);
    threeL = new JLabel("Test three: ",
                        SwingConstants.RIGHT);
    fourL = new JLabel("Test four: ",
                        SwingConstants.RIGHT);
    averageL = new JLabel("Average score: ",
                          SwingConstants.RIGHT);

        //Create four textfields
    oneTF = new JTextField(10);
    twoTF = new JTextField(10);
    threeTF = new JTextField(10);
    fourTF = new JTextField(10);
    woneTF = new JTextField(10);
    wtwoTF = new JTextField();
    wthreeTF = new JTextField(10);
    wfourTF = new JTextField(10);
    averageTF = new JTextField(10);
//     Font font1 = new Font("SansSerif", Font.BOLD, 100);
    
        //create Calculate Button
    calculateB = new JButton("Calculate");
    cbHandler = new CalculateButtonHandler();
    calculateB.addActionListener(cbHandler);

        //Create Exit Button
    exitB = new JButton("Exit");
    ebHandler = new ExitButtonHandler();
    exitB.addActionListener(ebHandler);

        //Set the title of the window
    setTitle("Weighted Average Computation");

        //Get the container
    Container pane = getContentPane();

        //Set the layout
    pane.setLayout(new GridLayout(7, 3));

        //Place the components in the pane
    pane.add(blankoneL);
    pane.add(scoreL);
    pane.add(weightL);      //first row
    pane.add(oneL);
    pane.add(oneTF);
    pane.add(woneTF);       //second row
    pane.add(twoL);
    pane.add(twoTF);
    pane.add(wtwoTF);       //third row
    pane.add(threeL);
    pane.add(threeTF);
    pane.add(wthreeTF);     //fourth row
    pane.add(fourL);
    pane.add(fourTF);
    pane.add(wfourTF);      //fifth row
    pane.add(averageL);
    pane.add(averageTF);
    pane.add(blanktwoL);    //sixth row
    pane.add(calculateB);
    pane.add(blankthreeL);
    pane.add(exitB);        //seventh row

        //set the size of the window and display it
    setSize(WIDTH, HEIGHT);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}

private class CalculateButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        double one, wone, two, wtwo,
               three, wthree, four, wfour, ave;

        one = Double.parseDouble(oneTF.getText());
        wone = Double.parseDouble(woneTF.getText());
        two = Double.parseDouble(twoTF.getText());
        wtwo = Double.parseDouble(wtwoTF.getText());
        three = Double.parseDouble(threeTF.getText());
        wthree = Double.parseDouble(wthreeTF.getText());
        four = Double.parseDouble(fourTF.getText());
        wfour = Double.parseDouble(wfourTF.getText());

        ave = one * wone + two * wtwo + three * wthree
             + four * wfour;

        averageTF.setText(""+ String.format("%.2f", ave));
    }
}

private class ExitButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}

public static void main(String[] args)
{
    Sample_1 wAveObject = new Sample_1();
}
}