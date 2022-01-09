/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.application;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.plaf.ColorChooserUI;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.IconUIResource;

/**
 *
 * @author ANDRY-PC
 */
public class Fenetre extends JFrame implements ActionListener{
    private JLabel label;
    public Fenetre(){
        this.setTitle("Bonjour");
        this.setSize(600,400);
        Container c = this.getContentPane();
        c.setLayout(new GridLayout(2,2)); //GridLayout, BorderLayout, GridBagLayout ..
        JButton bouton1 = new JButton("Essai 1");
        c.add(bouton1);
        bouton1.addActionListener(this);
     
        JButton bouton2 = new JButton("Essai 2");
        c.add(bouton2);
        bouton2.addActionListener(this);
        JButton bouton3 = new JButton("Essai 3");
        bouton3.setBackground(ColorUIResource.PINK);
        c.add(bouton3);
        bouton3.addActionListener(this);
        label = new JLabel("");
        c.add(label);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(Font.decode("Calibri 52"));
        label.setForeground(ColorUIResource.green);
        //bouton4.addActionListener(this);
        this.setVisible(true);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        /*   if (ae.getActionCommand().equals("Essai 1")) label.setText("ici c'est ISPM");
        else if (ae.getActionCommand().equals("Essai 2")) label.setText("INFO2");
        else label.setText("ici c'est ... tsy aiko");
         */
        switch (ae.getActionCommand()) {
            case "Essai 1":
                label.setText("ici c'est ISPM");
                break;
            case "Essai 2":
                label.setText("INFO2");
                break;
            default:
                label.setText("..o??o..");
                JOptionPane.showMessageDialog(this, "Tsy haiko Tompoko !!");
                break;
        }
    }
}
