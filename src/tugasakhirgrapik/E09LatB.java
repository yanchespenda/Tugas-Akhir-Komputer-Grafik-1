/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E09LatB extends JPanel {
    public E09LatB() {
        
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        
        try {
            BufferedImage img = ImageIO.read(new File("./src/aset/wallpaper.jpg"));
            Shape lingkaran = new Ellipse2D.Double(30, 30, 250, 250);
            g2d.clip(lingkaran);
            g2d.drawImage(img, 10, 10, 400, 400, null);
            g2d.setClip(null);
            g2d.setColor(new Color(238,238,238));
            
            String tulisan = "Clipping: Yukinoshita Yukino";
            
            g2d.drawString(tulisan, 100, 350);
            
            g2d.drawImage(img, 300, 10, 600, 287, null);
            g2d.setColor(new Color(238,238,238));
            g2d.setFont(new Font("Roboto", Font.PLAIN, 19));
            g2d.drawString("Gambar asli: Yukinoshita Yukino", 400, 350);
        } catch(Exception e) {
            
        }
    }
}
