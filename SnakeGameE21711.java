/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegamee21711;

import javax.swing.JFrame;

/**
 *
 * @author : Yuri Domingos
 * Data    : 16 - 11 - 2020
 * Objectivo : Criar o jogo snake
 * 
 */
public class SnakeGameE21711 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.getContentPane().add(new Cenary());
        frame.setVisible(true);
        
        
       
    }
    
}
