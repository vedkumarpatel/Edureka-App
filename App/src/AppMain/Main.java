package AppMain;

import javax.swing.*;

class GUIHandler{
	LoginPage loginFrame = new LoginPage();
    HomePage homeFrame = new HomePage();
    int k = 0;
    GUIHandler(){
    	initialize();
    }
    
    private void initialize(){
    	k = 0;
    	loginFrame.setTitle("Login Page");
    	loginFrame.setBounds(10,10,370,600);
    	loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	loginFrame.setResizable(false); 
    	loginFrame.setVisible(false);
    	    	
    	homeFrame.setTitle("Home Page");
    	homeFrame.setBounds(10,10,600,600);
    	homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	homeFrame.setResizable(false); 
    	homeFrame.setVisible(false);
    	
    }
    
    public void run() {
    	loginFrame.setVisible(false);
    	homeFrame.setVisible(false);
    	if (k == 0)
    		loginFrame.setVisible(true);
    	else if (k == 1)
    		homeFrame.setVisible(true);
	}
    public void change() {
    	if (k == 0) k = 1;
    	else k = 0;
    	this.run();
    }
}


public class Main {
	static GUIHandler gui = new GUIHandler();
	public static void main(String[] args) {  
		
		gui.run();
		
	} 
}
