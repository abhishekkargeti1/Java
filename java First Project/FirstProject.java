import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FirstProject extends JFrame
{
	
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	 void setComponents()
	{
		l1=new JLabel("Welcome to ICIC BANK");
		l1.setFont(new Font("Time New Roman", Font.BOLD, 70));
		l5=new JLabel("Login Page");
		l5.setFont(new Font("Time New Roman", Font.BOLD, 25));
		l2=new JLabel("Username");
		l2.setFont(new Font("Time New Roman", Font.BOLD, 18));
		l3=new JLabel("Password");
		l3.setFont(new Font("Time New Roman",Font.BOLD,18));
		l4=new JLabel();
		t1=new JTextField();
		t2=new JPasswordField();
		b1=new JButton("Login");
		b2=new JButton("Clear");
		setLayout(null);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		l1.setBounds(400,100,1000,130);
		l2.setBounds(760,350,100,30);
		l5.setBounds(750,240,200,30);
		l3.setBounds(760,500,100,30);
		t1.setBounds(550,400,500,30);
		t2.setBounds(550,550,500,30);
		b1.setBounds(650,600,100,30);
		b2.setBounds(850,600,100,30);
		b1.addActionListener(new login());
	
	}
	
	public static void main(String []args) 
	{
		FirstProject a1 =new FirstProject();
		a1.setTitle("Welcome To ICIC Bank");
		a1.setVisible(true);
		a1.setComponents();
		a1.setSize(1920,1080);
		a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class login implements ActionListener
	{
		
			
		public void actionPerformed(ActionEvent e1)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();
			try
			{
				if(s1.equals("Admin") && s2.equals("Admin"))
				{
					JOptionPane.showMessageDialog(null, "Login Successfull");
					SecondPage z1=new SecondPage(); 
					z1.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Login Unsuccessfull");
				}
			}
			catch(Exception e2)
			{
				System.out.println("System Error");
			}
		}
	

	}

}