/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thinking.in.java.pkg;

/**
 *
 * @author Victor
 */
public class Tree {
    
    int height;
    
    /**
     * Initialize sprout with zero height
     */
    public Tree() {
        height = 0;
        System.out.println("Seeding the sprout!");
    }
    
    /**
     * @param height initialize tree with height
     */
    public Tree(int height) {
        this.height = height;
        System.out.println("Creating new tree with heihgt " + height);
    }
    
    public void info() {
        System.out.println("Tree with height of " + height + " meters.");
    }
    
    /** Overloading info */
    public void info(String s) {
        System.out.println(s + " Tree with height of " + height + " meters.");
    }
}

