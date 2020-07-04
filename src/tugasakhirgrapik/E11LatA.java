/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E11LatA extends JPanel {
    public E11LatA() {
        this.setBackground(new Color(120,144,156));
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        int width = 1280, height = 720, max = 100;
        int black = 0x000000, white = 0xFFFFFF;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                double c_re = (col - width/2)*4.0/width;
                double c_im = (row - height/2)*4.0/width;
                double x = 0, y = 0;
                int iterations = 0;
                while (x*x+y*y < 4 && iterations < max) {
                    double x_new = x*x-y*y+c_re;
                    y = 2*x*y+c_im;
                    x = x_new;
                    iterations++;
                } 
                if (iterations < max) {
                    g2d.draw(new Line2D.Double(col, row, col, row));
                    g2d.setColor(new Color(103,58,183));
                } else {
                    g2d.draw(new Line2D.Double(col, row, col, row));
                    g2d.setColor(new Color(black));
                }
            }
        }
        
    }
}
