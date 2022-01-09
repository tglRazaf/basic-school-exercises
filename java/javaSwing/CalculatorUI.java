package javaSwing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.GridLayout;

public class CalculatorUI  extends JFrame{
    private JLabel label;
    private JTextField field;
    public CalculatorUI(){

        this.setTitle("Calculator");
        this.setSize(400, 500);

        label = new JLabel("Quel âge avez vous ??");

        //Jpanel comme Container
        JPanel pan = new JPanel();
        pan.setBackground(Color.DARK_GRAY);
        pan.setLayout(new GridLayout(1, 1));
        this.setContentPane(pan);

        //sans utiliser JPanel
        /*Container container = this.getContentPane();
        container.setBackground(Color.BLACK);*/

        pan.add(label);

        JButton btn1 = new JButton("valider");
        pan.add(btn1);

        

        //location et visibilité de la fenetre
        //this.setLocationRelativeTo(null);
        this.setLocation(400, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
