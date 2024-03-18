import javax.swing.*;
import java.awt.*;
public class Account
{
	 int bal;
	Account(int b)
	{
		bal=b;

	}	
	boolean isBalAvailable(int w)
		{
			if(bal >= w)
				{
					return true;
				}
			else
			{
				return false;
			}
		}
	 void withdraw(int amt)
	{
		bal = bal-amt;
		JOptionPane.showMessageDialog(null, "Transcation Complete");
		JOptionPane.showMessageDialog(null, "Current Balance"+bal);	
	}
	

}