import javax.swing.*;
import java.awt.*;
public class cAccount
{
	int bal;
	cAccount(int b)
	{
		bal=b;
	}
	void withdraw(int amt)
	{
		bal=bal-amt;
		if(bal<amt)
		{
			JOptionPane.showMessageDialog(null, "Transcation Complete");
			JOptionPane.showMessageDialog(null, "OverDraft Balance is "+bal);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Transcation Complete");
			JOptionPane.showMessageDialog(null, "Current balance is"+bal);
		}
	}
}