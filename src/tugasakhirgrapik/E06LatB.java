/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E06LatB extends JPanel {
    public E06LatB() {
        this.setBackground(new Color(55, 71, 79));
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        Shape lingkaran1 = new Ellipse2D.Double(50, 50, 100, 100);
        Shape lingkaran2 = new Ellipse2D.Double(90, 40, 120, 120);
        
        Shape lingkaran3 = new Ellipse2D.Double(50, 250, 100, 100);
        Shape lingkaran4 = new Ellipse2D.Double(90, 240, 120, 120);
        
        Area area1 = new Area(lingkaran1);
        Area area2 = new Area(lingkaran2);
        
        Area area3 = new Area(lingkaran3);
        Area area4 = new Area(lingkaran4);
        
        
        area1.add(area2);
        
        area3.intersect(area4);
        
        float[] dashStroke = {32};
        BasicStroke basicStroke = new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 2, dashStroke, 0);
        g2d.setStroke(basicStroke);
        GradientPaint gradientPaint = new GradientPaint(100, 40, new Color(33, 150, 243), 120, 70, new Color(13, 71, 161), true);
        g2d.setPaint(gradientPaint);
        
        
        g2d.fill(area1);
        g2d.fill(area3);
        
        g2d.draw(lingkaran1);
        g2d.draw(lingkaran2);
        
        g2d.draw(lingkaran3);
        g2d.draw(lingkaran4);
        
    }
}
