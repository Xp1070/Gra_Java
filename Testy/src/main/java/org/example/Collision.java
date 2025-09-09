package org.example;

import Windows.Window;

import javax.swing.*;

public class Collision {
    public static JFrame frame = new JFrame();

    public static void main(String[] args) {
        Window win1 = new Window(0,0);
        Window win2 = new Window(1792,1035);

        while(true){
            win1.move();
            win2.move();
        }
    }
}