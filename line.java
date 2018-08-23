import java.applet.Applet; 
		import java.awt.*; 
		import java.awt.event.*; 
		
public class line extends Applet {

	public static void main(String[] args) {
		        Frame drawLineApplet = new Frame("Draw Line in Applet Window Example"); 
		        drawLineApplet.setSize(350, 250); 
		        Applet line = new line(); 
		        drawLineApplet.add(line); 
		        drawLineApplet.setVisible(true); 
		        drawLineApplet.addWindowListener(new WindowAdapter() { 
		        public void windowClosing(WindowEvent e) {System.exit(0); } 
		                                                                                   }); 
		    } 
		  public void paint(Graphics g) 
		  { 
		          // Now we tell g to change the font 
		       
		        g.drawLine(10, 20, 100, 100); 
		   } 
		} 

	


