/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E09LatA extends JPanel {
    public E09LatA() {
        this.setBackground(new Color(63,81,181));
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        
        //jenis-jenis alpha composite
        int [] alphaComp = {
            AlphaComposite.SRC, 
            AlphaComposite.DST_IN,
            AlphaComposite.DST_OUT, 
            AlphaComposite.DST_OVER,
            AlphaComposite.SRC_IN, 
            AlphaComposite.SRC_OVER,
            AlphaComposite.SRC_OUT, 
            AlphaComposite.CLEAR
        };
        
        String [] caption = {
            "SRC", "DST_IN", "DST_OUT", "DST_OVER", "SRC_IN", "SRC_OVER", "SRC_OUT", "CLEAR"
        };
        
        g2d.setColor(new Color(238,238,238));
        g2d.drawString("DESTINATION (Rectangle)", 40, 20);
        g2d.drawString("SOURCE (Circle)", 300, 20);
        
        int x, y;
        x = y = 40;
        AlphaComposite ac;
        for (int j = 0; j < alphaComp.length; j++) {
            ac = AlphaComposite.getInstance(alphaComp[j], 0.7f);
            BufferedImage buffImg = new BufferedImage(75, 80, BufferedImage.TYPE_INT_ARGB);
            Graphics2D gbi = buffImg.createGraphics();
            gbi.setColor(new Color(38,50,56));
            gbi.fillRect(0, 0, 50, 50);
            gbi.setColor(new Color(244,67,54));
            gbi.setComposite(ac);
            gbi.fillOval(25, 0, 50, 50);
            g2d.drawImage(buffImg, null, x, y);
            g2d.setColor(new Color(238,238,238));
            g2d.drawString(caption[j], x, y+70);

            x += 80;
                    
            
        }
    }
}
