import javax.swing.*;
import java.awt.event.*;
class loginP extends JFrame
{
JLabel l1,l2,l3,l4;
JTextField t1;
JPasswordField t2;
JButton b1,b2,b3;
loginP(String s1)
{
	super(s1);
}
void setComponents()
{
l1 =new JLabel("Welcome to my World");
l2 =new JLabel("Username");
l3 =new JLabel("Password");
l4 =new JLabel();
t1 =new JTextField();
t2 =new JPasswordField();
b1 =new JButton("login");
b2 =new JButton("clear");
b3 =new JButton("Add");
setLayout(null);
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
l1.setBounds(450,100,800,30);
l2.setBounds(200,200,100,30);
l3.setBounds(200,400,100,30);
l4.setBounds(400,650,600,30);
t1.setBounds(400,200,100,30);
t2.setBounds(400,400,100,30);
b1.setBounds(200,600,100,30);
b2.setBounds(400,600,100,30);
b3.setBounds(600,600,100,30);
b1.addActionListener(new log());
b2.addActionListener(new clear());
b3.addActionListener(new add());
}
	public static void main(String []args)
	{
		loginP a1= new loginP("Welcome to the Application" );
		a1.setVisible(true);
		a1.setSize(1000,1000);
		a1.setComponents();
		a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class log implements ActionListener
	{ 
		public void actionPerformed(ActionEvent e1)
		{
			String s1 =t1.getText();
			String s2 =t2.getText();
			if(s1.equals("Admin") && s2.equals("Admin"))
				{
					l4.setText("LoginDone");

				}
				else
				{
					l4.setText("Incorrect Username and Password");
				
				}
		}

	}
	class clear implements ActionListener
	{
		public void actionPerformed(ActionEvent e1)
			{
				t1.setText("");	
				t2.setText("");

			}

	}
	class add implements ActionListener
	{
		public void actionPerformed(ActionEvent e1)
			{
				try
				{
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					int c = a+b;
					l4.setText("Addition is :" +c);
				}
				catch(Exception a1)
				{
					l4.setText("Please Enter Vaild Credential");

				}
			
			}



	}

}