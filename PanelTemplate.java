//change to be your packagename


//all imports are necessary
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

//must 'extend' JPanel 
public class PanelTemplate extends JPanel
{
	//variables for the overall width and height
	private int w, h;
	
	//sets up the initial panel for drawing with proper size
	public PanelTemplate(int w, int h)
	{
		this.w = w;
		this.h = h;
		this.setPreferredSize(new Dimension(w,h));
		
	}
	
	
	//all graphical components go here
	//this.setBackground(Color c) for example will change background color
	public void paintComponent(Graphics page)
	{
		//this line sets up the graphics - always needed
		super.paintComponent(page);
		
		//all drawings below here:
		
		
		
	}
}
