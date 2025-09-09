package org.example;

import javax.swing.*;

public class Bouncing {
    public static JFrame frame = new JFrame();

    public static void main(String[] args) {

        frame.setVisible(true);
        frame.setSize(75, 125);
        frame.setLocation(0, 0);

        boolean left = false;
        boolean up = false;

        /*while(true)
        {
            System.out.println(frame.getLocation());
        }*/
        while(true){
            if(frame.getX() <= 0)
            {
                left = false;
            }
            else if(frame.getX() >= 1792)
            {
                left = true;
            }

            if(frame.getY() <= 0)
            {
                up = false;
            }
            else if(frame.getY() >= 1035)
            {
                up = true;
            }

            if(left){
                moveLeft();
            }
            else{
                moveRight();
            }

            if(up){
                moveUp();
            }
            else{
                moveDown();
            }
        }
    }

    public static void moveLeft() {
        frame.setLocation(frame.getX()-1, frame.getY());
    }

    public static void moveRight(){
        frame.setLocation(frame.getX()+1, frame.getY());
    }

    public static void moveUp() {
        frame.setLocation(frame.getX(), frame.getY()-1);
    }

    public static void moveDown() {
        frame.setLocation(frame.getX(), frame.getY()+1);
    }


}