/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

/**
 *
 * @author Mea
 */
public class E05LatC extends JPanel {
    public E05LatC() {
        
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        GeneralPath gp = new GeneralPath (); // Mendeklarasikan gp sebagai variabel dari kelas Generalpath
        gp.moveTo(60, 120); // Memindahkan titik awal 60x 120y tanpa membuat garis atau titik
        gp.lineTo(80, 120); // Membuat garis dari titik awal 60x 120y tadi ke titik 80x 120y 
        gp.quadTo(90, 140, 100, 120); // Membuat curva dari titk awal 80x 120y menuju 90x1 140y1 lalu membuat curva dari 90x1 140y menuju 100x2 120y2
        gp.lineTo(160, 120); // Membuat garis dari titik ahir curva tadi 100x2 120y2 menuju garis 160x 120y 
        gp.quadTo(170, 140, 180, 120); // Membuat curva dari titk akhir garis diatas 160x 120y menuju 170x1 140y2 lalu membuat curva dari 170x1 140y menuju 180x2 120y2 
        gp.lineTo(200, 120); // Membuat garis dari titik akhir curva tadi 180x2 120y2 menuju 200x 120y 
        gp.curveTo(195, 100, 200, 80, 160, 80); // Membuat curva dari titik 200x 120y 
        gp.lineTo(110, 80); // Membuat garis dari ujung lengkungan 160x3 80y3 ke 110x 80y 
        gp.lineTo(90, 100); // Membuat garis dari kaca atas 110x 80y menuju kaca bawah 90x 100y 
        gp.lineTo(60, 100); // Membuat garis dari kaca bawah 90x 10y menuju bemper depan 80x 100y 
        gp.lineTo(60, 120); // Membuat garis dari beper depan atas 60x 100y ke bemper depan bawah 60x 120y
        g2d.draw(gp); // Menggambar GeneralPath ke dalam Graphics2D 
        
        Polygon arah = new Polygon(); // Mengdeklarasi arah dari kelas polygon
        arah.addPoint(100, 150); // membuat titik x 100 dan y 150
        arah.addPoint(100, 250); // membuat titik x 100 dan y 250
        arah.addPoint(125, 250); // membuat titik x 125 dan y 250
        arah.addPoint(75, 300); // membuat titik x 75 dan y 300
        arah.addPoint(25, 250); // membuat titik x 25 dan y 250
        arah.addPoint(50, 250); // membuat titik x 50 dan y 250
        arah.addPoint(50, 150); // membuat titik x 50 dan y 150
        g2d.draw(arah); // menggambar polygon tadi ke dalam Graphics2D
        
    }
}
