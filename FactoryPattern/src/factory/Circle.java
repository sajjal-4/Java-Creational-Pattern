/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Lenovo
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}