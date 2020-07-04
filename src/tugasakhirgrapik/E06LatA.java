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
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E06LatA extends JPanel {
    public E06LatA() {
        this.setBackground(new Color(55, 71, 79));
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        float[] dash ={20.0f};
        BasicStroke dashed = new BasicStroke(3, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL, 1, dash, 0);
        g2d.setStroke(dashed);
        
        Polygon gambar2 = new Polygon();
        Polygon gambar1 = new Polygon();
        gambar1.addPoint(120, 150);
        gambar1.addPoint(250, 250);                       
        gambar1.addPoint(50, 250);

        gambar2.addPoint(200, 260);
        gambar2.addPoint(200, 360);
        gambar2.addPoint(500, 360);
        gambar2.addPoint(350, 260);
       
       
        GradientPaint paint1 = new GradientPaint(300, 0, new Color(33, 150, 243), 330, 0, new Color(13, 71, 161), true);
        g2d.setPaint(paint1);
        g2d.fill(gambar1);
        g2d.setColor(new Color(0,0,0));
        g2d.draw(gambar1);
        
        GradientPaint paint2 = new GradientPaint(300,50, new Color(33, 150, 243),35, 50, new Color(13, 71, 161));
        g2d.setPaint(paint2);
        g2d.fill(gambar2);
        g2d.setColor(new Color(0,0,0));
        g2d.draw(gambar2);
        
    }
}
