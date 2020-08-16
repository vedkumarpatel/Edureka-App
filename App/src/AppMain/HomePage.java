package AppMain;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HomePage extends JFrame implements ActionListener{
	Container container = getContentPane();
	JLabel headTitle = new JLabel("<html><span style='color: teal;'>Emloyees</span></html>");
	JLabel headTitlebck = new JLabel();
	JButton logoutButton = new JButton("LOGOUT");
    
 
    HomePage()
    {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
   
   public void setLayoutManager()
   {
       container.setLayout(null);
   }
   
   public void setLocationAndSize()
   {
	   headTitlebck.setBounds(0,20,600,130);
	   headTitlebck.setBackground(Color.white);
       headTitlebck.setOpaque(true);
       
       headTitle.setBounds(50,20,560,130);
       headTitle.setFont(headTitle.getFont().deriveFont(64.0f));
       
       logoutButton.setBounds(450,40,90,30);
   }
   public void addComponentsToContainer()
   {
	   container.add(headTitle);
       container.add(logoutButton);
       container.add(headTitlebck);
   }

   public void addActionEvent()
   {
       logoutButton.addActionListener(this);
   }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == logoutButton) {
    		Main.gui.change();
        }
    }
}
