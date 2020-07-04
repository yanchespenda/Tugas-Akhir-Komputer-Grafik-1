/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E04LatA extends JPanel {
    public E04LatA() {
        
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        QuadCurve2D kurva1 = new QuadCurve2D.Float();
        kurva1.setCurve(50, 150, 100, 100, 200, 400);
        
        g2d.draw(kurva1);
    }
}
