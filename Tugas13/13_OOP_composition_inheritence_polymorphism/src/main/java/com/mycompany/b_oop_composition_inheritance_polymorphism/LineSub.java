/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.b_oop_composition_inheritance_polymorphism;

import java.awt.Point;

/**
 * Created by_22343004 Erpiana
 * The LineSub class, subclass of Point.
 * It inherits the begin point from the superclass and adds an end point.
 */
public class LineSub extends Point {
    private Point end;

    /** Constructs a LineSub instance with 2 points at (x1, y1) and (x2, y2) */
    public LineSub(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.end = new Point(x2, y2);
    }

    /** Constructs a LineSub instance with the 2 given Point instances */
    public LineSub(Point begin, Point end) {
        super(begin);
        this.end = end;
    }

    // Getters and Setters
    public Point getBegin() {
        return new Point(super.getLocation());
    }

    public Point getEnd() {
        return new Point(end.getLocation());
    }

    public void setBegin(Point begin) {
        super.setLocation(begin);
    }

    public void setEnd(Point end) {
        this.end.setLocation(end);
    }

    // Other Get and Set methods
    public double getBeginX() {
        return super.getX();
    }

    public void setBeginX(int x) {
        super.setLocation(x, super.getY());
    }

    public int getBeginY() {
        return (int) super.getY();
    }

    public void setBeginY(int y) {
        super.setLocation(super.getX(), y);
    }

    public int[] getBeginXY() {
        return new int[]{(int) super.getX(), (int) super.getY()};
    }

    public void setBeginXY(int x, int y) {
        super.setLocation(x, y);
    }

    public double getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setLocation(x, end.getY());
    }

    public double getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setLocation(end.getX(), y);
    }

    public int[] getEndXY() {
        return new int[]{(int) end.getX(), (int) end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setLocation(x, y);
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ", end=" + end + "]";
    }

    /** Returns the length of this line */
    public double getLength() {
        return super.distance(end);
    }
}
