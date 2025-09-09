package org.example;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movement{
    public static JFrame frame = new JFrame();
    public static void main(String[] args) {
        frame.setVisible(true);
        frame.setSize(75, 125);
        frame.setLocation(0, 0);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    moveLeft();
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    moveRight();
                }
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    moveUp();
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    moveDown();
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    public static void moveLeft() {
        if(frame.getX()>0){
            frame.setLocation(frame.getX()-30, frame.getY());
        }
    }

    public static void moveRight(){
        if(frame.getX()<1792){
            frame.setLocation(frame.getX()+30, frame.getY());
        }
    }

    public static void moveUp() {
        if(frame.getY()>0){
            frame.setLocation(frame.getX(), frame.getY()-30);
        }
    }

    public static void moveDown() {
        if(frame.getY()<1035){
            frame.setLocation(frame.getX(), frame.getY()+30);
        }
    }
}
