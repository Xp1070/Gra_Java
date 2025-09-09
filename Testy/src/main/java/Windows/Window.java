package Windows;

import javax.swing.*;

public class Window extends JFrame {
    private boolean left = false;
    private boolean up = false;

    public Window(int x, int y)
    {
        this.setVisible(true);
        this.setSize(75, 125);
        this.setLocation(x, y);
    }

    public boolean isUp() {
        return up;
    }
    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isLeft() {
        return left;
    }
    public void setLeft(boolean left) {
        this.left = left;
    }

    public void moveLeft() {
        this.setLocation(this.getX()-1, this.getY());
    }
    public void moveRight(){
        this.setLocation(this.getX()+1, this.getY());
    }
    public void moveUp() {
        this.setLocation(this.getX(), this.getY()-1);
    }
    public void moveDown() {
        this.setLocation(this.getX(), this.getY()+1);
    }

    public void move(){
        if(this.getX() <= 0)
        {
            collideLeft();
        }
        else if(this.getX() >= 1792)
        {
            collideRight();
        }

        if(this.getY() <= 0)
        {
            collideUp();
        }
        else if(this.getY() >= 1035)
        {
            collideDown();
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

    public void collideLeft(){
        left = false;
    }
    public void collideRight(){
        left = true;
    }
    public void collideUp(){
        up = false;
    }
    public void collideDown(){
        up = true;
    }
}
