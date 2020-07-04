/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E04LatB extends JPanel {
    public E04LatB() {
        
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        Point2D titikA = new Point2D.Double(30, 10);
        Point2D titikB = new Point2D.Double(55, 95);
        Line2D garisA = new Line2D.Double(titikA, titikB);
        
        Point2D titikC = new Point2D.Double(10, 30);
        Point2D titikD = new Point2D.Double(95, 55);
        Line2D garisB = new Line2D.Double(titikC, titikD);
        
        g2d.draw(garisA);
        g2d.draw(garisB);
    }
}
