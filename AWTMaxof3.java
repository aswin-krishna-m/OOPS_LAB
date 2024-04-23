import java.awt.*;
import java.awt.event.*;
public class AWTMaxof3 extends Frame {
 private TextField n1, n2, n3, res;
 private Button calcBtn;
 public AWTMaxof3(){ 
 setTitle("Maximum of Three Numbers");
 setSize(300, 300);
 setLayout(new FlowLayout()); 
 n1 = new TextField(30);
 n2 = new TextField(30);
 n3 = new TextField(30);
 res = new TextField(25);
 res.setEditable(false);
 calcBtn = new Button("Calculate Maximum");
 add(new Label("Enter three numbers:"));
 add(n1);
 add(n2);
 add(n3);
 add(calcBtn);
 add(new Label("Maximum: "));
 add(res);
 calcBtn.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 calculateMaximum();
 }
 });
 addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 System.exit(0);
 }
 });
 }
 private void calculateMaximum() {
 try {
 double num1 = Double.parseDouble(n1.getText());
 double num2 = Double.parseDouble(n2.getText());
 double num3 = Double.parseDouble(n3.getText());
 double maximum = Math.max(Math.max(num1, num2), num3);
 res.setText(Double.toString(maximum));
 } catch (NumberFormatException ex) {
 res.setText("Invalid input. Enter numbers.");
 }
 }
 public static void main(String[] args) {
 AWTMaxof3 maxN = new AWTMaxof3();
 maxN.setVisible(true);
 }
}
