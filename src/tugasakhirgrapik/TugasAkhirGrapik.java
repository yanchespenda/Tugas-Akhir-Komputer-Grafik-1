/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirgrapik;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Mea
 */
public class TugasAkhirGrapik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new MainPage();
        
        frame.setTitle("Alfian Rikzandi");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        MainPage panel = new MainPage();
        
//        frame.getContentPane().add(panel);
        
        frame.setPreferredSize(new Dimension(450, 350));
        frame.setSize(1000, 600);
        
        frame.setVisible(true);
    }
    
}
