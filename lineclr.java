import java.applet.Applet; 
		import java.awt.*; 
		import java.awt.event.*; 
		
public class lineclr extends Applet {

		    public static void main(String[] args) 
		    { 
		        Frame drawLineApplet = new Frame("Draw Line in Applet Window Example"); 
		        drawLineApplet.setSize(350, 250); 
		        Applet lineclr = new lineclr(); 
		        drawLineApplet.add(lineclr); 
		        drawLineApplet.setVisible(true); 
		        drawLineApplet.addWindowListener(new WindowAdapter() { 
		        public void windowClosing(WindowEvent e) {System.exit(0); } 
		                                                                                   }); 
		    } 
		  public void paint(Graphics g) 
		  { 
		          // Now we tell g to change the font 
		        //Syntax: drawString(String str, int xBaselineLeft, int yBaselineLeft);   
		        // draws a Line 
		         g.setColor(Color.magenta);  // Now we tell g to change the color 
		        //Syntax For:- drawLine(int x1, int y1, int x2, int y2); 
		         g.drawLine(90, 135, 90, 180); 
		      
		   } 
		} 
	