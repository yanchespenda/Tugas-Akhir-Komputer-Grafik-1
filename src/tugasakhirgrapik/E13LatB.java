/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E13LatB extends JPanel {
    
    private float xpos = 20f;
    private float ypos = 20f;
    private float diff = 1.0f;
    
    private float xpos2 = 600f;
    private float ypos2 = 20f;
    private float diff2 = 1.0f;
    
    
    public E13LatB() {
        new AnimasiRunnable();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Float(xpos, ypos, 80f, 40f);
        g2d.setColor(new Color(33,150,243));
        g2d.fill(rect);
        
        Ellipse2D.Double objek = new Ellipse2D.Double(xpos2, ypos2, 40, 40);
        g2d.setColor(new Color(33,150,243));
        g2d.fill(objek);
    }
    
    class AnimasiRunnable implements Runnable {
        private Thread runner;
        public AnimasiRunnable(){
            runner = new Thread(this);
            runner.start();
        }
        public void run(){
            while (true){
                repaint();
                if(xpos > 400.0f)
                    diff = -1.0f;
                else if (xpos < 20f)
                    diff = 1.0f;
                
                xpos += diff;
                ypos += diff;
                
                
                if(ypos2 > 250.0f)
                    diff2 = -1.0f;
                else if (ypos2 < 20f)
                    diff2 = 1.0f;
                
                ypos2 += diff2;
                
                try {
                    Thread.sleep(30);
                }catch(Exception e){}
            }
        }
    }
}
