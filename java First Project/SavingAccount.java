import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
import java.util.*;


class SavingAccount extends JFrame
{
	JLabel l1,l2,l3;
	JTextField t1;
	JButton b1;
	void setComponents()
	{
		l1=new JLabel("Saving Account Of ICIC Bank");
		l2 =new JLabel("Enter Amount :");
		t1 =new JTextField();
		b1 =new JButton("Press Here To Continue");
		add(l1);
		add(l2);
		add(t1);
		add(b1);
		setLayout(null);
		l1.setBounds(400,100,800,130);
		l1.setFont(new Font("Time New Roman", Font.BOLD,50));
		l2.setBounds(500,300,800,30);
		l2.setFont(new Font("Time New Roman", Font.BOLD,20));
		t1.setBounds(700,300,100,30);
		b1.setBounds(600,400,500,30);
		b1.addActionListener(new Customer(new Account(100000), t1));
			
	}
	SavingAccount()
	{
	setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(1920, 1080);
	setComponents();
	}
	public static void main(String []args)
		{
			
			
		}
 


}