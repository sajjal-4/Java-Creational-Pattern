/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Attempt to get the singleton instance
        MyClass myClassInstance1 = MyClass.getSingletonOfMyClass();
        
        // Display the instance
        System.out.println("Instance 1: " + myClassInstance1);
        
        // Attempt to get another instance
        MyClass myClassInstance2 = MyClass.getSingletonOfMyClass();
        
        // Display the second instance
        System.out.println("Instance 2: " + myClassInstance2);
        
        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (myClassInstance1 == myClassInstance2));
    }
}