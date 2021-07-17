/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyxplorer.javapicmod;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author skywa
 */
public class Begin extends JFrame{
    
    private String title = "Beginner!";
    
    
    public Begin() {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
        
        JPanel panned = new JPanel();
        this.setContentPane(panned);
        this.setVisible(true);
    }
    
    public class Panned extends JPanel {
        public void paintComponent(Graphics g) {
            this.setSize(this.getWidth() - 100, this.getHeight() - 100);
            g.setColor(Color.black);
            g.fillRect(0, 0, this.getSize().width, this.getSize().height);
            repaint();
        }
    }
    
    public static void main(String[] args) {
        new Begin();
    }
}
