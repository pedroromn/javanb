import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel1 extends JPanel
{
    public void paintComponent(Graphics g){
        
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        // draw line from the upper-left to the lower-right
        //g.drawLine(0,0,width,height);

        // draw a line from the lower-left to the upper-right
        //g.drawLine(0,height,width,0);
        int dx = 0;
        int dy = 0;
        
        for (int i = 0; i < 15; i++) {
            g.drawLine(0, 0, dx, height - dy);
            dx = dx + 15;
            dy = dy + 15;
        }
    }    
}
