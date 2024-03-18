import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	
 public class Customer implements ActionListener 
	{
		Account x1;
		JTextField t1;
		Customer(Account x1, JTextField t1)
		{
			this.x1=x1;
			this.t1=t1;
		}
		public void actionPerformed(ActionEvent e1) 
		{
			System.out.println("Entering actionPerformed method");
				int amt = 0;
			try
			{

				Scanner s1 =new Scanner(t1.getText());
				if(s1.hasNextInt()){
					amt = s1.nextInt();
					System.out.println("Withdraw Amount :"+ amt);
				if(x1.isBalAvailable(amt))
					{
						x1.withdraw(amt);
						
					}
				else
					{
				 		JOptionPane.showMessageDialog(null, "Balance Not Available");
					}
				}else{
					JOptionPane.showMessageDialog(null, "Please Enter Amount");
				}		
				
			}
			catch(Exception q1)
			{
				q1.printStackTrace();
				JOptionPane.showMessageDialog(null, "System Error");	
			
			}
		}
	}