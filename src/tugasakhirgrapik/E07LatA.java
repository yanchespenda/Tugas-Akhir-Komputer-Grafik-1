/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E07LatA extends JPanel {
    public E07LatA() {
        
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g.setColor(new Color(76,175,80));
        g.fillOval(220, 50, 220, 200);
        g.fillRect(220, 135, 220, 200);
        g.fillRect(235, 335, 190, 15);
        g.fillOval(220, 320, 30, 30);
        g.fillOval(410, 320, 30, 30);
        g.fillRect(260, 340, 50, 70);
        g.fillRect(350, 340, 50, 70);
        g.fillOval(260, 390, 50, 50);
        g.fillOval(350, 390, 50, 50);

        g.fillRect(145, 165, 80, 50);
        g.fillOval(115, 165, 50, 50);
        
        g.fillRect(420, 165, 80, 50);
        g.fillOval(480, 165, 50, 50);
        
        g.setColor(new Color(244,67,54));
        g.fillOval(270, 90, 25, 25);
        g.fillOval(365, 90, 25, 25);
    }
}
