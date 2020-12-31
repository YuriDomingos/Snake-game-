/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegamee21711;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;

/**
 *
 * @author Yuri Domingos
   Data  : 13-11-2020
 */
public class Cenary extends JPanel implements Runnable{

    private boolean closed = false;
    private int Ypos;
    private int Xpos;
    private int phase;
   

    public Cenary() {
       
        phase = 1;
        Xpos=10;
        Ypos = 130;
        new Thread(this).start()    
        
    }
    
    
    public void paintComponent(Graphics g)
    {
        
         super.paintComponent(g);  
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        int x = 0 , y = 0;
        double A = 10, t, thickness = 1;
        
        for ( t = phase; t < phase +10;  t+= 0.1 )
        {
            y = 200 +(int)(A*Math.sin(t));
            g.fillOval((Xpos+x)%500, Ypos+y, (int)thickness, (int)thickness); // little casting
            thickness += 0.1;
            x++;
            
        }
        
        g.fillOval((Xpos+x)%500, Ypos+y, 20, 10);
        g.setColor(Color.white);
        g.fillOval((Xpos+x+10)%500, Ypos+y, 5, 5);
            
        
    }
    
   
    
    @Override
    public void run() {
        
        while(!closed)
        {
            phase++;
            Xpos+=10;
            repaint();
            
            try {
                Thread.sleep(50);
                
            }catch(Exception ex)
            {
                
            }
        }
    
    }
    
}
