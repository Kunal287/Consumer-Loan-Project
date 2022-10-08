import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Loan_Assistant extends JFrame {
	Double loan;
	Double interest;
	Double month;
	Double payment;
	Double MonthlyPayment;
	Loan_Assistant(){
	setLayout(null);
	setResizable(false);
	setTitle("Loan_Assistant");
	setSize(600,600);
    JFrame frame=new JFrame();
    JLabel lbl1=new JLabel("Loan Balance");
    lbl1.setBounds(20,90,80,40);
    JTextField txt1=new JTextField();
    txt1.setBounds(150,100,80,20);
    add(lbl1);
    add(txt1);
    JLabel lbl2=new JLabel("Interest Rate");
    lbl2.setBounds(20,130,80,40);
    JTextField txt2=new JTextField();
    txt2.setBounds(150,140,80,20);
    add(lbl2);
    add(txt2);
    JLabel lbl3=new JLabel("Number of Payments");
    lbl3.setBounds(20,180,120,40);
    JTextField txt3=new JTextField();
    txt3.setBounds(150,190,80,20);
    add(lbl3);
    add(txt3);
    JLabel lbl4=new JLabel("Monthly Payment");
    lbl4.setBounds(20,230,100,40);
    JTextField txt4=new JTextField();
    txt4.setBounds(150,240,80,20);
    add(lbl4);
    add(txt4);
    JButton btn1=new JButton("X");
    btn1.setBounds(250,190,45,20);
    add(btn1);
    JButton btn2=new JButton("X");
    btn2.setBounds(250,240,45,20);
    add(btn2);
    JButton btn3=new JButton("Compute Monthly Payment");
    btn3.setBounds(30,290,190,20);
    add(btn3);
    JButton btn4=new JButton("New Loan Analysis");
    btn4.setBounds(50,320,150,20);
    btn4.setEnabled(false);
    add(btn4);
    JLabel lbl5=new JLabel("Loan Analysis:");
    lbl5.setBounds(320,90,100,20);
    add(lbl5);
    JTextArea txt5=new JTextArea();
    txt5.setBounds(320,130,250,200);
    add(txt5);
    JButton btn5=new JButton("Exit");
    btn5.setBounds(400,350,80,20);
    add(btn5);
    String Balance=txt1.getText().toString();
    
    btn1.addActionListener(new ActionListener()
    					   {
					    	public void actionPerformed(ActionEvent e)
					    	{
					    	  btn1.setVisible(false);
					    	  btn2.setVisible(true);
					    	  txt3.setEditable(true);
					    	  txt3.setBackground(Color.WHITE);
					    	  txt3.setFocusable(true);
					    	  txt4.setEditable(false);
					    	  txt4.setBackground(Color.YELLOW);
					    	  txt4.setFocusable(false);
					    	  txt1.requestFocus();
					    	}
					    	});
    btn2.addActionListener(new ActionListener()
							   {
						 	public void actionPerformed(ActionEvent e)
						 	{
						 	  btn2.setVisible(false);
						 	  btn1.setVisible(true);
						 	  txt3.setEditable(false);
					    	  txt3.setBackground(Color.YELLOW);
					    	  txt3.setFocusable(false);
					    	  txt4.setEditable(true);
					    	  txt4.setBackground(Color.WHITE);
					    	  txt4.setFocusable(true);
					    	  txt1.requestFocus();
					    	  btn3.setVisible(true);
						 	}
						 	});
    btn3.addActionListener(new ActionListener()
						   {
    	
						public void actionPerformed(ActionEvent e)
						{
							String iMonthPayment = String.format(txt3.getText());
					        
					        if(txt1.getText().equals("")){
					            JOptionPane.showMessageDialog(null,"You must enter amoun of Balance",
					                    "Loan System",JOptionPane.INFORMATION_MESSAGE);
					        }
					        else {
					            loan = Double.parseDouble(txt1.getText());
					            String Balance = String.format(txt1.getText());
					        }
					        if(txt2.getText().equals("")){
					            JOptionPane.showMessageDialog(null,"You must enter amoun of Interest Rate",
					                    "Loan System",JOptionPane.INFORMATION_MESSAGE);
					        }
					        else {
					            interest = Double.parseDouble(txt2.getText());
					            String iInterest = String.format(txt2.getText());
					        }
					           
					        if(txt3.getText().equals("")){
					            JOptionPane.showMessageDialog(null,"You must enter amoun of Number of Payment",
					                    "Loan System",JOptionPane.INFORMATION_MESSAGE);
					        }
					        else {
					            month = Double.parseDouble(txt3.getText());
					            String iMonth = String.format(txt3.getText());
					        }
					         
					        payment = loan + ((loan * interest)/100);
					        
					        MonthlyPayment = payment / month;
					        String PayMonth = String.format("%.2f",MonthlyPayment);
					        txt4.setText(PayMonth);
					        txt5.setText("\t\n Loan Assistan Project:\n\n");
					         txt5.append("Amount of Loan:\t $"+ loan+
					          "\nNumber of Payment:\t "+ interest+"%"+
					           "\nNumber of Payments:\t " + month+ 
					            "\nPayment Per Month:\t $" +MonthlyPayment+ 
					              "\nTotal Loan Payment:\t $" +payment+ 
					                "\n\nThanks for using loan System");
							txt3.setBackground(Color.YELLOW);
					        btn4.setEnabled(true);
					        btn3.setEnabled(false);
                    
						}
						});
    btn4.addActionListener(new ActionListener()
						   {
					 	public void actionPerformed(ActionEvent e)
					 	{
					 		 txt1.setText("");
					    	  txt2.setText("");
					    	  txt4.setText("");
					    	  txt5.setText("");
					    	  btn4.setEnabled(false);
					    	  btn3.setEnabled(true);
					    	  
					 	}
					 	});
    btn5.addActionListener(new ActionListener()
						   {
					 	public void actionPerformed(ActionEvent e)
					 	{
					 	  System.exit(0);
					 	}
					 	});
	}
	public static void main(String args[]) {
		Loan_Assistant l=new Loan_Assistant();
		l.getContentPane().setBackground(Color.CYAN);
		l.setVisible(true);
	}

}
