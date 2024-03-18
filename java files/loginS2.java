import javax.swing.*;
import java.awt.event.*;
class loginS2 extends JFrame
{
JLabel l1,l2,l3,l4;
JTextField t1;
JPasswordField t2;
JButton b1,b2;
loginS2(String s1)
{
	super(s1);	

}
void setComponents()
{
	l1=new JLabel("Welcome to Coding seekho institude");
	l2=new JLabel("Username");
	l3=new JLabel("Password");
	l4=new JLabel();
	t1=new JTextField();
	t2=new JPasswordField();
	b1=new JButton("Login");
	b2=new JButton("clear");
	setLayout(null);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(t1);
	add(t2);
	add(b1);
	add(b2);
	l1.setBounds(100,50,300,30);
	l2.setBounds(100,200,100,30);
	l3.setBounds(100,350,100,30);
	l4.setBounds(100,550,100,30);
	t1.setBounds(350,200,100,30);
	t2.setBounds(350,350,100,30);
	b1.setBounds(200,450,100,30);
	b2.setBounds(400,450,100,30);
	b1.addActionListener(new log());
	b2.addActionListener(new clear());
	
}

	public static void main(String []args)
		{
			loginS2 a1 =new loginS2("Welcome to my first program of java");	
			a1.setSize(700,700);
			a1.setComponents();
			a1.setVisible(true);
			a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			
		}
		class log implements ActionListener
		{
			public void actionPerformed(ActionEvent e1)
			{
				String s1 =t1.getText();
				String s2 =t2.getText();
				if(s1.equals("Abhishek") && s2.equals("12345"))
				{
					l4.setText("login Done");
				}
				else
				{
					l4.setText("login Unsuccessful");		
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


}