/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E12LatA extends JPanel {
    public E12LatA() {
        
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        try {
            File fileGambar = new File("./src/aset/wallpaper.jpg");
            BufferedImage img = ImageIO.read(fileGambar);
            BufferedImage dstImage = null;
            float[] sharpen = new float[] {
                0.0f, -1.0f, 0.0f,
                -1.0f, 5.0f, -1.0f,
                0.0f, -1.0f, 0.0f
            };
            Kernel kernel = new Kernel(3, 3, sharpen);
            ConvolveOp op = new ConvolveOp(kernel);
            dstImage = op.filter(img, null);
            
            g2d.drawImage(dstImage, null, 0, 0);
            
        } catch(Exception ex) {
            
        }
    }
}
