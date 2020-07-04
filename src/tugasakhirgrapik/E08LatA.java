/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E08LatA extends JPanel {
    public E08LatA() {
        
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        int object_x1 = 100,
            object_y1 = 150;
        Ellipse2D.Double objectNyaA = new Ellipse2D.Double(object_x1, object_y1, 100, 150);
        g2d.draw(objectNyaA);

        
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(150, 150);
        g2d.setTransform(affineTransform);
        g2d.draw(objectNyaA);
    }
}
