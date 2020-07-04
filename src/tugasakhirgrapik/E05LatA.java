/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Color;
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
public class E05LatA extends JPanel {
    public E05LatA() {
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
        
        
        area1.subtract(area2);
        
        area3.exclusiveOr(area4);
        
        g2d.setColor(Color.decode("#2196F3"));
        
        g2d.fill(area1);
        g2d.fill(area3);
        
        g2d.draw(lingkaran1);
        g2d.draw(lingkaran2);
        
        g2d.draw(lingkaran3);
        g2d.draw(lingkaran4);
        
    }
}
