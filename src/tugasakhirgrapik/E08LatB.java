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
public class E08LatB extends JPanel {
    public E08LatB() {
        
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        
        // Objek Lingkaran sebelum di rotasi
        // Deklarasi variable posisi
        int object_x1 = 100, object_y1 = 150;
        
        // Membuat Oval
        Ellipse2D.Double objectNyaA = new Ellipse2D.Double(object_x1, object_y1, 100, 150);
        
        // Menampilkan objek oval ke dalam graphics
        g2d.draw(objectNyaA);
        
        // Objek Lingkaran sesudah di rotasi
        // Membuat transform objek
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.rotate(125, 160, 110);
        g2d.setTransform(affineTransform);
        g2d.draw(objectNyaA);
    }
}
