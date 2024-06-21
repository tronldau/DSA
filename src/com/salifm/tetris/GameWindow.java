/* Name: Trần Quỳnh Như
ID: ITDSIU21105 
Purpose:GameWindow  
*/ 
package com.salifm.tetris;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class GameWindow extends JFrame {

    public GameWindow() {
        setTitle("Tetris_DSA");
        setSize(450, 814);
        setResizable(false);

        setLayout(new GridLayout(1, 2));

        // you can adjust timer resolution here. but it's ideal value for this game.
        GameBoardPanel gameBoard = new GameBoardPanel(this, 400);
        add(gameBoard);
        gameBoard.start();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
