// Implements rectangle class as specified in exercise 18 with additions made by
// exercises after 18, tested in ExerciseMain

import java.awt.*;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // Constructs a new Rectangle
    public Rectangle(int x, int y, int width, int height) {
        if (height < 0 || width < 0) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Constructs a new Rectangle using Point
    public Rectangle(Point p, int width, int height) {
        this(p.x, p.y, width, height);
    }

    // Returns this Rectangle's height
    public int getHeight() {
        return height;
    }

    // Returns this Rectangle's width
    public int getWidth() {
        return width;
    }

    // Returns this Rectangle's x-coordinate
    public int getX() {
        return x;
    }

    // Returns this Rectangle's y-coordinate
    public int getY() {
        return y;
    }

    // Returns a String representation of this Rectangle
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y  + ",width=" + width + ", height=" + height + "]"; 
    }

    // Returns whether the given coordinates lie inside the bounds of this Rectangle
    public boolean contains(int x, int y) {
        return this.x <= x && x <= this.x + width && this.y <= y && y <= this.y + height; 
    }

    // Returns whether the given Point lie inside the bounds of this Rectangle
    public boolean contains(Point p) {
        return this.x <= p.x && p.x <= this.x + width && this.y <= p.y && p.y <= this.y + height;
    }

    // Returns a new rectangle with tighest bound box that contains both this 
    // rectangle and given other rectangle
    public Rectangle union(Rectangle rect) {
        int x = Math.min(this.x, rect.getX());
        int y = Math.min(this.y, rect.getY());
        int width = Math.max(this.x + this.width, rect.getX() + rect.getWidth());
        int height = Math.max(this.y + this.height, rect.getY() + rect.getHeight());
        return new Rectangle(x, y, width-x, height-y);
    }

    // Returns a new rectangle that represents the largest rectangular region completely
    // contained within both this rectangle and given other rectangle. 
    public Rectangle intersection(Rectangle rect) {
        int x = Math.min(this.x, rect.getX());
        int y = Math.min(this.y, rect.getY());
        int width = Math.max(this.x + this.width, rect.getX() + rect.getWidth());
        int height = Math.max(this.y + this.height, rect.getY() + rect.getHeight());
        return new Rectangle(x, y, width-x, height-y);
    }

    // Returns whether the given other rectangle lies entirely within bounds of this
    // rectangle
    public boolean contains(Rectangle rect) {
        return this.x < rect.getX() && this.y < rect.getY() && 
            rect.getX() + rect.getWidth() < this.x + this.width && 
            rect.getY() + rect.getHeight() < this.y + this.height;
    }
}
