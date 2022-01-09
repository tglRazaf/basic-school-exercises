/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.application;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author ANDRY-PC
 */
public class Sary extends JFrame implements MouseMotionListener{
    private int x,y;
    public Sary(){
        setTitle("Bonjour");
        x = 150;
        y = 150;
        setSize(600,400);
        this.setVisible(true);
        this.addMouseMotionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g); //paint taloha
        g.drawLine(0, 0, x, y);
        g.drawLine(150, 400, x, y);
        g.drawLine(this.getWidth(), this.getHeight(), x, y);
        
    }

    @Override
    public void mouseDragged(MouseEvent me) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        this.x = me.getX();
        this.y = me.getY();
        repaint();
        //System.out.println("("+me.getX()+","+me.getY()+")");
    }
    
}
