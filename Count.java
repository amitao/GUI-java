
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// extend class and implement actionlisteners
public class Count extends JFrame implements ActionListener {

  // setting variables with no values
  private Label labelInput;
  private Label labelOut;
	private TextField textIn;
	private TextField textOut;
  private int sum = 0;
  
  // method
  public Count() {
    		// flowlayout is from lt to rt
		setLayout(new FlowLayout());

		labelInput = new Label("Please enter a number:");
		add(labelInput);

		textIn = new TextField(10);
		add(textIn);

		// event listener
    textIn.addActionListener(this);
    
    labelOut = new Label("The total sums added are: ");
    add(labelOut);  

    textOut = new TextField(10);
    textOut.setEditable(false);  // set text to not editable
    add(textOut);

    setSize(350, 120); // set frame size defined width & height
    setBackground(Color.RED); // set frame background color to blue
    setVisible(true); // set frame to display

    // when x btn is close the program stops running
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }


  // public main method
  public static void main(String[] args) {
    // call method Count()
    new Count();

  }

  // ActionEvent handler - called back when hitting "enter" key on textfield 
  @Override 
  public void actionPerformed(ActionEvent evt) {
    // convert String into Int
    int numberInput = Integer.parseInt(textIn.getText());
    // add numberInput to sum
    sum += numberInput;
    // clear textfield input
    textIn.setText("");
    // display sum on the output textfield
    textOut.setText(sum + "");
  }
}