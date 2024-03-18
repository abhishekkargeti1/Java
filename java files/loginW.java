import javax.swing.*;
import java.awt.event.*;
class loginW extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	void setComponents()
	{
		l1 =new JLabel("Login Page");
		l2 =new JLabel("Username");
		l3 =new JLabel("Password");
		l4 =new JLabel();
		t1 =new JTextField();
		t2 =new JPasswordField();
		b1 =new JButton("login");
		b2 =new JButton("clear");
		setLayout(null);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		l1.setBounds(500,200,100,30);
		l2.setBounds(350,350,100,30);
		l3.setBounds(350,450,100,30);
		l4.setBounds(500,600,800,30);
		t1.setBounds(550,350,100,30);
		t2.setBounds(550,450,100,30);
		b1.setBounds(400,500,100,30);
		b2.setBounds(600,500,100,30);
		b1.addActionListener(new login());
		b2.addActionListener(new clear());
	}
	loginW(String s1)
	{
		super(s1);	
	}

	public static void main(String []args)
		{
			loginW a1 = new loginW("Lark");
			a1.setVisible(true);
			a1.setSize(1000,1000);
			a1.setComponents();
			a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	class login implements ActionListener
	{
		public void actionPerformed(ActionEvent e1)
		{	
			String s1 = t1.getText();
			String s2 = t2.getText();
			if(s1.equals("Admin") && s2.equals("12345"))
				{
					l4.setText("Login SuccessFull");

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

}