/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E11LatB extends JPanel {
    public E11LatB() {
        
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        int     leftX = 100,
                rightX = 400,
                upL = 300,
                upR = 400,
                doL = 400,
                doR = 200;
        
        CubicCurve2D upper = new CubicCurve2D.Float(leftX, upL,
            (rightX -leftX)*.3f, upL,
            (rightX -leftX)*.7f, upR,
            rightX, upR);
        CubicCurve2D bottom = new CubicCurve2D.Float(rightX, doR,
            (rightX - leftX)*.7f, doR,
            (rightX -leftX)*.3f, doL,
            leftX, doL);
        
        GeneralPath path = new GeneralPath();
        path.append(upper, false);
        path.append(bottom, true);
        path.closePath();
        g2.setColor(new Color(33,150,243));
        g2.fill(path);
        g2.setColor(new Color(103,58,183));
        g2.draw(upper);
        g2.draw(bottom);
        
    }
}
