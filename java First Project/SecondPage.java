import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 class SecondPage extends JFrame
{

	JLabel l0,l1,l2,l3,l5;
	JButton b1,b2,b3;
	 void setComponents()
	{
		l0 =new JLabel("Choose the Account Type");
		l0.setFont(new Font("Time New Roman", Font.BOLD, 70));
		l1 =new JLabel("Saving Account");
		l1.setFont(new Font("CopperT", Font.BOLD, 30));
		l2 =new JLabel("Current Account");
		l2.setFont(new Font("CopperT", Font.BOLD, 30));
		l3 =new JLabel("FD Account");
		l3.setFont(new Font("CopperT", Font.BOLD, 30));
		b1 =new JButton("Click Here To Select Saving Account");
		b2 =new JButton("Click Here To Select Current Account");
		b3 =new JButton("Click Here To Select FD Account");
		setLayout(null);
		add(l0);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		add(b2);
		add(b3);
		l0.setBounds(400,100,1000,130);
		l1.setBounds(400,300,700,40);
		l2.setBounds(400,400,700,40);
		l3.setBounds(400,500,700,40);
		b1.setBounds(800,300,400,30);
		b2.setBounds(800,400,400,30);
		b3.setBounds(800,500,400,30);
		b1.addMouseListener(new Saving());
		b2.addMouseListener(new Current());
		b3.addMouseListener(new FD());
	}
	SecondPage()
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
	public class Saving implements MouseListener
	{	
		
		public void  mouseExited(MouseEvent e1)
			{
				
			}
		public void mouseEntered(MouseEvent e1)
			{
				
			}
		public void mouseReleased(MouseEvent e1)
			{
				
			}
		public void  mousePressed(MouseEvent e1)
			{
		
			}
		public void  mouseClicked(MouseEvent e1)
			{
				JOptionPane.showMessageDialog(null, "You have Selected Saving Account");
				SavingAccount w1 = new SavingAccount();
				Account a1 =new Account(100000);
				Customer c1 =new Customer(a1, w1.t1);	
				w1.setVisible(true);
			}	
	}
	public class Current implements MouseListener
	{	
		
		public void  mouseExited(MouseEvent e1)
			{
				
			}
		public void mouseEntered(MouseEvent e1)
			{
				
			}
		public void mouseReleased(MouseEvent e1)
			{
				
			}
		public void  mousePressed(MouseEvent e1)
			{
		
			}
		public void  mouseClicked(MouseEvent e1)
			{
				JOptionPane.showMessageDialog(null, "You have Selected Cuurent Account");
				CurrentAccount w1 = new CurrentAccount();
				cAccount q1 =new cAccount(100000);
				cCustomer c1 =new cCustomer(q1, w1.t1);	
				w1.setVisible(true);
			}	
	}
	public class FD implements MouseListener
	{	
		
		public void  mouseExited(MouseEvent e1)
			{
				
			}
		public void mouseEntered(MouseEvent e1)
			{
				
			}
		public void mouseReleased(MouseEvent e1)
			{
				
			}
		public void  mousePressed(MouseEvent e1)
			{
		
			}
		public void  mouseClicked(MouseEvent e1)
			{
				JOptionPane.showMessageDialog(null, "You have Selected FD Account");
				FDAccount w1 = new FDAccount();	
				fAccount q1 =new fAccount(100000);
				fCustomer c1 =new fCustomer(q1, w1.t1);	
				w1.setVisible(true);
			}	
	}
	
}